import java.util.Scanner;

public class Aufgabe2_2b {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String eingabeBinaerzahl;
		System.out.print("Eingabe Bin�rzahl:");
		eingabeBinaerzahl = myScanner.next();

		long ausgabeDezimalzahl = 0;
		long bitlaenge = 64l;
		bitlaenge--;

		
		
		for (long zaehler = bitlaenge; zaehler > 0; zaehler--) {
			if (eingabeBinaerzahl.charAt((int)zaehler) == '1') {
				ausgabeDezimalzahl = ausgabeDezimalzahl + ((long) (Math.pow(2, bitlaenge - zaehler)));
			} else {
				ausgabeDezimalzahl = ausgabeDezimalzahl + 0;
			}

		}
		System.out.print("Ausgabe:" + ausgabeDezimalzahl);

		// } else {
		// System.out.println("Fehler: Die einegebene Bin�rzahl muss " + bitlaenge + "
		// Bits lang sein!");
		// }
		// ;

		myScanner.close();
	}
}
