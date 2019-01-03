
public class Aufgabe7_3 {
	public static void main(String[] args) {

		int[] arrayZahlen = { 5, 2, 6, 4, 2, 7, 1 };
		arrayZahlen = rekursivBubbleSortIntegerAufsteigend(arrayZahlen);

		ausgabeSortiertesArray(arrayZahlen);
	}

	public static int[] bubbleSortIntegerAufsteigend(int[] arrayZahlen) {

		long startTime = System.nanoTime(); //Zeitmessung

		int pointer = arrayZahlen.length - 1;

		for (int durchlauf = 0; durchlauf <= arrayZahlen.length - 1; durchlauf++) {

			for (int index = 0; index <= pointer - 1; index++) {
				if (arrayZahlen[index] > arrayZahlen[index + 1]) {
					arrayZahlen = swapInteger(arrayZahlen, index, index + 1);
				}
			}
			pointer--;
		}

		long endTime = System.nanoTime();
		long runningTime = (endTime - startTime);
		System.out.println("BubbleSort runtime: " + runningTime + " ns");

		return arrayZahlen;
	}

	public static int[] rekursivBubbleSortIntegerAufsteigend(int[] arrayZahlen) {

		long startTime = System.nanoTime();

		int pointer = arrayZahlen.length - 1;
		arrayZahlen = rekursionBubbleSort(arrayZahlen, 0, 0, pointer);

		long endTime = System.nanoTime();
		long runningTime = (endTime - startTime);
		System.out.println("rekursivesBubbleSort runtime: " + runningTime + " ns");

		return arrayZahlen;
	}

	public static int[] rekursionBubbleSort(int[] arrayZahlen, int durchlauf, int index, int pointer) {

		
		if (durchlauf <= arrayZahlen.length - 1) {

			if (index <= pointer - 1) {

				if (arrayZahlen[index] > arrayZahlen[index + 1]) {
					arrayZahlen = swapInteger(arrayZahlen, index, index + 1);
				}

				arrayZahlen = rekursionBubbleSort(arrayZahlen, durchlauf, index + 1, pointer);
			} else {
				pointer--;
				arrayZahlen = rekursionBubbleSort(arrayZahlen, durchlauf + 1, 0, pointer);
			}
		}

		return arrayZahlen;
	}

	public static int[] swapInteger(int[] array, int index1, int index2) {
		int zwischenspeicher;
		zwischenspeicher = array[index1];
		array[index1] = array[index2];
		array[index2] = zwischenspeicher;

		return array;
	}

	public static int[] selectionSortIntegerAufsteigend(int[] arrayZahlen) {
		long startTime = System.nanoTime();

		int pointer = arrayZahlen.length - 1;
		int indexGroeﬂteZahl = 0;
		for (int durchlauf = 0; durchlauf <= arrayZahlen.length - 1; durchlauf++) {
			for (int index = 0; index <= pointer - 1; index++) {
				if (arrayZahlen[index + 1] > arrayZahlen[indexGroeﬂteZahl]) {
					indexGroeﬂteZahl = index + 1;
				}
			}
			swapInteger(arrayZahlen, indexGroeﬂteZahl, pointer);
			pointer--;
			indexGroeﬂteZahl = 0;
		}

		long endTime = System.nanoTime();
		long runningTime = (endTime - startTime);
		System.out.println("SelectionSort runtime: " + runningTime + " ns");

		return arrayZahlen;
	}

	public static void ausgabeSortiertesArray(int[] arrayZahlen) {
		for (int index = 0; index <= arrayZahlen.length - 1; index++) {
			System.out.print(arrayZahlen[index] + ", ");
		}
		System.out.print("\n");
	}
}
