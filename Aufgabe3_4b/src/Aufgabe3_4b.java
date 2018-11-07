import java.util.Scanner;

public class Aufgabe3_4b {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe Dezimalzahl: ");
		int dezimalzahl = myScanner.nextInt();
		myScanner.close();
		
		if (dezimalzahl>=1 && dezimalzahl<=3999) {
		String roemischeZahl = "";

		int anzahlM = 0;
		boolean vorhandenCM = false;
		boolean vorhandenD = false;
		boolean vorhandenCD = false;
		int anzahlC = 0;
		boolean vorhandenXC = false;
		boolean vorhandenL = false;
		boolean vorhandenXL = false;
		int anzahlX = 0;
		boolean vorhandenIX = false;
		boolean vorhandenV = false;
		boolean vorhandenIV = false;
		int anzahlI = 0;

		// Berrechnung der Anzahl der jeweiligen roemischen Zeichen:

		if (dezimalzahl >= 1000) {
			anzahlM = dezimalzahl / 1000; // M 1000er
			dezimalzahl = dezimalzahl % 1000;
		}

		if (dezimalzahl >= 900) {
			vorhandenCM = true; // CM 900er
			dezimalzahl = dezimalzahl - 900;
		} else {

			if (dezimalzahl >= 500) {
				vorhandenD = true; // D 500er
				dezimalzahl = dezimalzahl - 500;
			}
			if (dezimalzahl >= 400) {
				vorhandenCD = true; // CD 400er
				dezimalzahl = dezimalzahl - 400;
				;
			} else {

				if (dezimalzahl >= 100) {
					anzahlC = dezimalzahl / 100; // C 100er
					dezimalzahl = dezimalzahl % 100;
					;
				}
			}
		}

		if (dezimalzahl >= 90) {
			vorhandenXC = true; // XC 90er
			dezimalzahl = dezimalzahl - 90;
		} else {

			if (dezimalzahl >= 50) {
				vorhandenL = true; // L 50er
				dezimalzahl = dezimalzahl - 50;
			}
			if (dezimalzahl >= 40) {
				vorhandenXL = true; // XL 40er
				dezimalzahl = dezimalzahl - 40;
			} else {

				if (dezimalzahl >= 10) {
					anzahlX = dezimalzahl / 10; // X 10er
					dezimalzahl = dezimalzahl % 10;
				}
			}
		}

		if (dezimalzahl >= 9) {
			vorhandenIX = true; // IX 9er
			dezimalzahl = dezimalzahl - 9;
		} else {

			if (dezimalzahl >= 4) {
				vorhandenIV = true; // IV 4er
				dezimalzahl = dezimalzahl - 4;
			} else {

				if (dezimalzahl >= 5) {
					vorhandenV = true; // V 5er
					dezimalzahl = dezimalzahl - 5;
				}
			}
		}

		anzahlI = dezimalzahl; // I 1er

		// Zusammenfügen der Anzahl der jeweiligen roemischen Zeichen:

		for (byte zaehler = 0; zaehler <= anzahlM - 1; zaehler++) { // Schleife für die M 1000er
			roemischeZahl = roemischeZahl + "M";
		}
		if (vorhandenCM) {
			roemischeZahl = roemischeZahl + "CM";
		}
		;
		if (vorhandenD) {
			roemischeZahl = roemischeZahl + "D";
		}
		;
		if (vorhandenCD) {
			roemischeZahl = roemischeZahl + "CD";
		}
		;
		for (byte zaehler = 0; zaehler <= anzahlC - 1; zaehler++) { // Schleife für die C 100er
			roemischeZahl = roemischeZahl + "C";
		}
		if (vorhandenXC) {
			roemischeZahl = roemischeZahl + "XC";
		}
		;
		if (vorhandenXL) {
			roemischeZahl = roemischeZahl + "XL";
		}
		;
		if (vorhandenL) {
			roemischeZahl = roemischeZahl + "L";
		}
		;
		if (vorhandenIX) {
			roemischeZahl = roemischeZahl + "IX";
		}
		;
		for (byte zaehler = 0; zaehler <= anzahlX - 1; zaehler++) { // Schleife für die X 10er
			roemischeZahl = roemischeZahl + "X";
		}
		if (vorhandenIV) {
			roemischeZahl = roemischeZahl + "IV";
		}
		;
		if (vorhandenV) {
			roemischeZahl = roemischeZahl + "V";
		}
		;
		for (byte zaehler = 0; zaehler <= anzahlI - 1; zaehler++) { // Schleife für die I 1er
			roemischeZahl = roemischeZahl + "I";
		}

		System.out.println("Die römische Zahlendarstellung dazu lautet: " + roemischeZahl); // Ausgabe
		}else
		{System.out.println("Ungültige Zahl. Die Dezimalzahl muss positiv ganzzahlig >=1 und <=3999 sein.");}
	}
}
