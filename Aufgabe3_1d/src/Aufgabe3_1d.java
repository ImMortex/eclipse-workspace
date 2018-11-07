import java.io.*;
import java.util.Scanner;

public class Aufgabe3_1d {
	public static void main(String[] args) throws IOException {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Geben Sie Ihren Nachnamen an: ");
		String name = myScanner.next();
		System.out.println("Geben Sie Ihren Vornamen an: ");
		String vorname = myScanner.next();
		System.out.println("Geben Sie Ihren Wohnort an: ");
		String wohnort = myScanner.next();
		myScanner.close();

		FileWriter myFileWriter = new FileWriter("Personenangaben.txt");
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		myBufferedWriter.write("Name: " + name);
		myBufferedWriter.newLine();
		myBufferedWriter.write("Vorname: " + vorname);
		myBufferedWriter.newLine();
		myBufferedWriter.write("Wohnort: " + wohnort);
		myBufferedWriter.newLine();
		myBufferedWriter.close();
		myFileWriter.close();

	}

}
