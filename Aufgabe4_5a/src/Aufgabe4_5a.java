
public class Aufgabe4_5a {
	public static void main(String[] args) {
		int a = 5; // a deklariert, a=5
		int b; // a=5; b deklariert b=Null

		b = a-- - a; /*
						 * a=5 b=5 -4 =1 erst wird für a 5 eingesetzt, dann wird a=5 durch den Postfix
						 * -- a=4 gesetzt. Dann wird die eingesetzte 5 - den neuen Wert a=4 gerechnet
						 */
		System.out.println("a: " + a); // a=4
		System.out.println("b: " + b); // b=1
	}
}
