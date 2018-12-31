
public class Aufgabe3_5 {
	public static void main(String[] args) {
		byte zahl1[] = { 1, 0, 0, 0, 1, 1, 0, 0 };
		byte zahl2[] = { 1, 0, 1, 1, 1, 1, 0, 0 };
		int laenge = 0;

		if (zahl1.length >= zahl2.length) {
			laenge = (byte) zahl1.length;

		} else {
			laenge = (byte) zahl2.length;

		}
		;

		byte merken[] = new byte[laenge + 1];
		for (byte i = (byte) (merken.length - 1); i >= 0; i--) {
			merken[i] = 0;
		}
		byte uebertrag = 0;
		String ergebnis[] = new String[laenge];
		String eingabe1 = "";
		String eingabe2 = "";
		String merkenAusgabe = "";
		String ergebnisAusgabe = "";

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {

			if (zahl1[i] + zahl2[i] + merken[i + 1] == 3) {
				ergebnis[i] = "1";
				merken[i] = 1;
			} else if (zahl1[i] + zahl2[i] + merken[i + 1] == 2) {
				ergebnis[i] = "0";
				merken[i] = 1;
			} else if (zahl1[i] + zahl2[i] + merken[i + 1] == 1) {
				ergebnis[i] = "1";
				merken[i] = 0;
			} else if (zahl1[i] + zahl2[i] + merken[i + 1] == 0) {
				ergebnis[i] = "0";
				merken[i] = 0;
			}
			;
		}
		;
		if (merken[0] == 1) {
			ergebnis[0] = "1";
			uebertrag = 1;
		} else {
			ergebnis[0] = "";
			uebertrag = 0;
		}
		;

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {
			eingabe1 = zahl1[i] + eingabe1;
			eingabe2 = zahl2[i] + eingabe2;
		}
		;
		eingabe1 = "  |" + eingabe1;
		eingabe2 = " +|" + eingabe2;

		for (byte i = (byte) (laenge); i >= 1; i--) {
			merkenAusgabe = merken[i] + merkenAusgabe;
		}

		for (byte i = (byte) (laenge - 1); i >= 0; i--) {

			ergebnisAusgabe = ergebnis[i] + ergebnisAusgabe;
		}
		;
		merkenAusgabe = " " + merken[0] + "|" + merkenAusgabe;
		ergebnisAusgabe = "=" + uebertrag + "|" + ergebnisAusgabe;

		System.out.println(eingabe1);
		System.out.println(eingabe2);
		System.out.println(merkenAusgabe);
		System.out.println(ergebnisAusgabe);
	}
}
