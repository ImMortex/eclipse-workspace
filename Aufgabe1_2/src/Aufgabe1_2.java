
public class Aufgabe1_2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 6;

		if ((a > 2) && b < 6) {
			System.out.println("a ist größer 2 und b ist kleiner 6");
		} else if (a > 2) {
			System.out.println("a ist größer 2");
		} else if (b < 6) {
			System.out.println("b ist kleiner 6");
		}
		;
		if ((a > 5) || b > 5) {
			System.out.println("a oder b is zu groß! a=" + a + " b=" + b);
		}

	}

}