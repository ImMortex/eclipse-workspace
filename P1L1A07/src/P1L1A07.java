public class P1L1A07 {

	public static void main(String[] args) {

		if (args.length == 2) {
			String eingabeMonat = args[0];
			String eingabeWochentag = args[1];

			int monat = monatInIntegerUmwandeln(eingabeMonat);
			int wochentag = wochentagInIntegerUmwandeln(eingabeWochentag);
			if ((monat >= 1) && (monat <= 12) && (wochentag >= 1) && (wochentag <= 7)) {
				int tageImMonat = tageImMonatBestimmen(monat);

				String[][] kalenderblatt = kalenderblattErstellen(wochentag, tageImMonat);

				kalenderblattAusgeben(kalenderblatt, monat);
			} else {
				System.out.println("Fehler: Ungültige Eingaben für Monat und oder Wochentag.");
			}
		} else {
			System.out.println("Fehler: Es werden zwei Parameter benötigt. Programm beendet.");
		}
	}

	public static String[][] kalenderblattErstellen(int wochentag, int tageImMonat) {
		/*
		 * Diese Funktion erstellt und returnt ein Kalenderblatt in Form eines
		 * zweidemensionalen Arrays anhand gegebener Werte
		 */
		// Kalenderblatt [7 Spalten] [7 Zeilen]
		String[][] kalenderblatt = new String[7][7];

		// In der Ersten Zeile sollen die abgekürzten Wochentage stehen
		kalenderblatt[0][0] = "MO";
		kalenderblatt[0][1] = "DI";
		kalenderblatt[0][2] = "MI";
		kalenderblatt[0][3] = "DO";
		kalenderblatt[0][4] = "FR";
		kalenderblatt[0][5] = "SA";
		kalenderblatt[0][6] = "SO";

		int tagZaehler = 0; // Variable stellt sicher, dass jeder Tag eindeutig nummeriert wird
		int ersterTag = 0;

		for (int woche = 1; woche <= kalenderblatt.length - 1; woche++) {

			if (woche == 1) {
				ersterTag = wochentag - 1;
				// in 1. Woche Beginn Nummerierung erst am festgelegten Wochentag
			} else {
				ersterTag = 0;
			}

			for (int tag = ersterTag; (tag <= kalenderblatt[0].length - 1) && (tagZaehler <= tageImMonat - 1); tag++) {
				tagZaehler++;
				kalenderblatt[woche][tag] = Integer.toString(tagZaehler);
			}

		}
		return kalenderblatt;
	}

	public static void kalenderblattAusgeben(String[][] kalenderblatt, int monat) {
		/*
		 * Diese MAthode gibt das in einem zweidemensionalen Array gespeicherte per
		 * Doppelschleife aus
		 */

		// zusätzliche Ausgabe des Monats
		String ausgabeMonat = integerInMonatnameUmwandeln(monat);
		System.out.print("|");
		System.out.printf("%27s", ausgabeMonat);
		System.out.print("|\n");

		for (int woche = 0; woche <= kalenderblatt.length - 1; woche++) // Spalten der Tabelle
		{
			for (int tag = 0; tag <= (kalenderblatt[0].length - 1); tag++) // Zeilen der Tabelle
			{
				// leere Wochen werden nicht erst nicht mit ausgegeben
				if (((woche == 5) && (kalenderblatt[5][0] == null))
						|| ((woche == 6) && (kalenderblatt[6][0] == null))) {
				} else {

					// bei null automatisch Leerzeichen ausgegeben
					if (kalenderblatt[woche][tag] == null) {
						kalenderblatt[woche][tag] = "";
					}

					System.out.print("|");
					System.out.printf("%3s", kalenderblatt[woche][tag]); // Platzhalter für 3 Zeichen
					if (tag == 6) {
						System.out.print("|");// nach letzten Tag noch ein Strich zur Strukturierung
					}
				}
			}
			System.out.print("\n"); // Zeilenumbruch für nächste Woche
		}
	}

	public static String integerInMonatnameUmwandeln(int monat) {
		String ausgabeMonat = "Januar";
		switch (monat) {
		case 1:
			ausgabeMonat = "Januar";
			break;
		case 2:
			ausgabeMonat = "Februar";
			break;
		case 3:
			ausgabeMonat = "März";
			break;
		case 4:
			ausgabeMonat = "April";
			break;
		case 5:
			ausgabeMonat = "Mai";
			break;
		case 6:
			ausgabeMonat = "Juni";
			break;
		case 7:
			ausgabeMonat = "Juli";
			break;
		case 8:
			ausgabeMonat = "August";
			break;
		case 9:
			ausgabeMonat = "September";
			break;
		case 10:
			ausgabeMonat = "Oktober";
			break;
		case 11:
			ausgabeMonat = "November";
			break;
		case 12:
			ausgabeMonat = "Dezember";
			break;
		}
		return ausgabeMonat;
	}

	public static int wochentagInIntegerUmwandeln(String eingabeWochentag) {
		int wochentag = 0;

		switch (eingabeWochentag) {
		case "1":
		case "Montag":
		case "MO":
		case "Mo":
			wochentag = 1;
			break;
		case "2":
		case "Dienstag":
		case "DI":
		case "Di":
			wochentag = 2;
			break;
		case "3":
		case "Mittwoch":
		case "MI":
		case "Mi":
			wochentag = 3;
			break;
		case "4":
		case "Donnerstag":
		case "DO":
		case "Do":
			wochentag = 4;
			break;
		case "5":
		case "Freitag":
		case "FR":
		case "Fr":
			wochentag = 5;
			break;
		case "6":
		case "Samstag":
		case "SA":
		case "Sa":
			wochentag = 6;
			break;
		case "7":
		case "Sonntag":
		case "SO":
		case "So":
			wochentag = 7;
			break;
		}
		return wochentag;
	}

	public static int monatInIntegerUmwandeln(String eingabeMonat) {
		int monat = 0;

		switch (eingabeMonat) {
		case "1":
		case "Januar":
			monat = 1;
			break;
		case "2":
		case "Februar":
			monat = 2;
			break;
		case "3":
		case "März":
			monat = 3;
			break;
		case "4":
		case "April":
			monat = 4;
			break;
		case "5":
		case "Mai":
			monat = 5;
			break;
		case "6":
		case "Juni":
			monat = 6;
			break;
		case "7":
		case "Juli":
			monat = 7;
			break;
		case "8":
		case "August":
			monat = 8;
			break;
		case "9":
		case "September":
			monat = 9;
			break;
		case "10":
		case "Oktober":
			monat = 10;
			break;
		case "11":
		case "November":
			monat = 11;
			break;
		case "12":
		case "Dezember":
			monat = 12;
			break;
		}
		return monat;
	}

	public static int tageImMonatBestimmen(int monat) {
		int tageImMonat = 31;
		switch (monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			tageImMonat = 31;
			break;
		case 2:
			tageImMonat = 28;
			break; // für den Februar sind 28 Tage festgelegt
		case 4:
		case 6:
		case 9:
		case 11:
			tageImMonat = 30;
			break;
		}
		return tageImMonat;
	}

}
