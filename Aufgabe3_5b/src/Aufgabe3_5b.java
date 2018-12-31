import java.util.Scanner;

public class Aufgabe3_5b {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// Eingaben und Vorzeichen

		System.out.println("Geben sie die erste Binaerzahl ein (positiv, Betrag der Dezimalzahl, mit 0 beginnend): ");
		String eingabeBinaerzahl1 = myScanner.next();
		System.out.println("Ist die Dezimalzahl dazu negativ?");
		boolean zahl1IstNegativ = myScanner.nextBoolean();
		System.out.println("Geben sie die zweite Binaerzahl ein (positiv,Betrag der Dezimalzahl, mit 0 beginnend): ");
		String eingabeBinaerzahl2 = myScanner.next();
		System.out.println("Ist die Dezimalzahl dazu negativ?");
		boolean zahl2IstNegativ = myScanner.nextBoolean();

		int laenge = 0;

		if (eingabeBinaerzahl1.length() >= eingabeBinaerzahl2.length()) {
			laenge = (byte) eingabeBinaerzahl1.length();

		} else {
			laenge = (byte) eingabeBinaerzahl2.length();
		}
		;

		// Variablen deklarieren:

		byte uebertrag = 0;

		String zahl1Ausgabe = "";
		String zahl2Ausgabe = "";
		String merkenAusgabe = "";
		String ergebnisAusgabe = "";

		// Arrays deklarieren:

		byte zahl1[] = new byte[laenge];
		byte zahl2[] = new byte[laenge];
		byte eins[] = new byte[laenge];
		byte merken[] = new byte[laenge + 1]; // ++ heißt eigentlich Übertrag und kann weggelassen werden. Bei der
												// Berechnung kann kam entscheiden, ob es da gerade einen Übertrag gibt
												// oder nicht-> Speicheroptimierung
		String ergebnis[] = new String[laenge];

		// Arrays füllen:

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {
			if (zahl1IstNegativ) { // wenn zahl negativ, dann invertiert und in array eingelesen, sonst normal in
				// array eingelesen-> Bidung Einerkomplement
				if (i >= eingabeBinaerzahl1.length() || eingabeBinaerzahl1.charAt(i) == '0') {

					zahl1[i] = 1;
				} else {
					zahl1[i] = 0;
				}
			} else {
				if (i >= eingabeBinaerzahl1.length() || eingabeBinaerzahl1.charAt(i) == '0') {

					zahl1[i] = 0;
				} else {
					zahl1[i] = 1;
				}
			}
			;

			if (zahl2IstNegativ) {
				if (i >= eingabeBinaerzahl2.length() || eingabeBinaerzahl2.charAt(i) == '0') {

					zahl2[i] = 1;
				} else {
					zahl2[i] = 0;
				}
			} else {
				if (i >= eingabeBinaerzahl2.length() || eingabeBinaerzahl2.charAt(i) == '0') {

					zahl2[i] = 0;
				} else {
					zahl2[i] = 1;
				}
			}

			if (i < laenge - 1) { // Die Eins als Array zur Bildung des Zweierkomplements
				eins[i] = 0;
			} else {
				eins[i] = 1;
			}

		}
		;

		for (byte i = (byte) (merken.length - 1); i >= 0; i--) { // alle "Gemerkte Zahlen" auf 0 setzen
			merken[i] = 0;
		}
		;

		//++Optimieren!! falls negatives Vorzeichen-> Übertrag der letzten Ziffern auf 1 setzen -> erspart das Addieren von 1->bessere Lesbarkeit, Optimierung
		if (zahl1IstNegativ) {
			for (byte i = (byte) (laenge - 1); i >= 0; i--) {

				if (zahl1[i] + eins[i] + merken[i + 1] == 3) {
					zahl1[i] = 1;
					merken[i] = 1;
				} else if (zahl1[i] + eins[i] + merken[i + 1] == 2) {
					zahl1[i] = 0;
					merken[i] = 1;
				} else if (zahl1[i] + eins[i] + merken[i + 1] == 1) {
					zahl1[i] = 1;
					merken[i] = 0;
				} else if (zahl1[i] + eins[i] + merken[i + 1] == 0) {
					zahl1[i] = 0;
					merken[i] = 0;
				}
				;
			}
		}
		;
		if (zahl2IstNegativ) {
			for (byte i = (byte) (laenge - 1); i >= 0; i--) {

				if (zahl2[i] + eins[i] + merken[i + 1] == 3) {
					zahl2[i] = 1;
					merken[i] = 1;
				} else if (zahl2[i] + eins[i] + merken[i + 1] == 2) {
					zahl2[i] = 0;
					merken[i] = 1;
				} else if (zahl2[i] + eins[i] + merken[i + 1] == 1) {
					zahl2[i] = 1;
					merken[i] = 0;
				} else if (zahl2[i] + eins[i] + merken[i + 1] == 0) {
					zahl2[i] = 0;
					merken[i] = 0;
				}
				;
			}
		}
		;

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {

			if (zahl1[i] + zahl2[i] + merken[i + 1] == 3) {
				ergebnis[i] = "1";
				merken[i] = 1;
			} else if (zahl1[i] + zahl2[i] + merken[i + 1] == 2) {
				ergebnis[i] = "0";
				merken[i] = 1;
			} else if (zahl1[i] + zahl2[i] + merken[i + 1] == 1) {
				ergebnis[i] = "1";
				merken[i] = 0;
			} else if (zahl1[i] + zahl2[i] + merken[i + 1] == 0) {
				ergebnis[i] = "0";
				merken[i] = 0;
			}
			;
		}
		;
		if (merken[0] == 1) {

			uebertrag = 1;
		} else {

			uebertrag = 0;
		}
		;

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {
			zahl1Ausgabe = zahl1[i] + zahl1Ausgabe;
			zahl2Ausgabe = zahl2[i] + zahl2Ausgabe;
		}
		;
		zahl1Ausgabe = "  |" + zahl1Ausgabe;
		zahl2Ausgabe = " +|" + zahl2Ausgabe;

		for (byte i = (byte) (laenge); i >= 1; i--) {
			merkenAusgabe = merken[i] + merkenAusgabe;
		}

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {

			ergebnisAusgabe = ergebnis[i] + ergebnisAusgabe;
		}
		;
		merkenAusgabe = " " + merken[0] + "|" + merkenAusgabe;
		ergebnisAusgabe = "=" + uebertrag + "|" + ergebnisAusgabe;

		System.out.println(zahl1Ausgabe);
		System.out.println(zahl2Ausgabe);
		System.out.println(merkenAusgabe);
		System.out.println(ergebnisAusgabe);
	}

}