package QuadTree;

import java.util.Scanner;

public class Aufgabe10_3_QuadTree {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Eingabe1: ");
		String input1 = myScanner.nextLine();
		System.out.println("Eingabe2: ");
		String input2 = myScanner.nextLine();
		myScanner.close();
		System.out.println(calculateSumBlackPixelsQuadtree(input1, 32));
		System.out.println(calculateSumBlackPixelsQuadtree(input2, 32));

	}

	public static long calculateSumBlackPixelsQuadtree(String input, int pixel) {
		int layer = 0;
		byte childCount = 0;
		long sum = 0l;
		int temp = 0;

		int count = calculateNumberOfLayers(pixel);

		int[] matrixOfValues = new int[count];
		calculateMatrixValues(pixel, count, matrixOfValues); // matrix gets values
		// with pixel=32: { 1024, 256, 64, 16, 4, 1 };

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'f') {
				layer++;
				childCount = 0;
			} else if (input.charAt(index) == 'w') {
				childCount++;
			} else if (input.charAt(index) == 'b') {
				childCount++;
				sum += matrixOfValues[layer];
			}
			if (childCount >= 4) {
				childCount = 0;
				layer--;
			}
		}
		return sum;
	}

	public static String generateNewQuadTreeWithTwoQuadTrees(String input1, String input2) {
		int layer = 0;
		String newQuadTree = "";
		int index1 = 0;
		int index2 = 0;
		int temp1 = 0;
		int temp2 = 0;
		int childIndex = 1;

		newQuadTree = recursiveTree(input1, input2, layer, index1, index2, temp1, temp2, newQuadTree, childIndex);

		return newQuadTree;
	}

	public static String recursiveTree(String input1, String input2, int layer, int index1, int index2, int temp1,
			int temp2, String newQuadTree, int childIndex) {
		// newQuadTree += QuadTree.Aufgabe10_3_QuadTree.recursiveTree(input1, input2,
		// index1, index2, newQuadTree);

		for (int childCount = childIndex; isNotFinished(input1, input2, index1, index2)
				&& childCount <= 4; childCount++) {
			childIndex = childCount;
			if (input1.charAt(index1) == 'f' && input2.charAt(index2) == 'f') {
				newQuadTree += "f";
				index1++;
				index2++;

				temp1 = index1 + 5;
				temp2 = index2 + 5;
				childIndex = childCount++;
				layer++;
				newQuadTree = recursiveTree(input1, input2, layer, index1, index2, temp1, temp2, newQuadTree,
						childIndex);
				layer--;
				index1 = temp1;
				index2 = temp2;

			} else if (input1.charAt(index1) == 'f' && input2.charAt(index2) == 'w') {
				newQuadTree += "f";
				index1++;
				index2++;
				childIndex = childCount++;
				temp1 = index1 + 4;
				layer++;
				newQuadTree = recursiveTreeOtherCases(input1, layer, index1, temp1, newQuadTree, 1);
				layer--;
				childCount = childIndex;
				index1 = temp1;
			}

			else if (input1.charAt(index1) == 'w' && input2.charAt(index2) == 'f') {
				newQuadTree += "f";
				index1++;
				index2++;
				childIndex = childCount++;
				temp2 = index2 + 4;
				layer++;
				newQuadTree = recursiveTreeOtherCases(input2, layer, index2, temp2, newQuadTree, 1);
				layer--;
				childCount = childIndex;
				index2 = temp2;
			}

			else if (input1.charAt(index1) == 'f' && input2.charAt(index2) == 'b') {
				newQuadTree += "b";
				index1++;
				index2++;
				childCount++;
				index2 = index2 + 4;
			}

			else if (input1.charAt(index1) == 'b' && input2.charAt(index2) == 'f') {
				newQuadTree += "b";
				index1++;
				index2++;
				childCount++;
				index2 = index2 + 4;
			}

			if (isNotFinished(input1, input2, index1, index2)) {

				if ((input1.charAt(index1) == 'b' && input2.charAt(index2) == 'b')
						|| (input1.charAt(index1) == 'b' && input2.charAt(index2) == 'w')
						|| (input1.charAt(index1) == 'w' && input2.charAt(index2) == 'b')) {
					newQuadTree += "b";
					index1++;
					index2++;
				} else if (input1.charAt(index1) == 'w' && input2.charAt(index2) == 'w') {
					newQuadTree += "w";
					index1++;
					index2++;
				}

			}
		}
		return newQuadTree;

	}

	private static boolean isNotFinished(String input1, String input2, int index1, int index2) {
		return index1 <= input1.length() - 1 && index2 <= input2.length() - 1;
	}

	public static String recursiveTreeOtherCases(String input, int layer, int index, int temp, String newQuadTree,
			int childIndex) {

		for (int childCount = childIndex; childCount <= 4; childCount++) {

			if (input.charAt(index) == 'b') {
				newQuadTree += "b";
				index++;
			} else if (input.charAt(index) == 'w') {
				newQuadTree += "w";
				index++;
			} else if (input.charAt(index) == 'f') {
				newQuadTree += "f";
				index++;
			}
		}

		return newQuadTree;
	}

	public static void calculateMatrixValues(int pixel, int count, int[] matrixOfValues) {
		for (int i = 0; i <= count - 1; i++) {
			if (i == 0) {
				matrixOfValues[0] = pixel * pixel;
			} else {
				matrixOfValues[i] = (matrixOfValues[i - 1] / 4);
			}
		}
	}

	public static int calculateNumberOfLayers(int pixel) {
		int count = 1;
		while (pixel > 1) {
			count++;
			pixel = pixel / 2;
		}
		return count;
	}

	public static int calculateValueOfLayer(int layer, int pixel) {
		int count = 1;
		while (pixel > 1) {
			count++;
			pixel = pixel / 2;
		}
		return count;
	}

}
