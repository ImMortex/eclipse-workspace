//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import java.util.Scanner;

public class P1L2A02 {

	public static void main(String[] args) {
		int zahl = 4;
		if (args.length == 1) {
			zahl = Integer.parseInt(args[0]);
		} else {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Eingabe einer natürlichen Zahl:");
			zahl = scanner.nextInt();
			scanner.close();
		}
		System.out.println(describeProcessTo4(zahl, ""));
	}

	public static String describeProcessTo4(int input, String processDescription) {

		// Numbers <= 0 can not be formed with the four
		if (input <= 0) {
			return "";
		} else if (input == 4) {
			return input + processDescription;
		}

		processDescription = " -> " + input + processDescription;

		if (input != 4) {

			// steht eine 4 am Ende?
			if ((input - 4) % 10 == 0) {
				// O1
				input = (input - 4) / 10;

				// Steht eine 0 am Ende?
			} else if (input % 10 == 0) {
				// O2
				input = input / 10;

				// sonst
			} else {
				// O3
				if (input * 2 <= 0) {
					/*
					 * wenn der Wert Integer.Max_Value überschritten wird (überlauf), bricht das
					 * Programm ab, da die Zahl aus 4 im Integerbereich nicht gebildet werden kann.
					 * Somit kann kein Lösungsweg zurückgegeben werden.
					 */
					return "";
				} else {
					input = input * 2;
				}
			}

			processDescription = describeProcessTo4(input, processDescription);
		}

		return processDescription;
	}

}
