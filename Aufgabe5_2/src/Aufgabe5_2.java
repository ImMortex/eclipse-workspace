import java.util.Scanner;

public class Aufgabe5_2 {
	enum monate {
		Januar, Februar, März, April, Mai, Juni, Juli, August, Sepember, Oktober, November, Dezember
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe Land:");
		String land = myScanner.next();
		System.out.println("Eingabe Monat:");
		int monat = myScanner.nextInt();
		myScanner.close();
		String[] laender = { "Deutschland", "Frankreich", "Schweiz" };

		System.out.println(vorherWetter(land, monat, laender));
	}

	/**
	 * @vorherWetter Diese Methode wertet das Wetter aus.
	 * 
	 * @param land
	 * @param monat
	 */
	public static String vorherWetter(String land, int monat, String[] laender) {
		String ausgabe;
		boolean landExistiert = false;
		for (int i = 0; i <= laender.length - 1 && landExistiert == false; i++) {
			if (land.equals(laender[i])) {
				landExistiert = true;
			}
		}

		if (landExistiert) {

			if (!(monat >= 1 && monat <= 12)) {
				monat = 1;
			}
			if (land.equals("Deutschland")) {
				ausgabe = "Nicht vorhersehbar!";
			} else if ((monat <= 3 && monat >= 1) || (monat >= 10 && monat <= 12)) {
				ausgabe = "Regenwetter";
			} else {
				ausgabe = "Sonnenschein";
			}
			System.out.println(monate.values()[monat]);
		} else {
			ausgabe = "Dieses Land existiert nicht!";
		}
		return ausgabe;
	}

}
