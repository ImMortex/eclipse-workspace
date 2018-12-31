import java.util.Scanner;
import java.util.Random;

public class Aufgabe5_5 {
	public static void main(String[] args) {
		int laengePalindrom = eingabeDerPalindromlaenge();
		String palindrom = erstellePalindrom(laengePalindrom);
		ausgabePalindrom(palindrom);
	}

	public static int eingabeDerPalindromlaenge() {
		/*
		 * diese Methode übernimmt das Eingeben der Länge des Palindroms
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe der Länge des Palindroms:");
		int laenge = myScanner.nextInt();
		myScanner.close();
		return laenge;
	}

	public static char zufaelligesZeichen() {

		/*
		 * diese Methode erstellt einen zufälligen Charakter (ein Großbuchstabe oder ein
		 * Kleinbuchstabe oder eine Zahl)
		 */
		Random random = new Random();
		char myChar = ' ';
		int fall = (0 + random.nextInt(3));
		switch (fall) {
		case (0): {
			myChar = (char) (65 + random.nextInt(26));
			break;
		}
		case (1): {
			myChar = (char) (97 + random.nextInt(26));
			break;
		}
		case (2): {
			myChar = (char) (48 + random.nextInt(10));
			break;
		}
		}
		return myChar;
	}

	public static String erstellePalindrom(int laenge) {
		/*
		 * diese Methode erstellt ein Palindrom, wobei dessen Länge eingeben wird
		 */
		String palindrom = "";
		char zeichen = zufaelligesZeichen();

		if (laenge == 0) {
			return "";
		} else if (laenge == 1) {
			return "" + zeichen;
		} else {
			palindrom = (zeichen + erstellePalindrom(laenge - 2) + zeichen);
		}

		return palindrom;

	}

	public static void ausgabePalindrom(String palindrom) {
		System.out.println("Ausgabe Palindrom: " + palindrom);
	}
}
