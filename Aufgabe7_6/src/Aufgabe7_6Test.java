import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Aufgabe7_6Test {

	@Test
	void testFullTree1() {

		int height = 1;

		String[] soll = new String[height];

		soll[0] = "I";

		asserCorrectTree(height, soll, false);

	}

	@Test
	void testEmptyTree1() {

		int height = 1;

		String[] soll = new String[height];

		soll[0] = "I";

		asserCorrectTree(height, soll, true);

	}

	@Test
	void testFullTree2() {

		int height = 2;

		String[] soll = new String[height];

		soll[0] = "X";
		soll[1] = "I";

		asserCorrectTree(height, soll, false);

	}

	@Test
	void testEmptyTree2() {

		int height = 2;

		String[] soll = new String[height];

		soll[0] = "X";
		soll[1] = "I";

		asserCorrectTree(height, soll, true);

	}

	@Test
	void testFullTree5() {

		int height = 5;

		String[] soll = new String[height];

		soll[0] = "   X";
		soll[1] = "  XXX";
		soll[2] = " XXXXX";
		soll[3] = "XXXXXXX";
		soll[4] = "   I";

		asserCorrectTree(height, soll, false);

	}

	@Test
	void testEmptyTree5() {

		int height = 5;

		String[] soll = new String[height];

		soll[0] = "   X";
		soll[1] = "  X X";
		soll[2] = " X   X";
		soll[3] = "XXXXXXX";
		soll[4] = "   I";

		asserCorrectTree(height, soll, true);

	}

	@Test
	void testFullTree6() {

		int height = 6;

		String[] soll = new String[height];

		soll[0] = "    X";
		soll[1] = "   XXX";
		soll[2] = "  XXXXX";
		soll[3] = " XXXXXXX";
		soll[4] = "XXXXXXXXX";
		soll[5] = "    I";

		asserCorrectTree(height, soll, false);

	}

	@Test
	void testEmptyTree6() {

		int height = 6;

		String[] soll = new String[height];

		soll[0] = "    X";
		soll[1] = "   X X";
		soll[2] = "  X   X";
		soll[3] = " X     X";
		soll[4] = "XXXXXXXXX";
		soll[5] = "    I";

		asserCorrectTree(height, soll, true);

	}

	@Test
	void testFullTree10() {

		int height = 10;

		String[] soll = new String[height];

		soll[0] = "        X";
		soll[1] = "       XXX";
		soll[2] = "      XXXXX";
		soll[3] = "     XXXXXXX";
		soll[4] = "    XXXXXXXXX";
		soll[5] = "   XXXXXXXXXXX";
		soll[6] = "  XXXXXXXXXXXXX";
		soll[7] = " XXXXXXXXXXXXXXX";
		soll[8] = "XXXXXXXXXXXXXXXXX";
		soll[9] = "       III";

		asserCorrectTree(height, soll, false);

	}

	@Test
	void testEmptyTree10() {

		int height = 10;

		String[] soll = new String[height];

		soll[0] = "        X";
		soll[1] = "       X X";
		soll[2] = "      X   X";
		soll[3] = "     X     X";
		soll[4] = "    X       X";
		soll[5] = "   X         X";
		soll[6] = "  X           X";
		soll[7] = " X             X";
		soll[8] = "XXXXXXXXXXXXXXXXX";
		soll[9] = "       III";

		asserCorrectTree(height, soll, true);

	}

	public void asserCorrectTree(int height, String[] soll, Boolean emptyTree) {
		String[] ist = new String[height];

		for (int index = 0; index <= height - 1; index++) {
			ist[index] = Aufgabe7_6.getXmasTreeLine(height, emptyTree, index + 1);
		}

		String treeType = "full";
		if (emptyTree) {
			treeType = "empty";
		}

		System.out.println(treeType + "tree " + height);
		System.out.println("");
		for (int index = 0; index <= height - 1; index++) {
			System.out.println(ist[index]);
		}
		System.out.println("");
		assertArrayEquals(soll, ist);
	}

}
