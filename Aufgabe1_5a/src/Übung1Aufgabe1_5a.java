
public class Übung1Aufgabe1_5a {
	public static void main(String[] args) {
		int zahl0 = 4;
		int zahl1 = 0;
		char operator = '/';

		if (operator == '*') {
			System.out.println("Ergebnis= " + zahl0 * zahl1);
		} else if (operator == '/') {
			if (zahl1 == 0) {
				System.out.println("Fehler: Division durch Null!");
			} else if (zahl0 % zahl1 != 0) {
				System.out.println("Ergebnis= " + zahl0 / zahl1 + " Rest: " + zahl0 % zahl1);
			} else {
				System.out.println("Ergebnis= " + zahl0 / zahl1);
			}
		} else if ((operator == '+') && (zahl0 > 3)) {
			System.out.println("Ergebnis= " + (zahl0 + zahl1));
		}

	}

}
