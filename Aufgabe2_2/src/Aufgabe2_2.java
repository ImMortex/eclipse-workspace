import java.util.Scanner;

public class Aufgabe2_2 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int laenge;
		int eingabeDezimalzahl;	
		System.out.print("Eingabe Dezimalzahl: ");
		eingabeDezimalzahl = myScanner.nextInt();		
		
		String ausgabeBinaerzahl = "";
		String memory = "";
		boolean zero = eingabeDezimalzahl == 0 || eingabeDezimalzahl == -0;
		int bitlaenge = 32 - 1; // Vorzeichenbit abgezogen

		while (eingabeDezimalzahl != -0 && eingabeDezimalzahl != 0 && eingabeDezimalzahl >= -2147483648 && eingabeDezimalzahl <= 2147483647)

		{
			if (eingabeDezimalzahl > 0) {

				memory = (eingabeDezimalzahl % 2) + memory; // Restdivision
				eingabeDezimalzahl = eingabeDezimalzahl / 2; // Division

				ausgabeBinaerzahl = "0"; // "0" als Vorzeichen Plus
				laenge = bitlaenge - (memory.length() + 1);
				for (int zaehler = 0; zaehler <= laenge; zaehler = zaehler + 1) {
					ausgabeBinaerzahl = ausgabeBinaerzahl + "0"; // Ausfüllen fehlender Nullen
				}
				ausgabeBinaerzahl = ausgabeBinaerzahl + memory;

			} else if (eingabeDezimalzahl < 0) {

				if (Math.abs(eingabeDezimalzahl) % 2 == 0) {
					memory = "1" + memory;
				} else {
					memory = "0" + memory;
				}
				;
				eingabeDezimalzahl = eingabeDezimalzahl / 2;
				ausgabeBinaerzahl = "1";
				laenge = bitlaenge - (memory.length() + 1);
				for (int zaehler = 0; zaehler <= laenge; zaehler = zaehler + 1) {
					ausgabeBinaerzahl = ausgabeBinaerzahl + "1";
				}

				ausgabeBinaerzahl = ausgabeBinaerzahl + memory;

			}

			;
		}
		
		
		
		

		if (zero)

		{
			System.out.println("B:00000000000000000000000000000000");
		} else if (eingabeDezimalzahl < -2147483648 || eingabeDezimalzahl > 2147483647) {
			System.out.println("NaN");
		} else {
			System.out.println("Einerkomplement:" + ausgabeBinaerzahl);
			myScanner.close();
		}
		;
	}
}
