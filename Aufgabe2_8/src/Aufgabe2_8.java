import java.util.Scanner;

public class Aufgabe2_8 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Anzahl Klassen eingeben (ganze Zahl von 1 bis 22): ");
		int n = myScanner.nextInt();
		myScanner.close();
		int klassen[] = new int[n];
		boolean keinRest = true;

		int anzahl = 0;

		if (n >= 1 && n <= 22) {
			for (int zaehler = 0; zaehler <= n - 1; zaehler++) {
				klassen[zaehler] = zaehler + 1;
				// System.out.print(klassen[zaehler] + " ");
			}
			int k = n;
			System.out.println(" ");
			do {
				keinRest = true;
				for (int zaehler = 0; zaehler <= n - 1 && keinRest == true; zaehler++) {
					if (k % klassen[zaehler] != 0) {
						keinRest = false;
					}
				}
				k = k + 1;
				// System.out.println("keinRest? :" + keinRest);
			} while (keinRest == false);

			System.out.println("kleinster Angriffswert: " + k);
			anzahl = 2147483647 / k;
			System.out.println("Anzahl Angriffswerte: " + anzahl);
		} else {
			System.out.println("Ungültige Anzahl an Klassen.");
		}
	}

}
