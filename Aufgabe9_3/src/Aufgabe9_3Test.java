import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe9_3Test {

	@Test
	void test1() {
		int n = 3;
		System.out.println(Aufgabe9_3.numberOfPizzaSlices(n));
		assertTrue(Aufgabe9_3.numberOfPizzaSlices(n) == 7);
		
	}

}
