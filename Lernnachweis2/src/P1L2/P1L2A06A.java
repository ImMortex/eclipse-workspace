//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import java.util.Scanner;

public class P1L2A06A {

	public static void main(String[] args) {
		/*
		 * main methode kann direkt mit einem Parameter mit der Konsole ausgef�hrt werden. Bei fehlendem
		 * Parameter �ffnet sich eine Eingabeaufforderung
		 */

		if (args.length == 1) {
			System.out.print(getQuadTreeAsString(args[0]));
		}

		else {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Eingabe polnische Notation des Quadbaums:");
			String quadTree = scanner.nextLine();

			System.out.print(getQuadTreeAsString(quadTree));
		}

	};

	public static String getQuadTreeAsString(String quadTree) {

		if (quadTree.equals(""))
			return "";

		String ausgabe = "";

		int bildGroe�e = berechneBildGroe�e(quadTree);
		char[][] feld = fuelleFeld(bildGroe�e, quadTree);

		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld.length; j++) {
				ausgabe += feld[i][j];
			}
			ausgabe += "\n";
		}

		return ausgabe;
	};

	public static char[][] fuelleFeld(int bildGroe�e, String quadTree) {

		char[][] Ausgabe = new char[bildGroe�e][bildGroe�e];

		// Array mit x oder Leerzeichen f�llen
		if (quadTree.contentEquals("B")) {
			for (int zeile = 0; zeile < bildGroe�e; zeile++) {
				for (int spalte = 0; spalte < bildGroe�e; spalte++) {
					Ausgabe[zeile][spalte] = 'X';
				}
			}
		} else {
			for (int zeile = 0; zeile < bildGroe�e; zeile++) {
				for (int spalte = 0; spalte < bildGroe�e; spalte++) {
					Ausgabe[zeile][spalte] = ' ';
				}
			}
		}

		if (quadTree.charAt(0) == 'F') {
			int index = 1;

			// 4 Kinder
			String eins = "";
			String zwei = "";
			String drei = "";
			String vier = "";

			// Kind 1

			int count = 1; /*solange count gr��er Null ist geh�rt der n�chste char im string zu dem n�chsten Teilstring */

			while (count > 0) {
				if (quadTree.charAt(index) == 'F') {
					eins = eins + quadTree.charAt(index);
					index++;
					count += 3;
				} else {
					eins = eins + quadTree.charAt(index);
					index++;
					count--;
				}
			}

			// Kind 2
			count = 1;
			while (count > 0) {
				if (quadTree.charAt(index) == 'F') {
					zwei = zwei + quadTree.charAt(index);
					index++;
					count += 3;
				} else {
					zwei = zwei + quadTree.charAt(index);
					index++;
					count--;
				}
			}

			// Kind 3
			count = 1;
			while (count > 0) {
				if (quadTree.charAt(index) == 'F') {
					drei = drei + quadTree.charAt(index);
					index++;
					count += 3;
				} else {
					drei = drei + quadTree.charAt(index);
					index++;
					count--;
				}
			}

			// Kind 4
			count = 1;
			while (count > 0) {
				if (quadTree.charAt(index) == 'F') {
					vier = vier + quadTree.charAt(index);
					index++;
					count += 3;
				} else {
					vier = vier + quadTree.charAt(index);
					index++;
					count--;
				}
			}

			// Rekursionen f�r jedes Kind
			char quadrantEins[][] = fuelleFeld(bildGroe�e / 2, eins);
			char quadrantZwei[][] = fuelleFeld(bildGroe�e / 2, zwei);
			char quadrantDrei[][] = fuelleFeld(bildGroe�e / 2, drei);
			char quadrantVier[][] = fuelleFeld(bildGroe�e / 2, vier);

			// 4 Quadranten zusammengesetzt zu einem Feld
			for (int zeile = 0; zeile < bildGroe�e / 2; zeile++) {
				for (int spalte = 0; spalte < bildGroe�e / 2; spalte++) {

					// Quadrant 1
					Ausgabe[zeile][spalte + (bildGroe�e / 2)] = quadrantEins[zeile][spalte];

					// Quadrant2
					Ausgabe[zeile][spalte] = quadrantZwei[zeile][spalte];

					// Quadrant3
					Ausgabe[zeile + (bildGroe�e / 2)][spalte] = quadrantDrei[zeile][spalte];

					// Qzadrant4
					Ausgabe[zeile + (bildGroe�e / 2)][spalte + (bildGroe�e / 2)] = quadrantVier[zeile][spalte];
				}
			}
		}
		return Ausgabe;
	}

	public static int berechneBildGroe�e(String quadTree) {
		// Diese Funktion berechnet die Breite bzw. H�he des quadratischen Bildes

		int baumEbene = 1; // auf einer baumEbene liegende Knoten haben den gleichen Vaterknoten(F)
		int hoechsteBaumEbene = 0;
		int kind = 0;

		if (quadTree.charAt(0) == 'F') {
			int index = 1;

			for (int quadrant = 1; quadrant <= 4; quadrant++) {

				int count = 1;
				baumEbene = 1;
				while (count > 0) {
					if (quadTree.charAt(index) == 'F') {
						index++;
						baumEbene++;
						count += 3;
						kind = 0;

					} else {
						kind++;
						if (baumEbene > hoechsteBaumEbene) {
							hoechsteBaumEbene = baumEbene;
						}
						if (kind == 4) {
							kind = 0;
							baumEbene--;
						}
						index++;
						count--;
					}
				}

			}
		}
		return (int) (Math.pow(2, hoechsteBaumEbene));
	}

}