
public class P1L1A02 {
	public static void main(String[] args) {

		//Eingabe
		String myString = "Hannah";
		System.out.println(isPalindrom(myString));

	}

	public static boolean isPalindrom(String myString) {
		Boolean ausgabe;
		char charVorne = myString.charAt(0);
		char charHinten = myString.charAt(myString.length() - 1);

		if (myString.length() == 1) {
			ausgabe = true;
		} else if ((myString.length() == 2) && (gleichheit(charVorne, charHinten))) {
			ausgabe = true;
		} else if ((myString.length() >= 2) && (gleichheit(charVorne, charHinten))) {
			myString = myString.substring(1, myString.length() - 1);
			ausgabe = isPalindrom(myString);
		} else {
			ausgabe = false;
		}
		return ausgabe;
	}

	public static boolean gleichheit(char charVorne, char charHinten) {
		return ((charVorne >= 48 && charVorne <= 57) && (charVorne == charHinten)) // Nur Zahlen

				|| ((charVorne >= 65 && charVorne <= 90) && ((charVorne == charHinten)
						|| (charVorne == (char) (charHinten - 32)))) /* Groß-Groß oder Groß-klein */

				|| ((charVorne >= 97 && charVorne <= 122) && ((charVorne == charHinten)
						|| (charVorne == (char) (charHinten + 32))));/* Klein-Klein oder Klein-Groß */
	}
	
}
