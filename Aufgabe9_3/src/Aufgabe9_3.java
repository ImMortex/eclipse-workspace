
public class Aufgabe9_3 {

	public static int numberOfPizzaSlices(int cuts) {

		if (cuts < 0) {
			return 0;
		}

		// kein Schnitt, die Pizza bleibt komplett
		int number = 0;
		if (cuts == 0) {

			number = 1;

		} else {

			number = cuts + numberOfPizzaSlices(cuts - 1);
		}

		return number;
	}

}
