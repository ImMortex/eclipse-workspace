import java.util.Scanner;

public class Aufgabe2_6c {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int startjahr = 0;
		System.out.println("Bitte zwei Jahre eingeben, zwischen den die Schaltjahre ab dem Startjahr addiert werden.");
		System.out.println("Das Startjahr ist ein Schaltjahr. Jedes viertes Jahr danach ist auch ein Schaltjahr");
		System.out.println("Eingabe 1.Jahr: ");
		int eingabe1 = myScanner.nextInt();
		System.out.println("Eingabe 2.Jahr: ");
		int eingabe2 = myScanner.nextInt();
		System.out.println("Eingabe Startjahr: ");
		startjahr = myScanner.nextInt();
		
		int summe = 0;
		int korrektur = startjahr % 4;
		int jahr = startjahr;

		if (eingabe1 >= startjahr && eingabe2 >= startjahr) {
			if (eingabe1 < eingabe2) {
				jahr = eingabe1 + 1;
				do {
					if ((jahr - korrektur) % 4 == 0) {
						summe = summe + jahr;
					}
					;
					jahr++;
				} while (jahr < eingabe2);
			} else if (eingabe1 > eingabe2) {
				jahr = eingabe2 + 1;
				do {
					if ((jahr - korrektur) % 4 == 0) {
						summe = summe + jahr;
					}
					;
					jahr++;
				} while (jahr < eingabe1);
			}
			System.out.println("Die Summe der errechneten Schaltjahre: " + summe);
		} else {
			System.out.println("Fehler: Die Eingaben der Jahre müssen größer oder gleich " + startjahr + " sein!");
		}
		myScanner.close();

	}
}
