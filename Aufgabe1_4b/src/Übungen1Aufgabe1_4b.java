import java.util.Scanner;

public class Übungen1Aufgabe1_4b {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		double radius;
		int flaecheninhalt;
		System.out.print("Eingabe des Radius: ");
		radius = myScanner.nextDouble();
		flaecheninhalt = (int) (Math.round(Math.PI * radius * radius));
		System.out.println("Ausgabe: " + flaecheninhalt);
		myScanner.close();
	}
}
