//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L2A02Test {

	@Test
	void test0() {
		int input = 0;
		String target = "";
		testDescriptionTo4(input, target);
	}

	@Test
	void test2() {
		int input = 2;
		String target = "4 -> 2";
		testDescriptionTo4(input, target);
	}

	@Test
	void test4() {
		int input = 4;
		String target = "4";
		testDescriptionTo4(input, target);
	}

	@Test
	void test8() {
		int input = 8;
		String target = "4 -> 2 -> 24 -> 12 -> 6 -> 64 -> 32 -> 16 -> 8";
		testDescriptionTo4(input, target);
	}

	@Test
	void test16() {
		int input = 16;
		String target = "4 -> 2 -> 24 -> 12 -> 6 -> 64 -> 32 -> 16";
		testDescriptionTo4(input, target);
	}

	@Test
	void test2524() {
		int input = 2524;
		String target = "4 -> 2 -> 1 -> 10 -> 5 -> 50 -> 504 -> 252 -> 2524";
		testDescriptionTo4(input, target);
	}

	@Test
	void test34() {
		int input = 34;
		String target = "4 -> 2 -> 24 -> 12 -> 6 -> 3 -> 34";
		testDescriptionTo4(input, target);
	}

	@Test
	void test101() {
		int input = 101;
		String target = "4 -> 40 -> 404 -> 202 -> 101";
		testDescriptionTo4(input, target);
	}

	@Test
	void test612() {
		int input = 612;
		String target = "4 -> 2 -> 24 -> 244 -> 122 -> 1224 -> 612";
		testDescriptionTo4(input, target);
	}

	@Test
	void testMaxInt() {
		int input = Integer.MAX_VALUE;
		String target = "";
		testDescriptionTo4(input, target);
	}

	@Test
	void testBigNumber() {
		int input = 21474836;
		String target = "4 -> 44 -> 22 -> 224 -> 112 -> 1124 -> 562 -> 281 -> 2814 -> 28144 -> 14072 -> 7036 -> 3518 -> 35184 -> 17592 -> 8796 -> 4398 -> 2199 -> 21990 -> 10995 -> 109950 -> 1099504 -> 549752 -> 274876 -> 137438 -> 68719 -> 687194 -> 6871944 -> 3435972 -> 1717986 -> 858993 -> 8589934 -> 85899344 -> 42949672 -> 21474836";
		testDescriptionTo4(input, target);
	}

	public void testDescriptionTo4(int input, String target) {
		String processDescription = P1L2.P1L2A02.describeProcessTo4(input, "");
		System.out.println(input + ":" + processDescription);
		assertTrue(processDescription.equals(target));
	}
}
