import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Aufgabe7_3SortTest {

	@Test
	void testBubbleSort() {
		int[] array = { 5, 6, 4, 2, 2, 7, 1 };
		int[] soll = { 1, 2, 2, 4, 5, 6, 7 };
		assertTrue(Arrays.equals(Aufgabe7_3.bubbleSortIntegerAufsteigend(array), soll));
	}
	@Test
	void testSelectionSort() {
		int[] array = { 5, 6, 4, 2, 2, 7, 1 };
		int[] soll = { 1, 2, 2, 4, 5, 6, 7 };
		assertTrue(Arrays.equals(Aufgabe7_3.selectionSortIntegerAufsteigend(array), soll));
	}
}
