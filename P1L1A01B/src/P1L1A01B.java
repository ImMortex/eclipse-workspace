import java.util.Random;

public class P1L1A01B {

	public static void main(String[] args) {
//"Anna", "Benno", "Carmen", "Dennis", "Ella", "Faysal", "Greta", "Hadrian","Ida", "Jan", "Klara"

		String[] bestaetigteTeilnehmer = { "Anna", "Benno", "Carmen", "Dennis", "Faysal", "Hadrian", "Ida", "Jan",
				"Klara" };
		String[] bestaetigteAbwesende = {};

		int anzahlTeilnehmer = anzahlDerTeilnehmer(bestaetigteTeilnehmer, bestaetigteAbwesende);

		System.out.println("Mindestanzahl an Teilnehmer: " + anzahlTeilnehmer);

	}

	public static int anzahlDerTeilnehmer(String[] bestaetigteTeilnehmer, String[] bestaetigteAbwesende) {

		int anzahlTeilnehmer = 0;
		String[] wirklicheTeilnehmer = {};

		Boolean annaZusage = null;
		Boolean bennoZusage = null;
		Boolean carmenZusage = null;
		Boolean dennisZusage = null;
		Boolean ellaZusage = null;
		Boolean faysalZusage = null;
		Boolean gretaZusage = null;
		Boolean hadrianZusage = null;
		Boolean idaZusage = null;
		Boolean janZusage = null;
		Boolean klaraZusage = null;

		for (int teilnehmer = 0; teilnehmer <= bestaetigteTeilnehmer.length - 1; teilnehmer++) {
			switch (bestaetigteTeilnehmer[teilnehmer]) {
			case "Anna":
				annaZusage = true;
				break;
			case "Benno":
				bennoZusage = true;
				break;
			case "Carmen":
				carmenZusage = true;
				break;
			case "Dennis":
				dennisZusage = true;
				break;
			case "Ella":
				ellaZusage = true;
				break;
			case "Faysal":
				faysalZusage = true;
				break;
			case "Greta":
				gretaZusage = true;
				break;
			case "Hadrian":
				hadrianZusage = true;
				break;
			case "Ida":
				idaZusage = true;
				break;
			case "Jan":
				janZusage = true;
				break;
			case "Klara":
				klaraZusage = true;
				break;
			}
		}

		for (int abwesende = 0; abwesende <= bestaetigteAbwesende.length - 1; abwesende++) {
			switch (bestaetigteAbwesende[abwesende]) {
			case "Anna":
				annaZusage = false;
				break;
			case "Benno":
				bennoZusage = false;
				break;
			case "Carmen":
				carmenZusage = false;
				break;
			case "Dennis":
				dennisZusage = false;
				break;
			case "Ella":
				ellaZusage = false;
				break;
			case "Faysal":
				faysalZusage = false;
				break;
			case "Greta":
				gretaZusage = false;
				break;
			case "Hadrian":
				hadrianZusage = false;
				break;
			case "Ida":
				idaZusage = false;
				break;
			case "Jan":
				janZusage = false;
				break;
			case "Klara":
				klaraZusage = false;
				break;
			}
		}

		Boolean[] ergebnisse = aussagenBeruecksichtigen(annaZusage, bennoZusage, carmenZusage, dennisZusage, ellaZusage,
				faysalZusage, gretaZusage, hadrianZusage, idaZusage, janZusage, klaraZusage);
		// werte von Funktion übernehmen
		annaZusage = ergebnisse[0];
		bennoZusage = ergebnisse[1];
		carmenZusage = ergebnisse[2];
		dennisZusage = ergebnisse[3];
		ellaZusage = ergebnisse[4];
		faysalZusage = ergebnisse[5];
		gretaZusage = ergebnisse[6];
		hadrianZusage = ergebnisse[7];
		idaZusage = ergebnisse[8];
		janZusage = ergebnisse[9];
		klaraZusage = ergebnisse[10];
		wirklicheTeilnehmer = alleZusagenInArraySchreiben(wirklicheTeilnehmer, annaZusage, bennoZusage, carmenZusage,
				dennisZusage, ellaZusage, faysalZusage, gretaZusage, hadrianZusage, idaZusage, janZusage, klaraZusage);
		anzahlTeilnehmer = wirklicheTeilnehmer.length;

		return anzahlTeilnehmer;
	}

	public static String[] alleZusagenInArraySchreiben(String[] wirklicheTeilnehmer, Boolean annaZusage,
			Boolean bennoZusage, Boolean carmenZusage, Boolean dennisZusage, Boolean ellaZusage, Boolean faysalZusage,
			Boolean gretaZusage, Boolean hadrianZusage, Boolean idaZusage, Boolean janZusage, Boolean klaraZusage) {
		if (annaZusage != null && annaZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Anna");
		}
		if (bennoZusage != null && bennoZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Benno");
		}
		if (carmenZusage != null && carmenZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Carmen");
		}
		if (dennisZusage != null && dennisZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Dennis");
		}
		if (ellaZusage != null && ellaZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Ella");
		}
		if (faysalZusage != null && faysalZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Faysal");
		}
		if (gretaZusage != null && gretaZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Greta");
		}
		if (hadrianZusage != null && hadrianZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Hadrian");
		}
		if (idaZusage != null && idaZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Ida");
		}
		if (janZusage != null && janZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Jan");
		}
		if (klaraZusage != null && klaraZusage == true) {
			wirklicheTeilnehmer = arrayUmElementErweitern(wirklicheTeilnehmer, "Klara");
		}
		return wirklicheTeilnehmer;
	}

	public static String[] arrayUmElementErweitern(String[] array, String neuesElement) {
		if (array.length == 1 && array[0].equals("")) {
			array[0] = neuesElement;
		}

		else {
			String[] zwischenSpeicherArray = new String[array.length];
			array = new String[array.length + 1];
			for (int index = 0; index <= zwischenSpeicherArray.length - 1; index++) {
				array[index] = zwischenSpeicherArray[index];
			}
			array[array.length - 1] = neuesElement;

			// Testausgabe
			//System.out.println(array[array.length - 1]);
		}

		return array;
	}

	public static Boolean[] aussagenBeruecksichtigen(Boolean annaZusage, Boolean bennoZusage, Boolean carmenZusage,
			Boolean dennisZusage, Boolean ellaZusage, Boolean faysalZusage, Boolean gretaZusage, Boolean hadrianZusage,
			Boolean idaZusage, Boolean janZusage, Boolean klaraZusage) {
		// Aussage1(bennoZusage, faysalZusage);
		// Wenn Benno hingeht, dann folgt auch Faysal.
		if (bennoZusage != null && faysalZusage == null) {
			if (bennoZusage) {
				faysalZusage = true;
			} else {
				faysalZusage = false;
			}
		}

		// Aussage2(dennisZusage, ellaZusage);
		// Entweder Dennis oder Ella wird dabei sein.

		if ((ellaZusage == null) && (dennisZusage == null)) {
			Random myRandom = new Random();
			int zufallsZahl = myRandom.nextInt(2);
			if (zufallsZahl == 0) {
				ellaZusage = true;
			} else {
				dennisZusage = true;
			}
		} else if (dennisZusage == null ^ ellaZusage == null) {
			if (dennisZusage == false) {
				ellaZusage = true;
			} else {
				ellaZusage = false;
			}
		}

		// Aussage3(annaZusage, carmenZusage, gretaZusage);
		/*
		 * Wenn Anna oder Carmen auf der Party aufkreuzen, wird Greta trotz einer
		 * möglichweise vorher gesendeten Zusage fern bleiben.
		 */
		if (gretaZusage != null) {
			if ((carmenZusage != null && carmenZusage) || (annaZusage != null && annaZusage)
					|| (gretaZusage == false)) {
				gretaZusage = false;
			} else {
				gretaZusage = true;
			}

		} else if ((gretaZusage == null)
				&& ((carmenZusage != null && carmenZusage) || (annaZusage != null && annaZusage))) {
			gretaZusage = false;
		}

		// Aussage4(hadrianZusage , idaZusage);
		/*
		 * Ida und Hadrian sind normalerweise unzertrennlich. Wenn einer der beiden an
		 * der Party teilnimmt, wird die andere Person auch teilnehmen, aber nur soweit
		 * sie nicht bereits abgesagt hat. Wenn einer der beiden an der Party explizit
		 * nicht teilnimmt, dann wird die andere Person (trotz einer möglicherweise
		 * bereits erteilten Zusage) nicht teilnehmen.
		 */

		if (idaZusage == null && hadrianZusage == null) {
			idaZusage = null;
			hadrianZusage = null;
		} else if (idaZusage == null || hadrianZusage == null) {
			if ((hadrianZusage == null && idaZusage == true) || (idaZusage == null && hadrianZusage == true)) {
				idaZusage = true;
				hadrianZusage = true;
			} else {
				idaZusage = false;
				hadrianZusage = false;
			}
		} else {
			if (idaZusage == false || hadrianZusage == false) {
				idaZusage = false;
				hadrianZusage = false;
			} else {
				idaZusage = true;
				hadrianZusage = true;
			}
		}
		// Aussage5(bennoZusage, carmenZusage, klaraZusage, janZusage);
		/*
		 * Wenn Benno und Carmen auf einer LAN-Party sind, dann sind auch Klara und //
		 * Jan dabei – es sei denn sie haben bereits explizit abgesagt.
		 */

		if (bennoZusage != null && carmenZusage != null) {

			if (janZusage == null && bennoZusage && carmenZusage) {
				janZusage = true;
			} else if (janZusage != true) {
				janZusage = false;
			}

			if (klaraZusage == null && bennoZusage && carmenZusage) {
				klaraZusage = true;
			} else if (klaraZusage != true) {
				klaraZusage = false;
			}

		}

		Boolean[] werte = { annaZusage, bennoZusage, carmenZusage, dennisZusage, ellaZusage, faysalZusage, gretaZusage,
				hadrianZusage, idaZusage, janZusage, klaraZusage };
		return werte;
	}

}
