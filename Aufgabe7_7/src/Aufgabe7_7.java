
public class Aufgabe7_7 {
	public static void main(String[] args) {

		char[][] inputImage = {

				{ ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },

				{ ' ', ' ', 'X', '*', 'X', 'x', ' ', ' ', ' ', ' ', ' ' },

				{ ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'x', ' ', ' ', ' ' },

				{ 'O', 'O', 'X', 'X', 'X', 'X', '*', 'X', 'x', 'x', ' ' },

				{ 'O', 'O', 'X', 'X', '*', 'X', 'X', 'X', 'x', 'x', '*' }

		};

		char[][] reconstructedTree = reconstructImage(inputImage);
		for (int y = 0; y <= reconstructedTree.length - 1; y++) {
			for (int x = 0; x <= reconstructedTree[0].length - 1; x++) {
				System.out.print(reconstructedTree[y][x]);
			}
			System.out.print("\n");
		}
	}

	public static char[][] reconstructImage(char[][] inputImage) {

		char[][] reconstructedTree = new char[inputImage[0].length][inputImage.length * 2 - 1];

		boolean oddTree = inputImage.length % 2 != 0;
		int half = inputImage.length - 1;

		for (int y = 0; y <= inputImage.length - 1; y++) {
			for (int x = 0; x <= inputImage[0].length - 1; x++) {
				reconstructedTree[inputImage[0].length - 1 - x][y] = inputImage[y][x];
				
				if (oddTree) {
					if (y != half + 1) //
					{
						reflection(inputImage, reconstructedTree, half, y, x);
					}
				} else {
					reflection(inputImage, reconstructedTree, half, y, x);
				}
			}
		}

		return reconstructedTree;

	}

	public static void reflection(char[][] inputImage, char[][] reconstructedTree, int half, int y, int x) {
		reconstructedTree[inputImage[0].length - 1 - x][inputImage.length - 1 - y+half] = inputImage[y][x];
	}

}
