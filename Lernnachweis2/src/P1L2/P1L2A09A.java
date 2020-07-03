//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

enum Figure {
	QUEEN, ROOK, BISHOP, KNIGHT
};

public class P1L2A09A {
	public static boolean[][] allowedMoves(Figure[][] positions, Figure figureToMove, int currentPositionX,
			int currentPositionY) {
		boolean[][] ausgabe = new boolean[positions.length][positions[0].length];
		if (figureToMove == Figure.BISHOP) {
			ausgabe = allowedMovesBishop(positions, currentPositionX, currentPositionY);
		}
		if (figureToMove == Figure.KNIGHT) {
			ausgabe = allowedMovesKnight(positions, currentPositionX, currentPositionY);
		}

		if (figureToMove == Figure.QUEEN) {
			ausgabe = allowedMovesQueen(positions, currentPositionX, currentPositionY);
		}
		if (figureToMove == Figure.ROOK) {
			ausgabe = allowedMovesRook(positions, currentPositionX, currentPositionY);
		}
		return ausgabe;
	}

	public static boolean[][] allowedMovesRook(Figure[][] positions, int currentPositionX, int currentPositionY) {
		boolean[][] ausgabe = new boolean[positions.length][positions[0].length];
		int oben = nachOben(positions, currentPositionX, currentPositionY);
		int unten = nachUnten(positions, currentPositionX, currentPositionY);
		int links = nachLinks(positions, currentPositionX, currentPositionY);
		int rechts = nachRechts(positions, currentPositionX, currentPositionY);
		ausgabe = rookBewegungen(ausgabe, oben, unten, links, rechts, currentPositionX, currentPositionY);
		return ausgabe;
	}

	public static boolean[][] rookBewegungen(boolean[][] ausgabe, int oben, int unten, int links, int rechts,
			int currentPositionX, int currentPositionY) {

		/*
		 * Es wird bei 1 begonnen, um die aktuelle Position der Figur auszulassen. Diese
		 * Position muss nicht überprüft werden, weil sie bereits an dieser Stelle steht
		 */

		for (int i = 1; i <= oben; i++) {
			ausgabe[currentPositionY - i][currentPositionX] = true;
		}
		for (int i = 1; i <= unten; i++) {
			ausgabe[currentPositionY + i][currentPositionX] = true;
		}
		for (int i = 1; i <= links; i++) {
			ausgabe[currentPositionY][currentPositionX - i] = true;
		}
		for (int i = 1; i <= rechts; i++) {
			ausgabe[currentPositionY][currentPositionX + i] = true;
		}

		return ausgabe;
	}

	public static boolean[][] bishopBewegungen(boolean[][] ausgabe, int obenLinks, int untenLinks, int untenRechts,
			int obenRechts, int currentPositionX, int currentPositionY) {

		for (int i = 1; i <= obenLinks; i++) {
			ausgabe[currentPositionY - i][currentPositionX - i] = true;
		}
		for (int i = 1; i <= untenLinks; i++) {
			ausgabe[currentPositionY + i][currentPositionX - i] = true;
		}
		for (int i = 1; i <= untenRechts; i++) {
			ausgabe[currentPositionY + i][currentPositionX + i] = true;
		}
		for (int i = 1; i <= obenRechts; i++) {
			ausgabe[currentPositionY - i][currentPositionX + i] = true;
		}

		return ausgabe;
	}

	public static int nachOben(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (0 < currentPositionY && positions[currentPositionY - 1][currentPositionX] == null) {
			currentPositionY--;
			count++;
		}
		return count;
	}

	public static int nachUnten(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (positions.length > currentPositionY + 1 && positions[currentPositionY + 1][currentPositionX] == null) {
			currentPositionY++;
			count++;
		}
		return count;
	}

	public static int nachLinks(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (0 < currentPositionX && positions[currentPositionY][currentPositionX - 1] == null) {
			currentPositionX--;
			count++;
		}
		return count;
	}

	public static int nachRechts(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (positions[0].length > currentPositionX + 1
				&& positions[currentPositionY][currentPositionX + 1] == null) {
			currentPositionX++;
			count++;
		}
		return count;
	}

	public static int nachObenLinks(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (0 < currentPositionY && 0 < currentPositionX
				&& positions[currentPositionY - 1][currentPositionX - 1] == null) {
			currentPositionY--;
			currentPositionX--;
			count++;
		}
		return count;
	}

	public static int nachUntenLinks(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (positions.length > currentPositionY + 1 && 0 < currentPositionX
				&& positions[currentPositionY + 1][currentPositionX - 1] == null) {
			currentPositionY++;
			currentPositionX--;
			count++;
		}
		return count;
	}

	public static int nachObenRechts(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (positions[0].length > currentPositionX + 1 && 0 < currentPositionY
				&& positions[currentPositionY - 1][currentPositionX + 1] == null) {
			currentPositionY--;
			currentPositionX++;
			count++;
		}
		return count;
	}

	public static int nachUntenRechts(Figure[][] positions, int currentPositionX, int currentPositionY) {
		int count = 0;
		while (positions.length > currentPositionY + 1 && positions[0].length > currentPositionX + 1
				&& positions[currentPositionY + 1][currentPositionX + 1] == null) {
			currentPositionY++;
			currentPositionX++;
			count++;
		}
		return count;
	}

	public static boolean[][] allowedMovesBishop(Figure[][] positions, int currentPositionX, int currentPositionY) {
		boolean[][] ausgabe = new boolean[positions.length][positions[0].length];
		int obenLinks = nachObenLinks(positions, currentPositionX, currentPositionY);
		int untenLinks = nachUntenLinks(positions, currentPositionX, currentPositionY);
		int untenRechts = nachUntenRechts(positions, currentPositionX, currentPositionY);
		int obenRechts = nachObenRechts(positions, currentPositionX, currentPositionY);
		ausgabe = bishopBewegungen(ausgabe, obenLinks, untenLinks, untenRechts, obenRechts, currentPositionX,
				currentPositionY);
		return ausgabe;
	}

	public static boolean[][] allowedMovesQueen(Figure[][] positions, int currentPositionX, int currentPositionY) {
		boolean[][] ausgabe1 = allowedMovesBishop(positions, currentPositionX, currentPositionY);
		boolean[][] ausgabe2 = allowedMovesRook(positions, currentPositionX, currentPositionY);

		for (int y = 0; y < ausgabe1.length; y++) {
			for (int x = 0; x < ausgabe1[0].length; x++) {
				if (ausgabe1[y][x] == true) {
					ausgabe2[y][x] = true;
				}
			}
		}
		return ausgabe2;
	}

	public static boolean[][] allowedMovesKnight(Figure[][] positions, int currentPositionX, int currentPositionY) {
		boolean[][] ausgabe = new boolean[positions.length][positions[0].length];

		// 1 nach links, 2 nach oben
		if (0 < currentPositionY - 1 && 0 < currentPositionX
				&& positions[currentPositionY - 2][currentPositionX - 1] == null) {
			ausgabe[currentPositionY - 2][currentPositionX - 1] = true;
		}
		// 2 nach links, 1 nach oben
		if (0 < currentPositionY && 0 < currentPositionX - 1
				&& positions[currentPositionY - 1][currentPositionX - 2] == null) {
			ausgabe[currentPositionY - 1][currentPositionX - 2] = true;
		}

		
		// 1 nach links, 2 nach unten
		if (ausgabe.length > currentPositionY + 2 && 0 < currentPositionX
				&& positions[currentPositionY + 2][currentPositionX - 1] == null) {
			ausgabe[currentPositionY + 2][currentPositionX - 1] = true;
		}
		// 2 nach links, 1 nach unten
		if (ausgabe.length > currentPositionY + 1 && 0 < currentPositionX - 1
				&& positions[currentPositionY + 1][currentPositionX - 2] == null) {
			ausgabe[currentPositionY + 1][currentPositionX - 2] = true;
		}

		// 1 nach rechts, 2 nach oben
		if (0 < currentPositionY - 1 && positions[0].length > currentPositionX
				&& positions[currentPositionY - 2][currentPositionX + 1] == null) {
			ausgabe[currentPositionY - 2][currentPositionX + 1] = true;
		}

		// 2 nach rechts, 1 nach oben
		if (0 < currentPositionY && positions[0].length > currentPositionX + 1
				&& positions[currentPositionY - 1][currentPositionX + 2] == null) {
			ausgabe[currentPositionY - 1][currentPositionX + 2] = true;
		}

		// 1 nach rechts, 2 nach unten
		if (ausgabe.length > currentPositionY + 1 && positions[0].length > currentPositionX
				&& positions[currentPositionY + 2][currentPositionX + 1] == null) {
			ausgabe[currentPositionY + 2][currentPositionX + 1] = true;
		}
		// 2 nach rechts, 1 nach unten
		if (ausgabe.length > currentPositionY && positions[0].length > currentPositionX + 1
				&& positions[currentPositionY + 1][currentPositionX + 2] == null) {
			ausgabe[currentPositionY + 1][currentPositionX + 2] = true;
		}
		return ausgabe;
	}
}
