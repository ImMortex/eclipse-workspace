
public class Aufgabe9_4b_speziellMergesort {

	public static int[] sort(int[] myArray) {
		int[] leftArray = {};
		int[] rightArray = {};

		if (myArray.length > 1) {
			
			int middle=0;
			
			if (myArray.length %2==0)

			{middle = myArray.length / 2;}
			else
			{middle = myArray.length / 2 +1;}	

			leftArray = createLeftArray(myArray, middle);

			rightArray = createRightArray(myArray, leftArray, middle);
			
			leftArray = invertMergeSort(leftArray);
			rightArray = mergeSort(rightArray);

			int[] concatenatedArray = new int[leftArray.length + rightArray.length];

			for (int i = 0; i <= leftArray.length - 1; i++) {
				concatenatedArray[i] = leftArray[i];
			}
			for (int i = 0; i <= rightArray.length - 1; i++) {
				concatenatedArray[i + leftArray.length] = rightArray[i];
			}

			myArray=concatenatedArray;
			//myArray = merge(leftArray, rightArray);
		}
		return myArray;
	}

	public static int[] mergeSort(int[] myArray) {

		int[] leftArray = {};
		int[] rightArray = {};

		if (myArray.length > 1) {

			int middle = myArray.length / 2;

			leftArray = createLeftArray(myArray, middle);

			rightArray = createRightArray(myArray, leftArray, middle);

			leftArray = mergeSort(leftArray);
			rightArray = mergeSort(rightArray);

			myArray = merge(leftArray, rightArray);
		}

		return myArray;
	}

	public static int[] createRightArray(int[] myArray, int[] leftArray, int middle) {
		int[] rightArray;
		rightArray = new int[middle];
		for (int i = 0; i <= rightArray.length-1; i++) {
			rightArray[i] = myArray[i + leftArray.length];
		}
		return rightArray;
	}

	public static int[] createLeftArray(int[] myArray, int middle) {
		int[] leftArray;
		leftArray = new int[myArray.length - middle];
		for (int i = 0; i <= leftArray.length-1 ; i++) {
			leftArray[i] = myArray[i];
		}
		return leftArray;
	}	

	public static int[] invertMergeSort(int[] myArray) {

		int[] leftArray = {};
		int[] rightArray = {};

		if (myArray.length > 1) {

			int middle = myArray.length / 2;

			leftArray = createLeftArray(myArray, middle);

			rightArray = createRightArray(myArray, leftArray, middle);

			leftArray = invertMergeSort(leftArray);
			rightArray = invertMergeSort(rightArray);

			myArray = invertMerge(leftArray, rightArray);
		}

		return myArray;
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

	public static int[] invertMerge(int[] links, int[] rechts) {
		int mergedLength = links.length + rechts.length;
		int[] mergedArray = new int[mergedLength];
		int l = 0;
		int r = 0;
		int index = 0;

		// sort in the smallest element every time until one array is completely sorted
		// in (empty)
		while (l <= links.length - 1 && r <= rechts.length - 1)

			if (links[l] >= rechts[r]) {
				mergedArray[index] = links[l];
				l++;
				index++;
			} else {
				mergedArray[index] = rechts[r];
				r++;
				index++;
			}

		addLastExistingArrayAtTheBack(links, rechts, mergedLength, mergedArray, l, r, index);

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
