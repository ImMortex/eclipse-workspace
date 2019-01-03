import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe7_7Test {

	@Test
	void test1() {

		char[][] fallenTree = {

				{ ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },

				{ ' ', ' ', 'X', '*', 'X', 'x', ' ', ' ', ' ', ' ', ' ' },

				{ ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'x', ' ', ' ', ' ' },

				{ 'O', 'O', 'X', 'X', 'X', 'X', '*', 'X', 'x', 'x', ' ' },

				{ 'O', 'O', 'X', 'X', '*', 'X', 'X', 'X', 'x', 'x', '*' }

		};

		char[][] targetedReconstructedTree = {

				{ ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ' },

				{ ' ', ' ', ' ', 'x', 'x', 'x', ' ', ' ', ' ' },

				{ ' ', ' ', ' ', 'x', 'x', 'x', ' ', ' ', ' ' },

				{ ' ', ' ', 'x', 'X', 'X', 'X', 'x', ' ', ' ' },

				{ ' ', ' ', 'X', '*', 'X', '*', 'X', ' ', ' ' },

				{ ' ', 'x', 'X', 'X', 'X', 'X', 'X', 'x', ' ' },

				{ ' ', 'X', 'X', 'X', '*', 'X', 'X', 'X', ' ' },

				{ 'X', '*', 'X', 'X', 'X', 'X', 'X', '*', 'X' },

				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },

				{ ' ', ' ', ' ', 'O', 'O', 'O', ' ', ' ', ' ' },

				{ ' ', ' ', ' ', 'O', 'O', 'O', ' ', ' ', ' ' },

		};

		char[][] reconstructedTree = Aufgabe7_7.reconstructImage(fallenTree);

		printReconstructedTree(reconstructedTree);

		assertArrayEquals(reconstructedTree, targetedReconstructedTree);

	}

	@Test
	void test2() {

		char[][] fallenTree = {

				{ 'T', 'e', 'x', 't' }

		};

		char[][] targetedReconstructedTree = {

				{ 't' }, 
				
				{ 'x' }, 
				
				{ 'e' }, 
				
				{ 'T' },

		};

		char[][] reconstructedTree = Aufgabe7_7.reconstructImage(fallenTree);

		printReconstructedTree(reconstructedTree);

		assertArrayEquals(targetedReconstructedTree, reconstructedTree);

	}

	@Test
	void testBasic() {

		char[][] array1 = { { 'T', 'e', 'x', ' ' } };
		char[][] array2 = { { 'T', 'e', 'x', ' ' } };
		assertArrayEquals(array2, array1);
	}

	public void printReconstructedTree(char[][] reconstructedTree) {
		for (int y = 0; y <= reconstructedTree.length - 1; y++) {
			for (int x = 0; x <= reconstructedTree[0].length - 1; x++) {
				System.out.print(reconstructedTree[y][x]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("width=" + reconstructedTree.length);
		System.out.println("height=" + reconstructedTree[0].length);
	}

}
