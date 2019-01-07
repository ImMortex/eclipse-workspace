
public class Aufgabe9_3 {

	public static int numberOfPizzaSlices(int cuts) {
		// kein Schnitt, die Pizza bleibt komplett
		int number = 0;
		if (cuts <= 0) {
			number = 1;
		} else {
			number = number + numberOfPizzaSlices(cuts - 1);
		}

		return number;
	}

}
