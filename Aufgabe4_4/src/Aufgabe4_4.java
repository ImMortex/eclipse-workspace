
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aufgabe4_4 {
	public static void main(String[] args) throws IOException {
		FileReader myFileReader = new FileReader("Text.txt"); // filepath
																// z.B.
																// "C:\\Users\\chris\\Documents\\Wichtig\\Sicher\\Informatik\\Java-Ordner\\Eclipse-Workspace\\Aufgabe3_1\\Text.txt"
																// nur
																// bei
																// Windows
		BufferedReader myBufferedReader = new BufferedReader(myFileReader);
		int anzahlZeilen = 0;
		int anzahlZeichen = 0;
		int anzahlTeilstring = 0;
		String teilstring = "programmierung";
		boolean vorhanden = false;
		String zeile = "";
		int asciiCodes[][] = new int[2][teilstring.length()];

		for (int z = 0; z <= teilstring.length() - 1; z++) {
			asciiCodes[0][z] = teilstring.codePointAt(z);
			if (asciiCodes[0][z] >= 65 && asciiCodes[0][z] <= 90) // wenn es ein Gro�buchstabe ist
			{
				asciiCodes[0][z] = teilstring.codePointAt(z) + 32; // [0][z] f�r Kleinbuchstaben
				asciiCodes[1][z] = teilstring.codePointAt(z); // [1][z] f�r Gro�buchstaben
			}
			else if (asciiCodes[0][z] >= 97 && asciiCodes[0][z] <= 122) // wenn es ein Kleinbuchstabe ist
			{
				{
					asciiCodes[0][z] = teilstring.codePointAt(z);
					asciiCodes[1][z] = teilstring.codePointAt(z) - 32;
				}
			}
			System.out.println(asciiCodes[0][z] + " " + asciiCodes[1][z]);
			System.out.println((char) (asciiCodes[0][z]) + " " + (char) (asciiCodes[1][z]));
		}

		for (int zeilen = 1; (zeile = myBufferedReader.readLine()) != null; zeilen++) {
			anzahlZeilen = zeilen;
			anzahlZeichen = anzahlZeichen + zeile.length();

			for (int zeichen = 0; zeichen <= zeile.length() - 1; zeichen++) {
				vorhanden = false;
				if (zeichen <= zeile.length() - teilstring.length()) { // Suche nach Teilstring
					for (int i = 0; i <= teilstring.length() - 1; i++) {
						if (zeile.charAt(zeichen + i) == asciiCodes[0][i]
								^ zeile.charAt(zeichen + i) == asciiCodes[1][i]) {
							vorhanden = true;
						} else {
							vorhanden = false;
							break;
						}
					}
				}
				if (vorhanden == true) {

					anzahlTeilstring++;
					zeichen = zeichen + teilstring.length(); // Sprung hinter gefundenen Teilstring
				}
			}
			if (zeile.isEmpty()) {
				System.out.println("| Zeichen: " + anzahlZeichen);
			} else {
				System.out.println(zeile + " | Zeichen:" + anzahlZeichen + " " + zeile.charAt(0) + " "
						+ zeile.charAt(zeile.length() - 1));
			}
		}
		System.out.println("");
		System.out.println("Es waren " + anzahlZeilen + " Zeilen in der Textdatei enthalten");
		System.out.println(
				"Der Teilstring '" + teilstring + "' war " + anzahlTeilstring + " mal in der Textdatei enthalten");
		myBufferedReader.close();
		myFileReader = new FileReader("Text.txt");  //FileReader wieder neu ge�ffnet
		myBufferedReader = new BufferedReader(myFileReader);
		FileWriter myFileWriter = new FileWriter("Text.txt", true);
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		while ((zeile = myBufferedReader.readLine()) != null) {
			myBufferedWriter.newLine();
			myBufferedWriter.write(zeile.toUpperCase());
			System.out.println(zeile);
		}
		myBufferedReader.close();
		myBufferedWriter.close();

	}
}