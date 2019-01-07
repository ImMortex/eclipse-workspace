import java.util.Scanner;

public class StringToArrayConverter {

	public static void main(String[] args) {

		String inputString = inputString();

		char[][] returnedArray = inputStringToCharArray(inputString);

		printArray(returnedArray);
	}

	public static void printArray(char[][] returnedArray) {
		/*
		 * This method goes trough the array and prints it so that it looks like the
		 * Java-syntax of the array content.
		 */
		System.out.print("\n");

		for (int y = 0; y <= returnedArray.length - 1; y++) {

			System.out.print("{");			
			for (int x = 0; x <= returnedArray[0].length - 1; x++) {
				if (x == returnedArray[0].length - 1) {
					System.out.print("'" + returnedArray[y][x] + "'");
				} else {
					System.out.print("'" + returnedArray[y][x] + "',");
				}
			}
			System.out.print("}\n");
		}
	}

	public static String inputString() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(
				"Eingabe String, der Leerzeichen enthält. String wird in zweidemensionales Char-Array konvertiert:");
		String inputString = myScanner.nextLine();
		myScanner.close();
		return inputString;
	}

	public static char[][] inputStringToCharArray(String inputString) {
		/*
		 * This function converts a String to a 2d char array and returns the array.
		 * Spaces are indicators to begin a new row in the 2d array.
		 */

		int biggestWordLength = 0; // maximum (= x)
		// word = chars without space, its content does not need to make sense
		int actualWordLenght = 0; // counter
		int numberOfWords = 1; // counter (= y)
		int lastIndex = inputString.length() - 1; // loop end

		// calculates x = biggestWordLength and y = numberOfWords for the declaring of
		// char[y][x] returnedArray
		for (int index = 0; index <= lastIndex; index++) {
			if ((inputString.charAt(index) == ' ')) {
				numberOfWords++;
				biggestWordLength = updateBiggestWordLength(biggestWordLength, actualWordLenght);
				if (index != lastIndex) {
					actualWordLenght = 0;
				}
			} else {
				actualWordLenght++;
			}

			if (index == lastIndex) {
				biggestWordLength = updateBiggestWordLength(biggestWordLength, actualWordLenght);
			}
		}

		// declaring of char[y][x] returnedArray
		char[][] array = new char[numberOfWords][biggestWordLength];
		int y = 0;
		int x = 0;
		for (int index = 0; index <= inputString.length() - 1; index++) {
			if (inputString.charAt(index) == ' ') {
				x = 0;
				y++;
			} else {
				array[y][x] = inputString.charAt(index);
				x++;
			}
		}
		return array;
	}

	public static int updateBiggestWordLength(int biggestWordLength, int actualWordLenght) {
		/*
		 * This function updates the biggestWordLength of all words (chars without
		 * space) to get the width of the array with equally long rows.
		 */
		if (actualWordLenght > biggestWordLength) {
			biggestWordLength = actualWordLenght;
		}
		return biggestWordLength;
	}

}
