
public class P1L1A01B_2 {
	public static void main(String[] args) {
		/*
		 * null steht dafür, dass anfangs nicht feststeht, ob die Person kommt => steht
		 * weder im Array "bestaetigteTeilnehmer" noch im Array "bestaetigteAbwesende"
		 * 
		 * Einiges erschließt sich nach dem Durchgehen der Aussagen (oder auch nicht)
		 */
		//primitive Eingabe
		Boolean bennoZusage = true;
		Boolean faysalZusage = true;

		Boolean dennisZusage = true;
		Boolean ellaZusage = false;

		Boolean hadrianZusage = true;
		Boolean idaZusage = true;

		Boolean annaZusage = true;
		Boolean carmenZusage = true;
		Boolean gretaZusage = false;

		Boolean klaraZusage = true;
		Boolean janZusage = true;
		//Ende Eingabe
		String[] bestaetigteTeilnehmer = {
				"leer" }; /*
							 * "leer" ist hier ein Platzhalter und dient zur Initialiserung und für eine
							 * Abfrage in der Funktion personZuArrayHinzufuegen()
							 */
		String[] bestaetigteAbwesende = { "leer" };
		String[][] teilnehmerUndAbwesendeGetrennt = { {} };

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

		teilnehmerUndAbwesendeGetrennt = personenInArraysEinordnen(bennoZusage, faysalZusage, dennisZusage, ellaZusage,
				hadrianZusage, idaZusage, annaZusage, carmenZusage, gretaZusage, klaraZusage, janZusage,
				bestaetigteTeilnehmer, bestaetigteAbwesende);
		bestaetigteTeilnehmer = teilnehmerUndAbwesendeGetrennt[0];
		bestaetigteAbwesende = teilnehmerUndAbwesendeGetrennt[1];

		int anzahlTeilnehmer = anzahlDerTeilnehmer(bestaetigteTeilnehmer, bestaetigteTeilnehmer);

		testAusgabe(bestaetigteTeilnehmer, bestaetigteAbwesende);

		ausgabeAnzahlDerTeilnehmer(anzahlTeilnehmer);
	}

	public static void testAusgabe(String[] bestaetigteTeilnehmer, String[] bestaetigteAbwesende) {
		System.out.println("Teilnehmer:");
		for (int i = 0; i <= bestaetigteTeilnehmer.length - 1; i++) {
			System.out.println(bestaetigteTeilnehmer[i]);
		}
		System.out.println("");
		System.out.println("Abwesende:");
		for (int i = 0; i <= bestaetigteAbwesende.length - 1; i++) {
			System.out.println(bestaetigteAbwesende[i]);
		}
		System.out.println("");
	}

	public static void ausgabeAnzahlDerTeilnehmer(int anzahlTeilnehmer) {
		System.out.println("Anzahl der Teilnehmer: " + anzahlTeilnehmer);
	}

	public static int anzahlDerTeilnehmer(String[] bestaetigteTeilnehmer, String[] bestaetigteAbwesende) {
		if (bestaetigteTeilnehmer.length == 1 && bestaetigteTeilnehmer[0] == "leer") {
			return 0; // wenn nur der Platzhalter "leer" im array enthalten ist, dann gibt es 0
						// Teilnehmer
		}
		int anzahlTeilnehmer = bestaetigteTeilnehmer.length;
		return anzahlTeilnehmer;
	}

	public static String[][] personenInArraysEinordnen(Boolean bennoZusage, Boolean faysalZusage, Boolean dennisZusage,
			Boolean ellaZusage, Boolean hadrianZusage, Boolean idaZusage, Boolean annaZusage, Boolean carmenZusage,
			Boolean gretaZusage, Boolean klaraZusage, Boolean janZusage, String[] bestaetigteTeilnehmer,
			String[] bestaetigteAbwesende) {

		String[][] arrays = { {}, {} };

		if (annaZusage == null) {// wird nirgends eingetragen
		} else if (annaZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Anna");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Anna");
		}

		if (bennoZusage == null) {
		} else if (bennoZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Benno");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Benno");
		}

		if (carmenZusage == null) {
		} else if (carmenZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Carmen");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Carmen");
		}

		if (dennisZusage == null) {
		} else if (dennisZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Dennis");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Dennis");
		}

		if (ellaZusage == null) {
		} else if (ellaZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Ella");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Ella");
		}

		if (faysalZusage == null) {
		} else if (faysalZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Faysal");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Faysal");
		}

		if (gretaZusage == null) {
		} else if (gretaZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Greta");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Greta");
		}

		if (hadrianZusage == null) {
		} else if (hadrianZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Hadrian");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Hadrian");
		}

		if (idaZusage == null) {
		} else if (idaZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Ida");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Ida");
		}

		if (janZusage == null) {
		} else if (janZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Jan");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Jan");
		}

		if (klaraZusage == null) {
		} else if (klaraZusage) {
			bestaetigteTeilnehmer = personZuArrayHinzufuegen(bestaetigteTeilnehmer, "Klara");
		} else {
			bestaetigteAbwesende = personZuArrayHinzufuegen(bestaetigteAbwesende, "Klara");
		}

		arrays[0] = bestaetigteTeilnehmer;
		arrays[1] = bestaetigteAbwesende;

		return arrays;
	}

	public static String[] personZuArrayHinzufuegen(String[] teilnehmerArray, String person) {

		if (teilnehmerArray.length == 1 && teilnehmerArray[0].equals("leer")) {
			teilnehmerArray[teilnehmerArray.length - 1] = person;
		} else {
			String[] zwischenspeicherArray = teilnehmerArray;
			teilnehmerArray = new String[zwischenspeicherArray.length + 1];
			for (int i = 0; i <= zwischenspeicherArray.length - 1; i++) {
				teilnehmerArray[i] = zwischenspeicherArray[i];
			}
			teilnehmerArray[teilnehmerArray.length - 1] = person;
		}
		return teilnehmerArray;

	}

	public static Boolean[] aussagenBeruecksichtigen(Boolean AnnaZusage, Boolean BennoZusage, Boolean CarmenZusage,
			Boolean DennisZusage, Boolean EllaZusage, Boolean FaysalZusage, Boolean GretaZusage, Boolean HadrianZusage,
			Boolean IdaZusage, Boolean JanZusage, Boolean KlaraZusage) {
		// Aussage1(BennoZusage, FaysalZusage);
		// Wenn Benno hingeht, dann folgt auch Faysal.
		if (BennoZusage == null) {

		} else if (BennoZusage) {
			FaysalZusage = true;
		} else {
			FaysalZusage = false;
		}

		// Aussage2(DennisZusage, EllaZusage);
		// Entweder Dennis oder Ella wird dabei sein.

		if ((EllaZusage == null) || (DennisZusage == null)) {
		} else if (DennisZusage ^ EllaZusage) {
			if (DennisZusage == false) {
				EllaZusage = true;
			} else {
				EllaZusage = false;
			}
		} else {
			{
				EllaZusage = false;
				DennisZusage = false;
			}
		}

		// Aussage3(AnnaZusage, CarmenZusage, GretaZusage);
		/*
		 * Wenn Anna oder Carmen auf der Party aufkreuzen, wird Greta trotz einer
		 * möglichweise vorher gesendeten Zusage fern bleiben.
		 */

		if (GretaZusage == null) {
		} else if ((AnnaZusage != null) && (CarmenZusage != null)) {
		} else if ((AnnaZusage == null || CarmenZusage) || (GretaZusage == false)
				|| (CarmenZusage == null || AnnaZusage) || (AnnaZusage || CarmenZusage)) {
			GretaZusage = false;
		}

		else {
			GretaZusage = true;
		}

		// Aussage4(HadrianZusage, IdaZusage);
		/*
		 * Ida und Hadrian sind normalerweise unzertrennlich. Wenn einer der beiden an
		 * der Party teilnimmt, wird die andere Person auch teilnehmen, aber nur soweit
		 * sie nicht bereits abgesagt hat. Wenn einer der beiden an der Party explizit
		 * nicht teilnimmt, dann wird die andere Person (trotz einer möglicherweise
		 * bereits erteilten Zusage) nicht teilnehmen.
		 */

		if (IdaZusage == null && HadrianZusage == null) {
		} else if (IdaZusage == null || HadrianZusage == null) {
			if ((IdaZusage == true && HadrianZusage == null) || (IdaZusage == null && HadrianZusage == true)) {
				IdaZusage = true;
				HadrianZusage = true;
			} else {
				IdaZusage = false;
				HadrianZusage = false;
			}
		} else {
			if (IdaZusage == false || HadrianZusage == false) {
				IdaZusage = false;
				HadrianZusage = false;
			} else {
				IdaZusage = true;
				HadrianZusage = true;
			}
		}
		// Aussage5(BennoZusage, CarmenZusage, KlaraZusage, JanZusage);

		if (BennoZusage == null || CarmenZusage == null) {
		} else if (BennoZusage
				&& CarmenZusage) {/*
									 * Wenn Benno und Carmen auf einer LAN-Party sind, dann sind auch Klara und //
									 * Jan dabei – es sei denn sie haben bereits explizit abgesagt.
									 */
			JanZusage = true;
			KlaraZusage = true;
		} else {
			JanZusage = false;
			KlaraZusage = false;
		}
		Boolean[] werte = { AnnaZusage, BennoZusage, CarmenZusage, DennisZusage, EllaZusage, FaysalZusage, GretaZusage,
				HadrianZusage, IdaZusage, JanZusage, KlaraZusage };
		return werte;
	}

}
