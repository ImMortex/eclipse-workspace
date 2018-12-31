import java.util.Scanner;

public class Aufgabe5_6 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		double kapital = eingabeKapital(myScanner);
		int jahre = eingabeJahre(myScanner);
		double[] zinssaetze = { 0.0100d, 0.0300d, 0.0500d, 0.0800d, 0.1000d, 0.1500d, 0.2000d };

		myScanner.close();

		erstelleTabelle(kapital, jahre, zinssaetze);

	}

	public static void erstelleTabelle(double kapital, int jahre, double[] zinssaetze) {
		/*
		 * Diese Methode stellt die Werte in einer Tabelle dar. Das Format der Tabelle
		 * wird auf den Platzverbrauch der Werte angepasst, sodass alle Zahlen
		 * ordentlich lesbar sind-
		 */
		String ausgabe = "";
		

		int platzhalterFuerErsteSpalte = 6;// das Wort "Jahre" + Leerzeichen braucht 6 Zeichen

		if ((jahre + "").length() > 6) {
			platzhalterFuerErsteSpalte = (jahre + "").length() + 1;
		}
		ausgabe = String.format("%.2f", kapitalMitZinsen(kapital, jahre, zinssaetze[zinssaetze.length - 1]));
		int platzhalterFueBetraege = (ausgabe + " EUR").length() + 1;

		for (int jahr = -1; jahr <= jahre; jahr++) {

			if (jahr == -1) {
				System.out.printf("%-" + platzhalterFuerErsteSpalte + "s", "Jahre");
			} else {
				System.out.printf("%-" + platzhalterFuerErsteSpalte + "s", jahr + "  ");
			}

			for (int zinssatz = 0; zinssatz <= zinssaetze.length - 1; zinssatz++) {
				if (jahr == -1) {
					ausgabe = String.format("%.2f", zinssaetze[zinssatz]);
					System.out.printf("%-" + platzhalterFueBetraege + "s", (ausgabe + " % "));
					System.out.printf(" | ");
				} else {
					ausgabe = String.format("%.2f", kapitalMitZinsen(kapital, jahr, zinssaetze[zinssatz]));
					System.out.printf("%-" + platzhalterFueBetraege + "s", ausgabe + " EUR ");
					System.out.printf(" | ");
				}
			}
			System.out.print("\n");
		}
	}

	public static double eingabeZinssatz(Scanner myScanner) {
		System.out.println("Eingabe Zinssatz: ");
		double zinssatz = myScanner.nextDouble();
		return zinssatz;
	}

	public static int eingabeJahre(Scanner myScanner) {
		System.out.println("Eingabe Jahre: ");
		int jahre = myScanner.nextInt();
		return jahre;
	}

	public static double eingabeKapital(Scanner myScanner) {
		System.out.println("Eingabe Kapital: ");
		double kapital = myScanner.nextDouble();
		return kapital;
	}

	public static double kapitalMitZinsen(double kapitaleinlage, int jahre, double zinssatz) {
		if (jahre == 0) {
			return kapitaleinlage;
		} else {
			kapitaleinlage = (zinssatz + 1) * kapitalMitZinsen(kapitaleinlage, jahre - 1, zinssatz);
			return kapitaleinlage;
		}

	}

}
