
public class Aufgabe2_6 {
	public static void main(String[] args) {
		int eingabe1 = 2004;
		int eingabe2 = 2000;
		int summe = 0;
		int jahr = 0;

		if (eingabe1 >= 0 && eingabe2 >= 0) {
			if (eingabe1 < eingabe2) {
				jahr = eingabe1 + 1;
				do {
					if (jahr % 4 == 0) {
						summe = summe + jahr;
					}
					;
					jahr++;
				} while (jahr < eingabe2);

			} else if (eingabe1 > eingabe2) {
				jahr = eingabe2 + 1;
				do {
					if (jahr % 4 == 0) {
						summe = summe + jahr;
					}
					;
					jahr++;
				} while (jahr < eingabe1);
			}
			System.out.println("Summe: " + summe);
		} else {
			System.out.println("Fehler: Die Eingaben der Jahre müssen größer oder gleich Null sein!");
		}

	}
}
