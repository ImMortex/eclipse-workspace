import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class P1L1A04B {
	public static void main(String[] args) throws IOException {

		if (args.length == 1) {
			String filenameInklusivePfadangabe = "";
			filenameInklusivePfadangabe = args[0];

			int maximaleSumme = maximaleSummeProZeileInDatei(filenameInklusivePfadangabe);
			System.out.println("maximale Punktzahl in der Zeile = " + maximaleSumme);
		} else {
			System.out.println("Fehler: Ein Argument ist notwendig. Programm abgebrochen.");
		}

	}

	public static int maximaleSummeProZeileInDatei(String filenameInklusivePfadangabe) throws IOException {

		//diese Funktion summiert die erechneten Punkte aus ALLEN Zeilen und gibt sie zurück
		FileReader meinFileReader = new FileReader(filenameInklusivePfadangabe);

		BufferedReader meinBufferedReader = new BufferedReader(meinFileReader);

		int punkte = 0;
		int summePunkteDerZeilen=0;
		String aktuelleZeile = "";

		while (meinBufferedReader.ready()) {
			aktuelleZeile = meinBufferedReader.readLine();

			if (aktuelleZeile.equals(null) || aktuelleZeile.equals("")) // ist die Zeile leer oder null?
			{
				punkte = 0;
			} else {
				punkte = punkteInZeile(aktuelleZeile);
				summePunkteDerZeilen+=punkte;
			}

		}
		meinBufferedReader.close();
		meinFileReader.close();

		return summePunkteDerZeilen;
	};

	public static int punkteInZeile(String aktuelleZeile) {
		
		//diese Funktion berechnet die maximale Zahl an Punkte in nur EINER übergebenen Zeile und gibt sie zurück

		int punkte = 0;

		for (int stelle = 0; stelle <= aktuelleZeile.length() - 1; stelle++) {

			if ((stelle <= aktuelleZeile.length() - 8)
					// erst schauen, ob noch 7 zeichen folgen können

					&& (aktuelleZeile.charAt(stelle) == 'G') && (aktuelleZeile.charAt(stelle + 1) == 'G')
					&& (aktuelleZeile.charAt(stelle + 2) == 'G') && (aktuelleZeile.charAt(stelle + 3) == 'G')
					&& (aktuelleZeile.charAt(stelle + 4) == 'G') && (aktuelleZeile.charAt(stelle + 7) == 'D')) {
				punkte += 10;
				stelle += 8; // erst nach "GGGGG??D" weitersuchen
			}

			else if ((stelle <= aktuelleZeile.length() - 5)
					// erst schauen, ob noch 4 zeichen folgen können

					&& (aktuelleZeile.charAt(stelle) == 'G') && (aktuelleZeile.charAt(stelle + 1) == 'G')
					&& (aktuelleZeile.charAt(stelle + 2) == 'G') && (aktuelleZeile.charAt(stelle + 3) == 'G')
					&& (aktuelleZeile.charAt(stelle + 4) == 'G')

			) {
				punkte += 5;
				stelle += 5;
			}
			if ((stelle <= aktuelleZeile.length() - 2)
					// erst schauen, ob noch 1 zeichen folgen kann

					&& (aktuelleZeile.charAt(stelle) == 'G') && (aktuelleZeile.charAt(stelle + 1) == 'G')) {
				punkte += 3;
				stelle += 2;
			}

		}
		return punkte;

	}
}
