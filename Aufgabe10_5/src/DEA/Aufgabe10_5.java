package DEA;

import java.util.Scanner;

public class Aufgabe10_5 {

	public static void main(String[] args) {

		short[][] myAdjacencyMatrix = {

				{ -1, 1, 0, -1 }, //
				{ -1, -1, 0, 1 }, //
				{ -1, 1, -1, 0 }, //
				{ -1, -1, -1, -1 } //
		};

		String priviousInputString = "";
		String myInputString = "";
		int myCurrentState = 0;
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Eingabe:");
		while (myCurrentState == 0 || myCurrentState == 2) {

			myInputString += myScanner.nextLine();

			short[] myInput = new short[myInputString.length()];

			for (int index = 0; index < myInputString.length(); index++) {
				if (myInputString.charAt(index) == '0') {
					myInput[index] = 0;
				} else if (myInputString.charAt(index) == '1') {
					myInput[index] = 1;
				}
			}

			myCurrentState = processInputWithFSM(myAdjacencyMatrix, myInput, 0);

			if (myCurrentState == 2) {

				if (priviousInputString.equals(myInputString)) {
					System.out.println("Ihre Eingabe war korrekt.");
				} else {
					System.out.println("Nächste Eingabe:");
				}
			} else if (myCurrentState == 0) {
				System.out.println("Ihre Eingabe war leer. Nächste Eingabe:");

			} else if (myCurrentState == 1) {
				System.out.println("Ihre letzte Eingabe '" + myInputString
						+ "' war nicht korrekt. \nEine 0 muss die letzte Zahl sein");
				System.out.println("Das Programm wird abgebrochen.");

			} else if (myCurrentState == 3) {
				System.out.println("Ihre letzte Eingabe '" + myInputString
						+ "' war nicht korrekt. \nEs dürfen nicht zwei identische Zahlen direkt aufeinander folgen.");
				System.out.println("Das Programm wird abgebrochen.");

			}

			priviousInputString = myInputString;
		}
		myScanner.close();
	}

	public static int processInputWithFSM(short[][] myAdjacencyMatrix, short[] myInput, int myCurrentState) {
		
		for (int index = 0; index <= myInput.length - 1; index++) {
			int input = myInput[index];

			for (int nextState = 0;  index <= myInput.length - 1 && nextState <= myAdjacencyMatrix.length - 1; nextState++) {
				{short content = myAdjacencyMatrix[myCurrentState][nextState];

					if ((content != -1) && (content == input)) {

						myCurrentState = nextState;

						break;
					}
				}
			}
		}

		return myCurrentState;
	}

}
