import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class Aufgabe6_1 {
	public static void main(String[] args) throws IOException {

		if (args.length < 1) {
			System.out.println("Fehler: Keine Textdatei als Argument übergeben.");
		} else {
			String textdateiPfad = args[0];
			textdateiZuCsvDatei(textdateiPfad);
		}
	}

	public static void textdateiZuCsvDatei(String textdateiPfad) throws FileNotFoundException, IOException {
		String neueDateiPfad = textdateiPfad + "/../adressen.csv";
		FileReader myFileReader = new FileReader(textdateiPfad);
		BufferedReader myBufferedReader = new BufferedReader(myFileReader);
		FileWriter myFileWriter = new FileWriter(neueDateiPfad);
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		String derzeitigeZeile = "";
		String eintrag = "";
		String [] tabellenUeberschriften = new String[1];
		int anzahlDatensaetze = 0;
		Boolean tabellenKopf = false;
		 

		for (int i = 0; i <= 3; i++) {
			derzeitigeZeile = myBufferedReader.readLine();

			anzahlDatensaetze = i+1;
			String [] tmp = new String [tabellenUeberschriften.length+1]; //temporäres Array, um Array tabellenUeberschriften zu vergrößern
			
		
			String teilstring[] = derzeitigeZeile.split(": ");//Trennzeichen
			System.arraycopy(tabellenUeberschriften, 0, tmp, 0, tabellenUeberschriften.length);
			tabellenUeberschriften=tmp;
			tabellenUeberschriften[i] = teilstring[0];	
			myBufferedWriter.write(teilstring[0] + ";");
			System.out.println(tabellenUeberschriften[i]);

		}
		myFileReader.close();
		myFileReader = new FileReader(textdateiPfad);
		myBufferedReader = new BufferedReader(myFileReader);
		myBufferedWriter.newLine();

		for (int i = 1; myBufferedReader.ready(); i++) {
			derzeitigeZeile = myBufferedReader.readLine();

			/*
			 * if (tabellenKopf == false) { myBufferedWriter.write("Name;Vorname;PLZ;Ort");
			 * myBufferedWriter.newLine(); tabellenKopf = true; }
			 */

			/*
			 * switch (i) { case 1: eintrag = derzeitigeZeile.substring("Name:".length()) +
			 * ";"; break; case 2: eintrag = derzeitigeZeile.substring("Vorname:".length())
			 * + ";"; break; case 3: eintrag = derzeitigeZeile.substring("PLZ:".length()) +
			 * ";"; break; case 4: eintrag = derzeitigeZeile.substring("Ort:".length()) +
			 * ";";
			 * 
			 * break; case 5: eintrag = ""; i = 0; break; }
			 */
			if (i >= anzahlDatensaetze) {
				i=1;
				eintrag = "";
			} else {
				for (int z = 0; z <= anzahlDatensaetze - 1; z++) {
					String teilstring[] = derzeitigeZeile.split(": ");
					eintrag =( derzeitigeZeile.substring(tabellenUeberschriften[z].length()))+";";
				}
			}

			myBufferedWriter.write(eintrag + "");
			if (i == anzahlDatensaetze) {
				myBufferedWriter.newLine();
			}
		}
		myBufferedReader.close();
		myBufferedWriter.close();
	}
}
