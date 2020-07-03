package QuadTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe10_3_QuadTreeTest {

	private long testSum(String input) {
		long sum = Aufgabe10_3_QuadTree.calculateSumBlackPixelsQuadtree(input, 32);
		System.out.println(input + " --> " + sum);
		return sum;
	}

	@Test
	void testSum_fb() {
		long sum = testSum("fb");
		assertTrue(sum == 256);
	}

	@Test
	void testSum_f() {
		long sum = testSum("f");
		assertTrue(sum == 0);
	}

	@Test
	void testSum_ffb() {
		long sum = testSum("ffb");
		assertTrue(sum == 64);
	}

	@Test
	void testSum_ffwwwwb() {
		long sum = testSum("ffwwwwb");
		assertTrue(sum == 256);
	}

	@Test
	void testSum_fbfwwww() {
		long sum = testSum("fbfwwww");
		assertTrue(sum == 256);
	}

	@Test
	void testSum_ffwwwb() {
		long sum = testSum("ffwwwb");
		assertTrue(sum == 64);
	}

	@Test
	void testSum_fbfbfbfbfb() {
		long sum = testSum("fbfbfbfbfb");
		assertTrue(sum == 341);
	}

	@Test
	void testSum_ffwwwbfbbwwbw() {
		long sum = testSum("ffwwwbfbbwwbw");
		assertTrue(sum == 448);
	}

	@Test
	void testSum_fwbwfwwbw() {
		long sum = testSum("fwbwfwwbw");
		assertTrue(sum == 320);
	}

	@Test
	void testSum_ffwwwbbbfwwbw() {
		long sum = testSum("ffwwwbbbfwwbw");
		assertTrue(sum == 640);
	}

	@Test
	void testCalculateNumberOfLayers32() {
		int count = Aufgabe10_3_QuadTree.calculateNumberOfLayers(32);
		assertTrue(count == 6);
	}

	@Test
	void testCalculateNumberOfLayers64() {
		int count = Aufgabe10_3_QuadTree.calculateNumberOfLayers(64);
		assertTrue(count == 7);
	}

	@Test
	void testCalculateMatrixValues32() {
		int[] target = { 1024, 256, 64, 16, 4, 1 };
		int[] matrixOfValues = new int[6];
		Aufgabe10_3_QuadTree.calculateMatrixValues(32, 6, matrixOfValues);
		assertArrayEquals(matrixOfValues, target);
	}

	@Test
	void testCalculateMatrixValues64() {
		int[] target = { 4096, 1024, 256, 64, 16, 4, 1 };
		int[] matrixOfValues = new int[7];
		Aufgabe10_3_QuadTree.calculateMatrixValues(64, 7, matrixOfValues);
		assertArrayEquals(matrixOfValues, target);
	}

	@Test
	void testNewTree1() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("fbwwb", "fbbww");
		String target = "fbbwb";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeFW() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("ffbbwbwww", "fwwbw");
		String target = "ffbbwbwbw";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeWF() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("fwwww", "ffbbwbwbw");
		String target = "ffbbwbwbw";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeBF() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("fbbwb", "ffbbwbwww");
		String target = "fbbwb";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeFB() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("ffbbwbwww", "fbbwb");
		String target = "fbbwb";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeFinal1() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("ffwwwbfbbwwbw", "fwwww");
		String target = "ffwwwbfbbwwbw";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeFinal2() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("fwwww", "fwbwfwwbw");
		String target = "fwbwfwwbw";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	@Test
	void testNewTreeFinal() {
		String output = QuadTree.Aufgabe10_3_QuadTree.generateNewQuadTreeWithTwoQuadTrees("ffwwwbfbbwwbw", "fwbwfwwbw");
		String target = "ffwwwbbbfwwbw";
		System.out.println(target + " =? " + output);
		assertTrue(output.equals(target));
	}
	
	

}
