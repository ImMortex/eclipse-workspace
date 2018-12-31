
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
			System.out.println("Verschiebung wird nicht unterst�tzt.");
		}

		

	}

	public static String zeichenNacheindanderEntschluesseln(String verschluesselteZeichenkette, int verschiebung,
			int LaengeDesAlphabets) {

		/*
		 * Diese Funktion entschl�sstelt die Buchstaben einer
		 * verschluesselteZeichenkette bei gegebener verschiebung unter der Verwendung
		 * der LaengeDesAlphabets und gibt die entschl�sselte Zeichenkette zur�ck.
		 * 
		 * zus�tzlich: Umlaute und andere Zeichen werden nicht entschl�sselt, aber mit
		 * zur�ckgegeben, damit z.B. Leerzeichen und Satzzeichen zum Einsatz kommen
		 * k�nnen
		 */

		String entschluesselteZeichenkette = "";
		for (int index = 0; index <= verschluesselteZeichenkette.length() - 1; index++) {

			int differenzKleinGro� = 32;
			int asciicodeDesZeichens = (int) verschluesselteZeichenkette.charAt(index);
			int codeVonA = 65;
			int codeVona = 97;
			int codeVonZ = 90;
			int codeVonz = 122;
			/*
			 * Entschl�ssellung hat �bertrag, welcher durch Verschiebung mit
			 * LaengeDesAlphabets ausgeglichen werden muss. Es werden nur Gro�buchstaben als
			 * Entschl�sselte Zeichenkette ausgegeben, wodurch kleine Buchstaben durch die
			 * differenzKleinGro� in gro�e Buchstaben umgewandelt werden -> keinen
			 * Unterschied zwischen Gro�- und Kleinschreibung machen.
			 * 
			 */
			// kleiner Buchstabe (mit �bertrag)
			if (((asciicodeDesZeichens) >= codeVona) && ((asciicodeDesZeichens) < codeVona + verschiebung)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung + LaengeDesAlphabets
						- differenzKleinGro�);
			}

			// gro�er Buchstabe (mit �bertrag)
			else if (((asciicodeDesZeichens) >= codeVonA) && ((asciicodeDesZeichens) < codeVonA + verschiebung)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung + LaengeDesAlphabets);
			}

			// kleiner Buchstabe (ohne �bertrag)
			else if (((asciicodeDesZeichens) >= codeVona + verschiebung) && ((asciicodeDesZeichens) <= codeVonz)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung - differenzKleinGro�);
			}

			// gro�er Buchstabe (ohne �bertrag)
			else if (((asciicodeDesZeichens) >= codeVonA + verschiebung) && ((asciicodeDesZeichens) <= codeVonZ)) {
				entschluesselteZeichenkette += (char) ((asciicodeDesZeichens) - verschiebung);

				// alle �brigen Zeichen
			} else {
				entschluesselteZeichenkette += (char) (asciicodeDesZeichens);
			}

		}
		return entschluesselteZeichenkette;
	}

}
