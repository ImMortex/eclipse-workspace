import java.util.Scanner;

public class Aufgabe4_2c {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Fehler: falsche Anzahl an Parametern");
			return;
		}
		String benutzername = args[0];
		String passwort = args[1];

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Benutzername:");
		String benutzer = myScanner.next();
		System.out.println("Passwort:");
		String passw = myScanner.next();
		myScanner.close();

		/*
		 * ' == ' dient beim Objektvergleich der Überprüfung der Identität der Objekte
		 * selbst, also ihrem Speicherort, nicht einer lexikalischen Übereinstimmung
		 */

		if (benutzer.equals(benutzername) && passw.equals(passwort)) {
			System.out.println("Das war korrekt.");
		} else if (benutzer.equals(benutzername) ^ passw.equals(passwort)) {
			System.out.println("Das war schon fast korrekt.");
		} else {
			System.out.println("Das war nicht korrekt.");
		}

		// System.out.println("1. Parameter: " + args[0]);
		// System.out.println("2. Parameter: " + args[1]);

	}

}
