
public class Aufgabe7_6 {

	public static void main(String[] args) {
		printXmasTree(10, false);
		printXmasTree(10, true);

	}

	public static void printXmasTree(int height, boolean emptyTree) {

		for (int line = 1; height >= 1 && line <= height; line++) {
			System.out.println(getXmasTreeLine(height, emptyTree, line));
		}

	}

	public static String getXmasTreeLine(int height, boolean emptyTree, int line) {

		String treeLine = "";
		height--;

		if (height + 1 == line) {

			if (height <= 8) {

				treeLine = placeholder(height - 1, treeLine);
				treeLine += "I";
			} else {
				treeLine = placeholder(height - 2, treeLine);
				treeLine += "III";
			}

		} else {

			int width = height * 2 - 1;
			int indent = height - line;
			int linewidth = width - (indent * 2);

			treeLine = placeholder(indent, treeLine);

			for (int index = 0; index <= linewidth - 1; index++) {

				if (emptyTree && line >= 2 && line != height && index >= 1 && index <= linewidth - 2) {
					treeLine += " ";
				} else {
					treeLine += "X";
				}
			}
		}

		return treeLine;
	}

	public static String placeholder(int indent, String treeLine) {
		for (int index = 0; index <= indent - 1; index++) {
			treeLine += " ";
		}
		return treeLine;
	}

}
