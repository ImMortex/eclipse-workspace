import java.util.Scanner;

public class Aufgabe5_3 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe Zahl1:");
		int zahl1 = myScanner.nextInt();
		System.out.println("Eingabe Zahl2:");
		int zahl2 = myScanner.nextInt();
		System.out.println("Eingabe Zahl3:");
		int zahl3 = myScanner.nextInt();
		myScanner.close();
		int untereGrenze = 1;
		int obereGrenze = 30;
		System.out.print("\n ");

		erstelleSchein(zahl1, zahl2, zahl3, untereGrenze, obereGrenze);
	}

	/**
	 * @param zahl1
	 * @param zahl2
	 * @param zahl3
	 * @param untereGrenze
	 * @param obereGrenze
	 */
	public static void erstelleSchein(int zahl1, int zahl2, int zahl3, int untereGrenze, int obereGrenze) {
		if (zahl1 != zahl2 && zahl2 != zahl3 && zahl3 != zahl1) {

			if (zahl1 >= untereGrenze && zahl1 <= obereGrenze && zahl2 >= untereGrenze && zahl2 <= obereGrenze
					&& zahl3 >= untereGrenze && zahl3 <= obereGrenze) {

				for (int stelle = untereGrenze; stelle <= obereGrenze; stelle++) {
					if (stelle == zahl1 || stelle == zahl2 || stelle == zahl3) {
						System.out.print("|X|");
					} else {
						System.out.print("|_|");
					}
					if (pruefeAufNeueZeile(stelle))
						System.out.print("\n ");

				}

			}
		}
	}

	public static boolean pruefeAufNeueZeile(int stelle) {
		return stelle % 3 == 0;
	}
}
