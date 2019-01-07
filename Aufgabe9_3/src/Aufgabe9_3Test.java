import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe9_3Test {
	
	
	@Test
	void testn1() {
		testNumberOfCuts(-1, 0);
	}
	
	@Test
	void test0() {
		testNumberOfCuts(0, 1);
	}

	@Test
	void test1() {
		testNumberOfCuts(1, 2);
	}

	@Test
	void test2() {
		testNumberOfCuts(2, 4);
	}

	@Test
	void test3() {
		testNumberOfCuts(3, 7);
	}
	
	@Test
	void test4() {
		testNumberOfCuts(4, 11);
	}

	private void testNumberOfCuts(int number, int slices) {
		System.out.print("number of cuts: " + number);
		System.out.println(" slices: " + Aufgabe9_3.numberOfPizzaSlices(number));
		assertTrue(Aufgabe9_3.numberOfPizzaSlices(number) == slices);
	}

}
