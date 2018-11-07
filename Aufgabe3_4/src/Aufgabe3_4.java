import java.util.Scanner;

public class Aufgabe3_4 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe römische Zahl: ");
		String roemischeZahl = myScanner.next();
		myScanner.close();
		int dezimalzahl = 0;
		boolean korrekteEingabe = true;
		int anzahlI = 0;
		int anzahlV = 0;
		int anzahlX = 0;
		int anzahlL = 0;
		int anzahlC = 0;
		int anzahlD = 0;
		int anzahlM = 0;

		for (int zaehler = 0; zaehler <= roemischeZahl.length() - 1; zaehler++) {
			// Steht I vor einem X?
			if (roemischeZahl.charAt(zaehler) == 'I' && zaehler <= roemischeZahl.length() - 2
					&& roemischeZahl.charAt(zaehler + 1) == 'V') {
				anzahlI++;
				anzahlV++;
				zaehler++;
				dezimalzahl = dezimalzahl + (5 - 1);
			} else if (roemischeZahl.charAt(zaehler) == 'I' && zaehler <= roemischeZahl.length() - 2
					&& roemischeZahl.charAt(zaehler + 1) == 'X') {
				anzahlI++;
				anzahlX++;
				zaehler++;
				dezimalzahl = dezimalzahl + (10 - 1);
			} else if (roemischeZahl.charAt(zaehler) == 'I') {
				anzahlI++;
				dezimalzahl = dezimalzahl + 1;
			}

			else if (roemischeZahl.charAt(zaehler) == 'V') {
				anzahlV++;
				dezimalzahl = dezimalzahl + 5;
			}

			else if (roemischeZahl.charAt(zaehler) == 'X' && zaehler <= roemischeZahl.length() - 2
					&& roemischeZahl.charAt(zaehler + 1) == 'L') {
				anzahlX++;
				anzahlL++;
				zaehler++;
				dezimalzahl = dezimalzahl + (50 - 10);
			} else if (roemischeZahl.charAt(zaehler) == 'X' && zaehler <= roemischeZahl.length() - 2
					&& roemischeZahl.charAt(zaehler + 1) == 'C') {
				anzahlX++;
				anzahlC++;
				zaehler++;
				dezimalzahl = dezimalzahl + (100 - 10);
			} else if (roemischeZahl.charAt(zaehler) == 'X') {
				anzahlX++;
				dezimalzahl = dezimalzahl + 10;
			}

			else if (roemischeZahl.charAt(zaehler) == 'L') {
				anzahlL++;
				dezimalzahl = dezimalzahl + 50;
			}

			else if (roemischeZahl.charAt(zaehler) == 'C' && zaehler <= roemischeZahl.length() - 2
					&& roemischeZahl.charAt(zaehler + 1) == 'D') {
				anzahlC++;
				anzahlD++;
				zaehler++;
				dezimalzahl = dezimalzahl + (500 - 100);
			} else if (roemischeZahl.charAt(zaehler) == 'C' && zaehler <= roemischeZahl.length() - 2
					&& roemischeZahl.charAt(zaehler + 1) == 'M') {
				anzahlC++;
				anzahlM++;
				zaehler++;
				dezimalzahl = dezimalzahl + (1000 - 100);
			} else if (roemischeZahl.charAt(zaehler) == 'C') {
				anzahlC++;
				dezimalzahl = dezimalzahl + 100;
			} 
			
			else if (roemischeZahl.charAt(zaehler) == 'D') {
				anzahlD++;
				dezimalzahl = dezimalzahl + 500;
			} else if (roemischeZahl.charAt(zaehler) == 'M') {
				anzahlM++;
				dezimalzahl = dezimalzahl + 1000;
			} else {
				System.out.println("Diese römische Zahl gibt es nicht!");
				korrekteEingabe = false;
				break;
			}
			;

		}
		if (korrekteEingabe == true) {
			System.out.println("Die Dezimalzahl ist: " + dezimalzahl);

			
		}
	};

}
