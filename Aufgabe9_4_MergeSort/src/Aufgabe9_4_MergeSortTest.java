import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe9_4_MergeSortTest {

	private void compareArraysIfEqual(int[] myArray, int[] soll) {
		int[] ist = Aufgabe9_4_MergeSort.sort(myArray);
		for (int i = 0; i <= ist.length - 1; i++) {
			System.out.print(ist[i] + " ");
		}
		System.out.println();
		System.out.println();
		assertArrayEquals(ist, soll);
	}

	private void compareArraysIfNotEqual(int[] myArray, int[] soll) {
		int[] ist = Aufgabe9_4_MergeSort.sort(myArray);
		assertFalse(ist.equals(soll));
	}

	@Test
	void testFail() {

		int[] myArray = { 2 };
		int[] soll = { 3 };
		compareArraysIfNotEqual(myArray, soll);
	}

	@Test
	void test0() {

		int[] myArray = {};

		int[] soll = {};
		compareArraysIfEqual(myArray, soll);
	}

	@Test
	void testMerge00() {
		int[] array1 = { 3 };
		int[] array2 = { 1 };
		int[] soll = { 1, 3 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	@Test
	void testMerge0() {
		int[] array1 = { 1 };
		int[] array2 = { 3, 4 };
		int[] soll = { 1, 3, 4 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	@Test
	void testMerge1() {
		int[] array1 = { 1, 2 };
		int[] array2 = { 3, 4 };
		int[] soll = { 1, 2, 3, 4 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	@Test
	void testMerge2() {
		int[] array1 = { 3, 4, };
		int[] array2 = { 1, 2 };
		int[] soll = { 1, 2, 3, 4 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	@Test
	void testMerge3() {
		int[] array1 = { 1, 2 };
		int[] array2 = { 1, 2 };
		int[] soll = { 1, 1, 2, 2 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	@Test
	void testMerge4() {
		int[] array1 = { 1, 2 };
		int[] array2 = { 1, 2, 3 };
		int[] soll = { 1, 1, 2, 2, 3 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	@Test
	void testMerge5() {
		int[] array1 = { 10, 12 };
		int[] array2 = { 1, 2, 112 };
		int[] soll = { 1, 2, 10, 12, 112 };
		testIfArraysMergedCorrectly(array1, array2, soll);
	}

	private void testIfArraysMergedCorrectly(int[] array1, int[] array2, int[] soll) {
		int[] ist = Aufgabe9_4_MergeSort.merge(array1, array2);
		assertArrayEquals(ist, soll);
	}

	@Test
	void testSort1() {

		int[] myArray = { 1 };

		int[] soll = { 1 };
		compareArraysIfEqual(myArray, soll);
	}

	@Test
	void testSort2() {

		int[] myArray = { 1, 2 };
		int[] soll = { 1, 2 };
		compareArraysIfEqual(myArray, soll);
	}

	@Test
	void testSort3() {

		int[] myArray = { 2, 1 };

		int[] soll = { 1, 2 };
		compareArraysIfEqual(myArray, soll);
	}

	@Test
	void testSort4() {

		int[] myArray = { 6, 1, 2 };

		int[] soll = { 1, 2, 6 };
		compareArraysIfEqual(myArray, soll);
	}

	@Test
	void testSort5() {

		int[] myArray =

				{ 25, 24, 11, 10, 14, 13, 12, 5, 23, 9, 8, 7, 20, 19, 5, 6, 15, 22, 21, 17, 16, 18, 4, 3, 2, 1, 0 };

		int[] soll =

				{ 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };

		compareArraysIfEqual(myArray, soll);
	}

}
