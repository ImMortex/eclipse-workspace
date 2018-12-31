import java.util.Scanner;
import java.util.Random;

public class Aufgabe4_3 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe der Größe des Spielfelds: ");
		int laenge = 10;
		myScanner.close();
		int laengeMinusEins = laenge - 1;
		Random random = new Random();
		int randomInt;
		int vorherigeLuecke = -1; // -1 steht dafür, dass es keine Lücke gibt
		int randomLuecke;
		int spielfeld[][] = new int[laenge][laenge];

		for (int y = 0; y <= laengeMinusEins; y++) { // Spielfeld mit leeren Feldern ausgefüllt
			for (int x = 0; x <= laengeMinusEins; x++) {
				spielfeld[y][x] = 0;
			}
		}

		for (int y = 0; y <= laengeMinusEins; y++) {

			randomInt = random.nextInt(3);
			if (randomInt == 0) {
				randomLuecke = random.nextInt(laengeMinusEins);

				if (y == 0 && randomLuecke == 0) {
					
					for (int x = 0; x <= laengeMinusEins; x++) {
						if (x != randomLuecke) {
							spielfeld[y][x] = 1;
						}
					}
					vorherigeLuecke = randomLuecke;
				}

				else if (y != 0 && y != laengeMinusEins && (vorherigeLuecke == -1 || randomLuecke == vorherigeLuecke)) {

					for (int x = 0; x <= laengeMinusEins; x++) {
						if (x != randomLuecke) {
							spielfeld[y][x] = 1;
						}
					}
					vorherigeLuecke = randomLuecke;
					
				} else if (y == laengeMinusEins && randomLuecke == laengeMinusEins) {
					for (int x = 0; x <= laengeMinusEins; x++) {
						if (x != randomLuecke) {
							spielfeld[y][x] = 1;
						}
					}
				}

			} else {
				vorherigeLuecke = -1;
			}

		}

		// Ausgabe des Spielfelds
		for (int y = 0; y <= laengeMinusEins; y++) {
			for (int x = 0; x <= laengeMinusEins; x++) {
				System.out.print(spielfeld[y][x] + " ");
			}
			System.out.print("\n");
		}

	}

}
