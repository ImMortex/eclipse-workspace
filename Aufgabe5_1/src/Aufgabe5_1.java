import java.util.Scanner;

public class Aufgabe5_1 {

	public static void main(String[] args) {

		String[] inputs = { "A", "BB", "CCC", "ABCXYZ", "INFORMATIK", "AGDHHBEHDEJJDJHJEHJDFJUEHUEHDH",
				"APPLIEDSCIENCE" };

		int MaxAnzahlZeichen = 20;

		for (int input = 0; input <= inputs.length - 1; input++) {// Kontrolle, ob Zeichenkette nicht zu lang ist

			if (inputs[input].length() <= MaxAnzahlZeichen) {

				String codierteZeichenkette = Aufgabe5_1.kodieren(inputs[input]);
				Aufgabe5_1.dekodieren(codierteZeichenkette);

				System.out.printf("%-20s", inputs[input]);/*
															 * %-20s Platzhalter Stringlänge von max 20 Zeichen,
															 * linksbündig -setzt Leerzeichen
															 */
				System.out.printf("|");
				System.out.printf("%-60s", codierteZeichenkette);
				System.out.printf("|");
				System.out.printf("%-20s",
						Aufgabe5_1.dekodieren(codierteZeichenkette)); /*
																		 * Ausgabe der Eingabe und Kodierung
																		 */
				System.out.printf("|" + "\n");

			} else {
				System.out.printf("%-20s", "Zeichenkette zu lang \n");
			}
		}
		System.out.println("");
		System.out.println(
				"Antwort: " + Aufgabe5_1.dekodieren("001028021020115006098032180050099168078210270208017360171220")); // Kontrollfrage
																														// bei
																														// Moodle
	}

	public static String kodieren(String zeichenkette) {
		String codierteZeichenkette = "";
		String codiertesZeichen = "";

		for (int zeichen = 0; zeichen <= zeichenkette.length() - 1; zeichen++) {
			codiertesZeichen = ((int) ((zeichenkette.charAt(zeichen)) - 64) * (zeichen + 1)) + ""; // Kodierung

			switch (codiertesZeichen.length()) {// Anhängen fehlender Nullen
			case 1:
				codiertesZeichen = "00" + codiertesZeichen;
				break;

			case 2:
				codiertesZeichen = "0" + codiertesZeichen;
				break;

			}
			codierteZeichenkette = codierteZeichenkette + codiertesZeichen;
		}
		return codierteZeichenkette;
	}

	public static String dekodieren(String codierteZeichenkette) {
		String tripel = "";
		String decodiertesZeichen = "";
		String decodierteZeichenkette = "";

		for (int position = 0; position <= codierteZeichenkette.length() - 1; position += 3) {
			tripel = "" + codierteZeichenkette.charAt(position) + codierteZeichenkette.charAt(position + 1)
					+ codierteZeichenkette
							.charAt(position + 2); /*
													 * 3 Zahlen werden herausgegriffen, die einen Buchstaben kodieren
													 */
			decodiertesZeichen = ""
					+ (char) ((Integer.parseInt(tripel)) / ((decodierteZeichenkette.length() + 1)) + 64);// Dekodierung
			decodierteZeichenkette += decodiertesZeichen;
		}
		return decodierteZeichenkette;
	}

	public static void ausgeben() {}
}
