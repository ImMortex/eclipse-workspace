package DEA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe10_5Test {
	
	private short[][] matrix() {
		short[][] myAdjacencyMatrix = {

				{ -1, 1, 0, -1 }, //
				{ -1, -1, 0, 1 }, //
				{ -1, 1, -1, 0 }, //
				{ -1, -1, -1, -1 } //
		};
		return myAdjacencyMatrix;
	}

	@Test
	void test01() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = { 0, 1 };
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 1);
	}

	@Test
	void test0() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = { 0 };
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);

		printTest(myInput, currentState);
		assertTrue(currentState == 2);
	}

	private void printTest(short[] myInput, int currentState) {
		for (int index = 0; index <= myInput.length - 1; index++) {
			System.out.print(myInput[index] + ", ");
		}
		System.out.println();
		System.out.println(currentState);
		System.out.println();
	}

	@Test
	void test1() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = { 1 };
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 1);

	}

	@Test
	void test010() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = { 0, 1, 0 };
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 2);
		assertFalse(currentState == 0);
		assertFalse(currentState == 1);
		assertFalse(currentState == 3);
	}



	@Test
	void test() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {};
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 0);
	}
	
	@Test
	void test11() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {1,1};
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 3);
	}
	
	@Test
	void test00() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {0,0};
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 3);
	}

	@Test
	void test10() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {1,0};
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 2);
	}
	
	@Test
	void testRepeat10() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {1,0};
		int previousState = 2;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 2);
	}
	
	@Test
	void testRepeat01() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {0,1};
		int previousState = 1;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 1);
	}
	
	@Test
	void testRepeat10After010() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {1,0};
		int previousState = 2;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 2);
	}
	
	@Test
	void test0100() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {1,0,0,0};
		int previousState = 0;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 3);
	}
	
	@Test
	void testRepeat0After010() {
		short[][] myAdjacencyMatrix = matrix();

		short[] myInput = {0};
		int previousState = 2;

		int currentState = Aufgabe10_5.processInputWithFSM(myAdjacencyMatrix, myInput, previousState);
		printTest(myInput, currentState);
		assertTrue(currentState == 3);
	}
	

}
