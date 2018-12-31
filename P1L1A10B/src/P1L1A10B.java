import java.util.Scanner;

public class P1L1A10B {

	public static void main(String[] args) {

		// Vorsicht bei Eingabe von groﬂen Zahlen. Die Berechnungszeit w‰chst bei
		// wachsender Breite ca. exponentiell!

		System.out.println("Ungerade Breite der Krone eingeben:");

		Scanner meinScanner = new Scanner(System.in);
		int breite = meinScanner.nextInt();
		meinScanner.close();

		if (breite < 5) {
			/*
			 * unter 5 kˆnnen keine Sterne mehr dargsestellt werden, was gegen eine Aussage
			 * in der Aufgabenstellung verstoﬂen w¸rde
			 */
			System.out.println("Fehler 1: Die Krone muss mindestens 5 breit sein!");
		} else if (breite % 2 == 0) {
			System.out.println("Fehler 2: Die Krone kann nicht schief sein. Geben sie eine ungerade Breite ein.");
		} else {

			int hoehe = breite / 2;
			char[][] krone = erstelleKrone(breite, hoehe);
			ausgabeDerKrone(breite, hoehe, krone);
		}

	}

	public static void ausgabeDerKrone(int breite, int hoehe, char[][] krone) {
		for (int spalte = 0; spalte <= hoehe - 1; spalte++) {
			for (int zeile = 0; zeile <= breite - 1; zeile++) {

				System.out.print(krone[spalte][zeile] + " ");
			}
			System.out.print("\n");
		}
	}

	public static char[][] erstelleKrone(int breite, int hoehe) {

		char[][] krone = new char[hoehe][breite];

		// 3 Spitzen/ Sterne
		krone[0][0] = '*';
		krone[0][hoehe] = '*';
		krone[0][breite - 1] = '*';

		// Zacken links
		for (int index = 1; index <= hoehe - 1; index++) {
			for (int zeile = 0; zeile <= index - 1; zeile++) {
				krone[index][zeile] = '0';
			}
		}

		// Zacken mittig
		for (int index = 1; index <= hoehe - 1; index++) {
			for (int zeile = hoehe + 1 - index; zeile <= breite - hoehe - 2 + index; zeile++) {
				krone[index][zeile] = '0';
			}
		}

		// Zacken rechts
		for (int index = 1; index <= hoehe - 1; index++) {
			for (int zeile = breite - index; zeile <= breite - 1; zeile++) {
				krone[index][zeile] = '0';
			}
		}

		// X-Reihe
		for (int zeile = 0; zeile <= breite - 1; zeile++) {
			krone[hoehe - 1][zeile] = 'X';
		}

		return krone;
	}

}
