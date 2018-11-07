import java.util.Scanner;

public class Aufgabe1_4a {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int eingabeSeiteA;
		int eingabeSeiteB;
		int umfang;
		System.out.print("Eingabe der Seite a: ");
		eingabeSeiteA = myScanner.nextInt();
		System.out.print("Eingabe der Seite b: ");
		eingabeSeiteB = myScanner.nextInt();
		umfang = eingabeSeiteA * 2 + eingabeSeiteB * 2;

		System.out.print("Ein Rechteck mit den Kantenlängen " + eingabeSeiteA + " und " + eingabeSeiteB
				+ " hat einen Umfang von " + umfang + " .");
		myScanner.close();
	}

}
