
public class Aufgabe3_2 {
	public static void main(String[] args) {
		int i1 = 3;
		double d1 = 1.7;
		double d2 = d1 * i1;
		long l1 = i1; /*
						 * Der Integer i1 wird zu einem long l1 umgewandelt. Es wird der mögliche
						 * Wertebereich erhöht und ein "l" hinter den Zahlenwert angehängt
						 */
		String s1 = "xyz";
		String s2 = s1 + i1;

		System.out.println(d2); /*
								 * d2 ist als double deklariert. Also wird der integer i1 auch in double
								 * umgeformt, um die Berechnung zu ermöglichen. d1 ist bereits ein double. Beide
								 * Faktoren müssen die Darstellung haben
								 */
		System.out.println(s2); /*
								 * Das "+" konkateniert zwei Variablen zu eienm String. In diesem Fall wird der
								 * integer i1 an den String s1 anghängt, sodass sich der String s2 ergibt.
								 */
		long l = 100;
		int i = (int)l;
		double d = 3.14;
		float f = (int)d;
	}
}
