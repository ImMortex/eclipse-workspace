
public class Aufgabe7_3 {
	public static void main(String[] args) {

		int[] arrayZahlen = { 5, 2, 6, 4, 2, 7, 1 };
		arrayZahlen = selectionSortIntegerAufsteigend(arrayZahlen);

		ausgabeSortiertesArray(arrayZahlen);
	}

	public static int[] bubbleSortIntegerAufsteigend(int[] arrayZahlen) {
		int pointer = arrayZahlen.length - 1;

		for (int durchlauf = 0; durchlauf <= arrayZahlen.length - 1; durchlauf++) {

			for (int index = 0; index <= pointer - 1; index++) {
				if (arrayZahlen[index] > arrayZahlen[index + 1]) {
					arrayZahlen = swapInteger(arrayZahlen, index, index + 1);
				}
			}
			pointer--;
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
		return arrayZahlen;
	}

	public static void ausgabeSortiertesArray(int[] arrayZahlen) {
		for (int index = 0; index <= arrayZahlen.length - 1; index++) {
			System.out.print(arrayZahlen[index] + ", ");
		}
		System.out.print("\n");
	}
}
