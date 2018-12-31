
public class P1L1A08 {

	public static void main(String[] args) {

		// Eingabe
		String verschluesselteZeichenkette = "GLHPDFKWGHUFRPSXWHU.";
		int verschiebung = 3;
		
		/*
		 * Antwort auf die gestellte Frage: Aus "GLHPDFKWGHUFRPSXWHU" wird
		 * "DIEMACHTDERCOMPUTER" bei Verschiebung = 3
		 */

		// Konstante
		int LaengeDesAlphabets = 26;

		if ((verschiebung >= 0) && verschiebung <= 26) {

			String entschluesselteZeichenkette = zeichenNacheindanderEntschluesseln(verschluesselteZeichenkette,
					verschiebung, LaengeDesAlphabets);

			System.out.println(entschluesselteZeichenkette);
		} else {
			System.out.println("Verschiebung wird nicht unterstützt.");
		}

		

	}

	public static String zeichenNacheindanderEntschluesseln(String verschluesselteZeichenkette, int verschiebung,
			int LaengeDesAlphabets) {

		/*
		 * Diese Funktion entschlüsstelt die Buchstaben einer
		 * verschluesselteZeichenkette bei gegebener verschiebung unter der Verwendung
		 * der LaengeDesAlphabets und gibt die entschlüsselte Zeichenkette zurück.
		 * 
		 * zusätzlich: Umlaute und andere Zeichen werden nicht entschlüsselt, aber mit
		 * zurückgegeben, damit z.B. Leerzeichen und Satzzeichen zum Einsatz kommen
		 * können
		 */

		String entschluesselteZeichenkette = "";
		for (int index = 0; index <= verschluesselteZeichenkette.length() - 1; index++) {

			int differenzKleinGroß = 32;
			int asciicodeDesZeichens = (int) verschluesselteZeichenkette.charAt(index);
			int codeVonA = 65;
			int codeVona = 97;
			int codeVonZ = 90;
			int codeVonz = 122;
			/*
			 * Entschlüssellung hat Übertrag, welcher durch Verschiebung mit
			 * LaengeDesAlphabets ausgeglichen werden muss. Es werden nur Großbuchstaben als
			 * Entschlüsselte Zeichenkette ausgegeben, wodurch kleine Buchstaben durch die
			 * differenzKleinGroß in große Buchstaben umgewandelt werden -> keinen
			 * Unterschied zwischen Groß- und Kleinschreibung machen.
			 * 
			 */
			// kleiner Buchstabe (mit Übertrag)
			if (((asciicodeDesZeichens) >= codeVona) && ((asciicodeDesZeichens) < codeVona + verschiebung)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung + LaengeDesAlphabets
						- differenzKleinGroß);
			}

			// großer Buchstabe (mit Übertrag)
			else if (((asciicodeDesZeichens) >= codeVonA) && ((asciicodeDesZeichens) < codeVonA + verschiebung)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung + LaengeDesAlphabets);
			}

			// kleiner Buchstabe (ohne Übertrag)
			else if (((asciicodeDesZeichens) >= codeVona + verschiebung) && ((asciicodeDesZeichens) <= codeVonz)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung - differenzKleinGroß);
			}

			// großer Buchstabe (ohne Übertrag)
			else if (((asciicodeDesZeichens) >= codeVonA + verschiebung) && ((asciicodeDesZeichens) <= codeVonZ)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung);

				// alle übrigen Zeichen
			} else {
				entschluesselteZeichenkette += (char) (asciicodeDesZeichens);
			}

		}
		return entschluesselteZeichenkette;
	}

}
