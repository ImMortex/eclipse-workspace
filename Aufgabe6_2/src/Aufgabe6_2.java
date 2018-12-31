import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Aufgabe6_2 {
	public static void main(String[] args) {
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("Eingabe byteString: ");
		// String byteString = myScanner.next();

		// 987654321987654321987654321987654321
		String byteString = "987654321000000000000000000000000";
		String ausgabe = "";

		Boolean valideEingabe = true;

		for (int stelle = 0; valideEingabe && stelle <= (byteString.length() - 1); stelle++) {
			for (int asciicode = 48; valideEingabe && asciicode <= 57; asciicode++) {
				if (byteString.charAt(stelle) == asciicode) {
					valideEingabe = true;
				} else {
					valideEingabe = false;
				}

			}
		}

		if (valideEingabe) {
			ausgabe = umrechnungZuOptimalenSpeicherangaben(byteString);
		}

		ausgabe(ausgabe, valideEingabe);
	}

	public static void ausgabe(String ausgabe, Boolean valideEingabe) {
		if (valideEingabe==true) {
			System.out.println(ausgabe);
		} else {
			System.out.println("Programm aufgrund eines Fehlers beendet");
		}

	}

	public static String umrechnungZuOptimalenSpeicherangaben(String byteString) {
		int laenge = 0;
		double zahl;
		byte darstellungsweise = 0;

		double zehnerPotenzen[] = new double[5];
		zehnerPotenzen[0] = Math.pow(10, 3);
		zehnerPotenzen[1] = Math.pow(10, 6);
		zehnerPotenzen[2] = Math.pow(10, 9);
		zehnerPotenzen[3] = Math.pow(10, 12);
		zehnerPotenzen[4] = Math.pow(10, 15);

		if (darstellungsweise == 1) {
			return darstellungAlsBinaerPraefix(byteString);

		} else

		{
			return darstellungAlsDezimalPraefix(byteString, zehnerPotenzen);
		}
	}

	public static String darstellungAlsBinaerPraefix(String byteString) {
		if (byteString.length() > 24) {
			return (byteString + " B");

		} else if (byteString.length() > 21) {
			return (byteString + " B");

		} else if (byteString.length() > 18) {
			return (byteString + " B");

		} else if (byteString.length() > 15) {
			return (byteString + " B");

		} else if (byteString.length() > 12) {
			return (byteString + " B");

		} else if (byteString.length() > 9) {
			return (byteString + " B");

		} else if (byteString.length() > 6) {
			return (byteString + " B");

		} else if (byteString.length() > 3) {
			return (byteString + " B");

		} else {
			return (byteString + " B");
		}
	}

	public static String darstellungAlsDezimalPraefix(String byteString, double[] zehnerPotenzen) {
		if (byteString.length() > 24) {
			return (einheitenUmrechnung1000(byteString, 21, " YB"));

		} else if (byteString.length() > 21) {
			return (einheitenUmrechnung1000(byteString, 18, " ZB"));

		} else if (byteString.length() > 18) {
			return (einheitenUmrechnung1000(byteString, 15, " EB"));

		} else if (byteString.length() > 15) {
			return (einheitenUmrechnung1000(byteString, 12, " PB"));

		} else if (byteString.length() > 12) {
			return (einheitenUmrechnung1000(byteString, 9, " TB"));

		} else if (byteString.length() > 9) {
			return (einheitenUmrechnung1000(byteString, 6, " GB"));

		} else if (byteString.length() > 6) {
			return (einheitenUmrechnung1000(byteString, 3, " MB"));

		} else if (byteString.length() > 3) {
			return (einheitenUmrechnung1000(byteString, 0, " KB"));

		} else {
			return (byteString + " B");
		}
	}

	public static String einheitenUmrechnung1000(String byteString, int ueberlauf, String einheit) {
		String vorkommastellen = "";
		String nachkommastellen = "";
		vorkommastellen = byteString.substring(0, byteString.length() - 3 - ueberlauf);
		nachkommastellen = byteString.substring(vorkommastellen.length(), byteString.length() - ueberlauf);
		vorkommastellen = vorkommastellen + ".";
		return (vorkommastellen + nachkommastellen + einheit);
	}

	public static String[] stringZerlegen(String byteString, String[] teilstring) {
		int intLaenge = 16;
		String[] teile = new String[2];
		String teil = "";
		if (byteString.length() <= intLaenge) {
			return teile;
		}

		teile[0] = byteString.substring(0, byteString.length() - 1 - intLaenge);
		teile[1] = byteString.substring(byteString.length() - 1 - intLaenge, byteString.length() - 1);

		return teile;
	}

}
