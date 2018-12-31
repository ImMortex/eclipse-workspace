
public class Aufgabe5_7 {
	public static void main(String[] args) {
		int bonusfeld[][] = { { 8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8 },
				{ 49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0 },
				{ 81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65 },
				{ 52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91 },
				{ 22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80 },
				{ 24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50 },
				{ 32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70 },
				{ 67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21 },
				{ 24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72 },
				{ 21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95 },
				{ 78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92 },
				{ 16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57 },
				{ 86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58 },
				{ 19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40 },
				{ 4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66 },
				{ 88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69 },
				{ 4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36 },
				{ 20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16 },
				{ 20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54 },
				{ 1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48 } };

		errechneGroeßtmoeglichesProdukt(bonusfeld);
	}

	public static void errechneGroeßtmoeglichesProdukt(int[][] bonusfeld) {
		/*
		 * Es ist ein Bonusfeld gegeben. In dieserMethode wird das größtmögliche Produkt
		 * von 4 sich linear aneinander befindlichen Zahlen ermittelt. Dazu wird jede
		 * mögliche Koordinate ein Ausgangspunkt bestimmt. Von diesem Punkt aus wird in
		 * die 8 verschiedene Rchtungen geschaut, ob die Zahlen, welche in dieser
		 * Richtung liegen (Ausgangspunkt eingeschlossen), das größte Produkt bilden. Da
		 * bei jeder zweiten Richtung das Gleiche Produkt berechnet werden würde, nehmen
		 * wir nur folgende 4 Richtungen: waagerecht, senkrecht, diagonal fallend und
		 * diagonal steigend.
		 */
		int[] werte = new int[8];
		werte[6] = 0;
		// ganzes Bonusfeld mittels Doppelschleife abgesucht
		for (int xKoordinate = 0; xKoordinate <= bonusfeld[0].length - 1; xKoordinate++) {// x Koordinaten
			for (int yKoordinate = 0; yKoordinate <= bonusfeld[0].length - 1; yKoordinate++) {// y Koordinaten

				for (byte richtungID = 0; richtungID <= 3; richtungID++) {// für die vier Richtungen
					werte = groeßtesProduktFürEineRichtungBerechnen(richtungID, bonusfeld, werte, xKoordinate,
							yKoordinate);
				}
			}
		}
		ausgabeDerWerte(werte);
	}

	public static int[] groeßtesProduktFürEineRichtungBerechnen(byte richtungID, int[][] bonusfeld, int[] werte,
			int xKoordinate, int yKoordinate) {
		/*
		 * Diese Methode testet die einzelnen Möglichkeiten durch, wie die vier Punkte
		 * liegen können und bestimmt das größte Produkt, indem mit dem Produkt aus dem
		 * vorherigen Schleifendurchlauf verglichen wird und das größere gespeichert
		 * wird. Für die vier Möglichkeiten der Lage der Punkte werden jeweils ein
		 * faktorX und ein faktorY bestimmt, ums die Richtung der Suche anzugeben.
		 */
		int zahlen[] = { 0, 0, 0, 0 };
		int groeßteZahl = werte[6];
		boolean bedingung = false;
		byte faktorY = 0;
		byte faktorX = 0;
		/*
		 * bei jeder Möglichkeit der Lage der Punkte müssen jeweilige Bedingungen
		 * erfüllt werden, damit keine Werte außerhalb des Bonusfeldes beachtet werden.
		 */
		if (richtungID == 0) {// wenn waagerecht
			faktorY = 0;
			faktorX = 1;
			bedingung = xKoordinate <= bonusfeld[0].length - 1 - 4;
		} else if (richtungID == 1) {// wenn senkrecht
			faktorY = 1;
			faktorX = 0;
			bedingung = yKoordinate <= bonusfeld[0].length - 1 - 4;
		} else if (richtungID == 2) {// wenn diagonal fallend
			faktorY = 1;
			faktorX = 1;
			bedingung = (yKoordinate <= bonusfeld[0].length - 1 - 4 && xKoordinate <= bonusfeld[0].length - 1 - 4);
		} else if (richtungID == 3) {// wenn diagonal steigend
			faktorY = -1;
			faktorX = 1;
			bedingung = (yKoordinate >= 0 + 3 && xKoordinate <= bonusfeld[0].length - 1 - 4);
		}
		if (bedingung) {
			for (int zahl = 0; zahl <= 3; zahl++) {
				zahlen[zahl] = bonusfeld[yKoordinate + (zahl * faktorY)][xKoordinate + (zahl * faktorX)];
			}
			if (produktVierZahlen(zahlen[0], zahlen[1], zahlen[2], zahlen[3]) >= groeßteZahl) {
				groeßteZahl = produktVierZahlen(zahlen[0], zahlen[1], zahlen[2], zahlen[3]);
				werte[0] = zahlen[0];
				werte[1] = zahlen[1];
				werte[2] = zahlen[2];
				werte[3] = zahlen[3];
				werte[4] = xKoordinate;
				werte[5] = yKoordinate;
				werte[6] = groeßteZahl;
				werte[7] = richtungID;
			}
		}
		return werte;
	}

	public static void ausgabeDerWerte(int[] werte) {
		/*
		 * Diese Methode gibt die gespeicherten Werte aus, welche zum größten Produkt
		 * gehören
		 */
		String lageBezeichnung = "";
		switch (werte[7]) {
		case 0:
			lageBezeichnung = "Lage: waagerecht";
			break;
		case 1:
			lageBezeichnung = "Lage: senkrecht";
			break;
		case 2:
			lageBezeichnung = "Lage: diagonal fallend";
			break;
		case 3:
			lageBezeichnung = "Lage: diagonal steigend";
			break;
		}
		System.out.println("Koordinaten des Ausgangspunktes: x: " + werte[4] + " y: " + werte[5]);
		System.out.println(lageBezeichnung);
		System.out.println("Zahlen: " + werte[0] + " " + werte[1] + " " + werte[2] + " " + werte[3]);
		System.out.println("Produkt: " + werte[6]);
	}

	public static int produktVierZahlen(int zahl1, int zahl2, int zahl3, int zahl4) {
		int produkt = zahl1 * zahl2 * zahl3 * zahl4;
		return produkt;
	}

}
