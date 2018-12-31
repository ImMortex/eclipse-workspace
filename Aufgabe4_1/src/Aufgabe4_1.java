import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Aufgabe4_1 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe der Wortl�nge: ");
		int laenge = myScanner.nextInt();
		myScanner.close();

		if (laenge >= 0 && laenge <= Integer.MAX_VALUE) {
			String wort = "";
			int haelfte = laenge / 2;
			Random random = new Random();
			char myChar = ' ';
			int fall = 0;
			int differenz = 1;

			if (laenge % 2 != 0) {/*
									 * bei ungerader L�nge wird vorne ein Zeichen mehr genommen und nicht mit
									 * gespiegelt
									 */
				haelfte++;
				differenz++;//f�r Spiegelung ein Zeichen mehr von der H�lfte abgeschnitte
			}

			for (int i = 0; i <= haelfte - 1; i++) {// zuf�lliges Zeichen erstellt
				fall = (0 + random.nextInt(3));
				switch (fall) {
				case (0):
					myChar = (char) (65 + random.nextInt(26)); // zuf�lliger Gro�buchstabe von A bis Z
					break;
				case (1):
					myChar = (char) (97 + random.nextInt(26)); // zuf�lliger Kleinbuchstabe von a bis z
					break;
				case (2):
					myChar = (char) (48 + random.nextInt(10)); // zuf�lliger  Zahle von 0 bis 9
					break;
				}
				wort = wort + myChar;
			}
			for (int i = haelfte - differenz; i >= 0; i--) {
				wort = wort + wort.charAt(i);
			}
			System.out.println("Ausgabe: " + wort);
		} else {
			System.out.println("Falsche Eingabe. Die ganze Zahl muss ein positiver Integer sein.");
		}
	}

}
