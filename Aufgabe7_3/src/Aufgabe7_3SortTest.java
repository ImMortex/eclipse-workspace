import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Aufgabe7_3SortTest {

	@Test
	void testSelectionSort() {

		int[] array = { 5, 6, 4, 2, 2, 7, 1 };
		int[] soll = { 1, 2, 2, 4, 5, 6, 7 };
		int[] ist = Aufgabe7_3.selectionSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}

	@Test
	void testSelectionSortBestCase() {

		int[] array = { 1, 2, 4, 5, 6, 7 };
		int[] soll = { 1, 2, 4, 5, 6, 7 };
		int[] ist = Aufgabe7_3.selectionSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}

	@Test
	void testSelectionSortWorstCase() {

		int[] array = { 6, 5, 4, 3, 2, 1, 0 };
		int[] soll = { 0, 1, 2, 3, 4, 5, 6 };
		int[] ist = Aufgabe7_3.selectionSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}

	@Test
	void testBubbleSort() {

		int[] array = { 5, 6, 4, 2, 2, 7, 1 };
		int[] soll = { 1, 2, 2, 4, 5, 6, 7 };
		int[] ist = Aufgabe7_3.bubbleSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}

	@Test
	void testBubbleSortBestCase() {

		int[] array = { 1, 2, 4, 5, 6, 7 };
		int[] soll = { 1, 2, 4, 5, 6, 7 };
		int[] ist = Aufgabe7_3.bubbleSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}

	@Test
	void testBubbleSortWorstCase() {

		int[] array = { 6, 5, 4, 3, 2, 1, 0 };
		int[] soll = { 0, 1, 2, 3, 4, 5, 6 };
		int[] ist = Aufgabe7_3.bubbleSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}

	@Test
	void testRekursivesBubbleSort() {

		int[] array = { 5, 6, 4, 2, 2, 7, 1 };
		int[] soll = { 1, 2, 2, 4, 5, 6, 7 };
		int[] ist = Aufgabe7_3.rekursivBubbleSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);
	}

	@Test
	void testRekursivesBubbleSortBestCase() {

		int[] array = { 1, 2, 4, 5, 6, 7 };
		int[] soll = { 1, 2, 4, 5, 6, 7 };
		int[] ist = Aufgabe7_3.rekursivBubbleSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);

	}
	
	@Test
	void testRekursivesBubbleSortWorstCase() {

		int[] array = { 6, 5, 4, 3, 2, 1, 0 };
		int[] soll = { 0, 1, 2, 3, 4, 5, 6 };
		int[] ist = Aufgabe7_3.rekursivBubbleSortIntegerAufsteigend(array);

		assertArrayEquals(soll, ist);
	}

}
