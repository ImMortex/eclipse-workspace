//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import java.util.Random;
import java.util.Scanner;

public class P1L2A05C {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] werte = anzahlSpielkartenFestlegen(myScanner);
		int height = werte[0];
		int width = werte[1];
		int[][] playground = createMemory(height, width);
		System.out.print(getPlaygroundAsString(playground));

		spielverlauf(myScanner, height, width, playground);
	}

	public static int[] anzahlSpielkartenFestlegen(Scanner myScanner) {
		// in dieser Funktion legt der Nutzer die Anzahl an Spielkarten fest
		int height = 0;
		int width = 0;
		boolean kartenanzahlgefunden = false;
		while (!kartenanzahlgefunden) {
			System.out.println("Kartenanzahl (natürliche Zahl, bei der i * i/2 = Kartenanzahl <= 1998): ");
			int numberOfCards = myScanner.nextInt();
			myScanner.nextLine();// notwendig da der scanner sonst in einer falschen zeile lesen würde und
									// nextInt nicht die zeile zuende liest
			if (isAllowedDimensions(numberOfCards)) {
				kartenanzahlgefunden = true;
				int[] ausmaße = berechneHoeheUndBreite(numberOfCards);
				height = ausmaße[0];
				width = ausmaße[1];
			} else {
				System.out
						.println("Eingebene Kartenanzahl ist ungültig. Bitte versuchen Sie eine andere Kartenanzahl.");
			}
		}

		int[] werte = { height, width };
		return werte;
	}

	public static int[] berechneHoeheUndBreite(int numberOfCards) {
		// in dieser Funktion werden Anzahl Kartenreihen und Karten je Reihe bestimmt
		for (int index = 1; index <= numberOfCards; index++) {
			if (index * index * 2 == numberOfCards) {
				int[] Ausgabe = { index, index * 2 };
				return Ausgabe;
			}
		}
		return null;
	}

	public static void spielverlauf(Scanner myScanner, int height, int width, int[][] playground) {
//in dieser Methode läuft das Spiel ab, d.h. der Nutzer spielt
		boolean spiellaeuft = true;
		while (spiellaeuft) {
			Boolean koordinatenPassenInSpielfeld = true;
			System.out.println("Wählen sie die Koordinaten von zwei Karten aus(Form:x1 y1 x2 y2):");

			String koordinatenEingabe = myScanner.nextLine();
			String[] KoordinatenFeld = koordinatenEingabe.split(" ");
			Boolean ausreichendeAnzahlKoordinaten = (!koordinatenEingabe.isEmpty() && KoordinatenFeld.length == 4);

			if (ausreichendeAnzahlKoordinaten) {

				if (koordinatenSindZiffern(KoordinatenFeld)) {
					// Eingabe von Koordinaten von Karten verarbeiten
					int x1 = Integer.parseInt(KoordinatenFeld[0]);
					int y1 = Integer.parseInt(KoordinatenFeld[1]);
					int x2 = Integer.parseInt(KoordinatenFeld[2]);
					int y2 = Integer.parseInt(KoordinatenFeld[3]);
					koordinatenPassenInSpielfeld = (x1 < height && x2 < height && y1 < width && y2 < width);

					if (koordinatenPassenInSpielfeld) {
						ausgewaelteKartenUmdrehen(playground, x1, y1, x2, y2);
						System.out.print(getPlaygroundAsString(playground));
						ausgewaelteKartenUmdrehen(playground, x1, y1, x2, y2);
						playground = updatePlayground(playground, x1, y1, x2, y2);

						Boolean gewonnen = alleKartenAufgedeckt(playground);
						if (gewonnen) {
							spiellaeuft = false;
							System.out.println("Spiel komplett geloest.");
						}
					} else {
						System.out.println(
								"Einige Koordinaten sind zu groß für das Spielfeld. \nBitte geben Sie an den betreffenden Stellen kleinere Werte ein.");
					}
				} else {
					System.out.println(
							"Die Koordinaten sollen aus den Ziffern 0 bis 9 bestehen. Bitte korrigieren Sie Ihre Eingabe");
				}
			} else {
				System.out.println("Unzurechende Anzahl an Koordinaten. Bitte Versuchen Sie es noch einmal");
			}
		}
		myScanner.close();
	}

	private static void ausgewaelteKartenUmdrehen(int[][] playground, int x1, int y1, int x2, int y2) {
		// ausgesuchte Karten umgedreht anzeigen
		playground[x1][y1] = playground[x1][y1] * -1;
		playground[x2][y2] = playground[x2][y2] * -1;
	}

	private static Boolean alleKartenAufgedeckt(int[][] playground) {
		// diese Klasse stellt fest, ob alle Karten aufgedeckt sind
		Boolean alleNegativ = true;
		for (int x = 0; x < playground.length && alleNegativ; x++) {
			for (int y = 0; y < playground[0].length && alleNegativ; y++) {
				if (playground[x][y] > 0) {
					alleNegativ = false;
				}
			}
		}
		return alleNegativ;
	}

	public static Boolean koordinatenSindZiffern(String[] KoordinatenFeld) {
		Boolean koordinatenSindZiffern = true;

		for (int koordinate = 0; koordinate < 4 && koordinatenSindZiffern; koordinate++) {
			for (int index = 0; index < KoordinatenFeld[koordinate].length() && koordinatenSindZiffern; index++) {
				koordinatenSindZiffern = false;
				for (int asciiCode = 48; asciiCode <= 57; asciiCode++) {

					if (KoordinatenFeld[koordinate].charAt(index) == asciiCode) {
						koordinatenSindZiffern = true;
					}
				}
			}
		}
		return koordinatenSindZiffern;
	}

	public static boolean isAllowedDimensions(int numberOfCards) {
		/*
		 * Diese Funktion prüft, ob das Spielfeld bei gegebener Anzahl von Karten
		 * doppelt so breit wie hoch ist
		 */

		if (numberOfCards > 1 && numberOfCards <= 1998 && numberOfCards % 2 == 0) {
			for (int index = 1; index <= numberOfCards; index++) {
				if (index * index * 2 == numberOfCards) {
					return true;
				}
			}
		}
		return false;
	}

	public static int[][] createMemory(int height, int width) {

		int[][] playground = new int[height][width];

		Random zufall = new Random();

		int[] benutzteZahlen = new int[(width * height) / 2];
		int count = 0;
		int rng = 0;

		for (int i = 0; i < width * height / 2; i++) {
			boolean zahlBenutzt = true;

			rng = zufall.nextInt(999) + 1;

			while (zahlBenutzt) {
				zahlBenutzt = false;

				for (int index = 0; index < benutzteZahlen.length; index++) {
					if (benutzteZahlen[index] == rng) {
						rng = zufall.nextInt(999) + 1;
						zahlBenutzt = true;
					}
				}

			}
			benutzteZahlen[count] = rng;
			count++;

			for (int karte = 0; karte < 2; karte++) {
				int x = zufall.nextInt(height);
				int y = zufall.nextInt(width);
				while (playground[x][y] != 0) {
					x = zufall.nextInt(height);
					y = zufall.nextInt(width);
				}
				playground[x][y] = rng;
			}
		}
		return playground;
	}

	public static int[][] updatePlayground(int[][] playground, int position0i, int position0j, int position1i,
			int position1j) {
		if (playground[position0i][position0j] < 0 || playground[position1i][position1j] < 0) {
			return playground;
		}
		if (playground[position0i][position0j] != playground[position1i][position1j]) {
			return playground;
		}
		playground[position0i][position0j] *= -1;
		playground[position1i][position1j] *= -1;
		return playground;
	}

	public static String getPlaygroundAsString(int[][] playground) {
		String Ausgabe = "";
		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[0].length; j++) {
				if (playground[i][j] > 0) {
					Ausgabe = Ausgabe + "XXX ";
				} else if (playground[i][j] > -10) {
					Ausgabe = Ausgabe + "  " + playground[i][j] * -1 + " ";
				} else if (playground[i][j] > -100) {
					Ausgabe = Ausgabe + " " + playground[i][j] * -1 + " ";
				} else {
					Ausgabe = Ausgabe + playground[i][j] * -1 + " ";
				}

			}
			Ausgabe = Ausgabe.substring(0, Ausgabe.length() - 1) + "\n";

			if (i < playground.length - 1) {
				Ausgabe += "\n";
			}
		}
		return Ausgabe;
	}
}
