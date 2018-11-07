import java.util.Scanner;

public class Aufgabe3_3 {
	public static void main(String[] args) {
		byte bits = 8;
		byte bitlaenge = (byte) (bits - 1);
		String fehlerAusgabe1 = "inkorrekte Zahlendarstellung";
		String zielZahl = "";
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe einer Zahl: ");
		String zahl = myScanner.next();
		System.out.println("Eingabe der Basis der Zahl: ");
		byte basis = myScanner.nextByte();
		byte memory = 0;
		int powBasis;

		if (basis == 10) {
			if ((zahl.startsWith("-")) == false && (zahl.startsWith("0")) == false) {

				System.out.println("Eingabe der Zielbasis der Konvertierung: ");
				byte zielbasis = myScanner.nextByte();
				myScanner.close();

				if (zielbasis == basis) {
					System.out.println("Die gesuchte Zahl ist: " + zahl);
				} else {
					
					for (byte i = 0; i <= zahl.length()-1; i++) {

						memory = (byte)(memory + (zahl.charAt(i) * (Math.pow(basis, i))));
						System.out.println(zahl.charAt(i));
					};
					System.out.println((zahl.charAt(0) * (Math.pow(basis, 0))));
					
					for (byte i = (byte) (zahl.length() + 1); i > 0; i--) {

						zielZahl = (memory % zielbasis) + zielZahl;
						memory = (byte)(memory / 2);
					}

					System.out.println("Die gesuchte Zahl ist: " + zielZahl);

				}
			} else {
				System.out.println(fehlerAusgabe1);
			}
		}
	}
}
