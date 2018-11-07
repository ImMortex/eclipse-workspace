import java.io.*;

public class Aufgabe3_1 {
	public static void main(String[] args) throws IOException {
		FileReader myFileReader = new FileReader("Text.txt"); // filepath z.B. "C:\\Users\\chris\\Documents\\Wichtig\\Sicher\\Informatik\\Java-Ordner\\Eclipse-Workspace\\Aufgabe3_1\\Text.txt" nur bei Windows
		BufferedReader myBufferedReader = new BufferedReader(myFileReader);
		int anzahl = 0;
		String zeile = "";
		for (int zaehler = 1; (zeile = myBufferedReader.readLine()) != null; zaehler++) {
			anzahl = zaehler;
			System.out.println(zaehler + " " + zeile);
		}
		System.out.println("");
		System.out.println("Es waren " + anzahl + " Zeilen in der Textdatei enthalten");
		myBufferedReader.close();
		FileWriter myFileWriter = new FileWriter ("Text.txt",true);
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		myBufferedWriter.newLine();
		myBufferedWriter.write("Englisch");
		myBufferedWriter.newLine();
		myBufferedWriter.write("Programmierung");
		myBufferedWriter.close();
		
	}
}