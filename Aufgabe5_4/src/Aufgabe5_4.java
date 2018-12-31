import java.util.Scanner;

public class Aufgabe5_4 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		float seiteA = 0;
		float seiteB = 0;
		float seiteC = 0;

		System.out.println("Eingabe der Seite a: ");
		seiteA = myScanner.nextFloat();
		System.out.println("Eingabe der Seite b: ");
		seiteB = myScanner.nextFloat();
		System.out.println("Eingabe der Seite c: ");
		seiteC = myScanner.nextFloat();
		myScanner.close();

		if (pruefeobDreieck(seiteA, seiteB, seiteC)) {

			if (istGleichseitig(seiteA, seiteB, seiteC)) {
				System.out.println("Das Dreiceck ist gleichseitig");
			} else if (istGleichschenklig(seiteA, seiteB, seiteC)) {
				System.out.println("Das Dreiceck ist gleichschenklig");
			} else if (istRechtwinklig(seiteA, seiteB, seiteC)) {
				System.out.println("Das Dreiceck ist rechtwinklig");
			} else
				System.out.println("Das Dreiceck ist unregelmäßig");
			;
		} else {
			System.out.println("Die drei Seiten bilden kein Dreieck!");
		}
	}

	public static boolean istRechtwinklig(float seiteA, float seiteB, float seiteC) {
		return ((Math.pow(seiteA, 2) + Math.pow(seiteB, 2) == Math.pow(seiteC, 2))
				|| (Math.pow(seiteB, 2) + Math.pow(seiteC, 2) == Math.pow(seiteA, 2)))
				|| (Math.pow(seiteA, 2) + Math.pow(seiteC, 2) == Math.pow(seiteB, 2));
	}

	public static boolean istGleichseitig(float seiteA, float seiteB, float seiteC) {
		return seiteA == seiteB && seiteB == seiteC && seiteA == seiteC;
	}

	public static boolean istGleichschenklig(float seiteA, float seiteB, float seiteC) {
		return (seiteA == seiteB || seiteB == seiteC) || seiteA == seiteC;
	}

	public static boolean pruefeobDreieck(float seiteA, float seiteB, float seiteC) {
		return seiteA >= 1 && seiteB >= 1 && seiteC >= 1;
	}

}