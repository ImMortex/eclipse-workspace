import java.util.Scanner;

public class Aufgabe2_3 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Einagbe erster Parameter: ");
		int eingabe1 = myScanner.nextInt();
		System.out.print("Einagbe zweiter Parameter: ");
		int eingabe2 = myScanner.nextInt();
		System.out.print("Einagbe dritter Parameter: ");
		int eingabe3 = myScanner.nextInt();
		ausgeben(eingabe1, eingabe2, eingabe3);
		myScanner.close();
	}

	public static void ausgeben(int zahl1, int zahl2, int zahl3) {
		if (zahl1 == 1) {
			System.out.println("Erster Parameter: " + zahl1);
		} else {
			System.out.println("ErsterParameter nicht zulaessig!");
		}
		;
		if (zahl2 == 2) {
			System.out.println("Zweiter Parameter: " + zahl2);
		} else {
			System.out.println("Zweiter Parameter nicht zulaessig!");
		}
		;
		if (zahl3 == 3) {
			System.out.println("Dritter Parameter: " + zahl2);
		} else {
			System.out.println("Dritter Parameter nicht zulaessig!");
		}
		;
		if (zahl1 == 1 && zahl2 == 2 && zahl3 == 3) {
			int ergebnis = zahl1 + zahl2 + zahl3;
			System.out.print("Das Ergebnis ist: " + ergebnis);
		} else {
			System.out.print("Das Ergebnis konnte nicht berechnet werden!");
		}

	}
}
