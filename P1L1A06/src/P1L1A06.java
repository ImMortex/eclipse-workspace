import java.util.Scanner;

public class P1L1A06 {
	public static void main(String[] args) {
		Scanner meinScanner = new Scanner(System.in);
		System.out.print("Eingabe der ersten Zeichenkette: ");
		String zeichenkette1 = meinScanner.nextLine();
		System.out.print("Eingabe der zweiten Zeichenkette: ");
		String zeichenkette2 = meinScanner.nextLine();
		meinScanner.close();

		String teilstring = "";
		String laengsterTeilstring = "";

		teilstring = gemeinsamesZeichenFinden(zeichenkette1, zeichenkette2, teilstring, laengsterTeilstring);
		System.out.println("\nAusgabe des längsten gemeinsamen Teilstrings: " + teilstring);
	}

	public static String gemeinsamesZeichenFinden(String zeichenkette1, String zeichenkette2, String teilstring,
			String laengsterTeilstring) {

		/*
		 * Doppelschleife: jedes Zeichen in Zeichenkette1 wird mit jedem Zeichen der
		 * Zeichenkette2 verglichen
		 */
		for (int positionZeichenInZeichenkette1 = 0; positionZeichenInZeichenkette1 <= zeichenkette1.length()
				- 1; positionZeichenInZeichenkette1++) {
			for (int positionZeichenInZeichenkette2 = 0; positionZeichenInZeichenkette2 <= zeichenkette2.length()
					- 1; positionZeichenInZeichenkette2++) {

				if (gleichheit(zeichenkette1.charAt(positionZeichenInZeichenkette1),
						zeichenkette2.charAt(positionZeichenInZeichenkette2))) {

					/*
					 * Wenn Zeichen in Zeichenkette1 und Zeichenkette2 identische Zeichen oder
					 * Großbuchstaben sind -> Teilstring Hinzufügen. Wenn es aber ein Großbuchstabe
					 * und ein Kleinbuchstabe sind, dann wird nur die Kleinschreibung davon dem
					 * Teilstring hinzugefügt (zur Schönheit der Ausgabe):
					 */
					if (zeichenkette1.charAt(positionZeichenInZeichenkette1) == zeichenkette2
							.charAt(positionZeichenInZeichenkette2)) {
						teilstring += zeichenkette1.charAt(positionZeichenInZeichenkette1);
					} else {
						teilstring += ((zeichenkette1.charAt(positionZeichenInZeichenkette1) + "").toLowerCase());
					}

					// nur der größere Teilstring soll zurückgegeben werden:
					if (teilstring.length() >= laengsterTeilstring.length()) {
						laengsterTeilstring = teilstring;
					}

					/*
					 * wenn gleiches Zeichen (1) gefunden und Zeichekette1 noch nicht am Ende, dann
					 * wird das nächste Zeichen (2) der Zeichenkette1 mit allen Buchstaben der
					 * Zeichenkette2 verglichen -> Suchabbruch für Vergleich mit derzeitigem Zeichen
					 * aus Zeichekette1, damit >=1 gleiche Zeichen gefunden werden können +
					 * Optimierung:
					 */
					if (positionZeichenInZeichenkette1 + 1 <= zeichenkette1.length() - 1) {
						positionZeichenInZeichenkette1++;
					}

				} else {
					teilstring = "";
				}

			}
		}

		return laengsterTeilstring;
	}

	public static boolean gleichheit(char zeichen1, char zeichen2) {

		// Diese Funktion prüft auf Gleichheit zweier characters und ignoriert dabei
		// Groß- und Kleinschreibung. zB.: A==a -> true

		if ((zeichen1 >= 65 && zeichen1 <= 90)
				&& ((zeichen1 == zeichen2) || (zeichen1 == (char) (zeichen2 - 32)))) /* Groß-Groß oder Groß-klein */ {
			return true;

		} else if ((zeichen1 >= 97 && zeichen1 <= 122)
				&& ((zeichen1 == zeichen2) || (zeichen1 == (char) (zeichen2 + 32))))/* Klein-Klein oder Klein-Groß */ {
			return true;
		} else if (zeichen1 == zeichen2) /*
											 * alle verbleibenden Zeichen des ASCII-Codes, welche keine Unterscheidung
											 * von Groß- und Kleinschreibung haben
											 */ {
			return true;
		}

		return false;

	}

}
