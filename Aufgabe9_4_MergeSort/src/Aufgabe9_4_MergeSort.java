import java.util.SortedMap;

public class Aufgabe9_4_MergeSort {

	public static int[] sort(int[] myArray) {

		int[] leftArray = {};
		int[] rightArray = {};

		if (myArray.length > 1) {

			int middle = myArray.length / 2;

			leftArray = new int[myArray.length - middle];
			for (int i = 0; i <= leftArray.length - 1; i++) {
				leftArray[i] = myArray[i];
			}

			rightArray = new int[middle];
			for (int i = 0; i <= rightArray.length - 1; i++) {
				rightArray[i] = myArray[i + leftArray.length];
			}

			leftArray = sort(leftArray);
			rightArray = sort(rightArray);
		
		myArray = merge(leftArray, rightArray);}

		return myArray;
	}

	public static int[] swapInteger(int[] array, int index0, int index1) {
		int zwischenspeicher;
		zwischenspeicher = array[index0];
		array[index0] = array[index1];
		array[index1] = zwischenspeicher;
		return array;
	}

	public static int[] merge(int[] links, int[] rechts) {
		int mergedLenght = links.length + rechts.length;
		int[] mergedArray = new int[mergedLenght];
		int l = 0;
		int r = 0;
		int index = 0;

		// sort in the smallest element every time until one array is completely sorted
		// in (empty)
		while (l <= links.length - 1 && r <= rechts.length - 1)

			if (links[l] <= rechts[r]) {
				mergedArray[index] = links[l];
				l++;
				index++;
			} else {
				mergedArray[index] = rechts[r];
				r++;
				index++;
			}

		addLastExistingArrayAtTheBack(links, rechts, mergedLenght, mergedArray, l, r, index);

		return mergedArray;
	}

	private static void addLastExistingArrayAtTheBack(int[] links, int[] rechts, int mergedLenght, int[] mergedArray,
			int l, int r, int index) {
		// after that existing array is added at the back:
		if (l <= links.length - 1) {
			while (index <= mergedLenght - 1) {
				mergedArray[index] = links[l];
				l++;
				index++;
			}
		} else if (r <= rechts.length - 1) {
			while (index <= mergedLenght - 1) {
				mergedArray[index] = rechts[r];
				r++;
				index++;
			}
		}
	}

}
