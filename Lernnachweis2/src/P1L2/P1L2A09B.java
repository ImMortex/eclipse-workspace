//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L2A09B {

	@Test
	void testRook8x8() {
		Figure[][] positions = positions8x8();
		// allowedMoves (positions, figure, xPos, yPos)
		boolean[][] rook = P1L2A09A.allowedMoves(positions, Figure.ROOK, 3, 4);
		boolean[][] sollRook = { //
				{ false, false, false, true, false, false, false, false }, //
				{ false, false, false, true, false, false, false, false }, //
				{ false, false, false, true, false, false, false, false }, //
				{ false, false, false, true, false, false, false, false }, //
				{ true, true, true, false, true, true, true, true }, //
				{ false, false, false, true, false, false, false, false }, //
				{ false, false, false, true, false, false, false, false }, //
				{ false, false, false, true, false, false, false, false } //
		};
		System.out.println("\ntestRook8x8");
		brechnetesArrayAusgeben(rook);
		assertArrayEquals(rook, sollRook);
	}

	@Test
	void testRook1x10() {
		Figure[][] positions = positions1x10TurmDurchDenGebirgspass();
		// allowedMoves (positions, figure, xPos, yPos)
		boolean[][] rook = P1L2A09A.allowedMoves(positions, Figure.ROOK, 1, 0);
		boolean[][] sollRook = { //
				{ true, false, true, true, true, true, true, true, true, true } //
				//
		};
		System.out.println("\ntestRook1x10");
		brechnetesArrayAusgeben(rook);
		assertArrayEquals(rook, sollRook);
	}

	@Test
	void testQueen8x8() {
		Figure[][] positions = positions8x8();
		boolean[][] queen = P1L2A09A.allowedMoves(positions, Figure.QUEEN, 1, 2);
		boolean[][] sollQueen = { //
				{ false, true, false, true, false, false, false, false }, //
				{ true, true, true, false, false, false, false, false }, //
				{ true, false, true, true, true, true, true, true }, //
				{ true, true, true, false, false, false, false, false }, //
				{ false, true, false, false, false, false, false, false }, //
				{ false, true, false, false, false, false, false, false }, //
				{ false, true, false, false, false, false, false, false }, //
				{ false, true, false, false, false, false, false, false } //
		};
		System.out.println("\ntestQueen8x8");
		brechnetesArrayAusgeben(queen);
		assertArrayEquals(queen, sollQueen);
	}

	@Test
	void testQueen1x1() {
		Figure[][] positions = positions1x1DieQueenHatPlatzangst();
		boolean[][] queen = P1L2A09A.allowedMoves(positions, Figure.QUEEN, 0, 0);
		boolean[][] sollQueen = { //
				{ false }//
		};
		System.out.println("\ntestQueen1x1");
		brechnetesArrayAusgeben(queen);
		assertArrayEquals(queen, sollQueen);
	}

	@Test
	void testBishop8x8() {
		Figure[][] positions = positions8x8();
		boolean[][] bishop = P1L2A09A.allowedMoves(positions, Figure.BISHOP, 6, 6);
		boolean[][] sollBishop = { //
				{ true, false, false, false, false, false, false, false }, //
				{ false, true, false, false, false, false, false, false }, //
				{ false, false, true, false, false, false, false, false }, //
				{ false, false, false, true, false, false, false, false }, //
				{ false, false, false, false, true, false, false, false }, //
				{ false, false, false, false, false, true, false, true }, //
				{ false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, true, false, true } //
		};
		System.out.println("\ntestBishop8x8");
		brechnetesArrayAusgeben(bishop);
		assertArrayEquals(bishop, sollBishop);
	}
	
	@Test
	void testBishop9x10() {
		Figure[][] positions = positions9x10KnightUmzingelt();
		boolean[][] bishop = P1L2A09A.allowedMoves(positions, Figure.BISHOP, 4, 5);
		boolean[][] sollBishop = { //
				{ false, false, false, false, false, false, false, false, false, true }, //
				{ false, false, false, false, false, false, false, false, true, false }, //
				{ false, false, false, false, false, false, false, true, false, false }, //
				{ false, false, false, false, false, false, true, false, false, false }, //
				{ false, false, false, false, false, true, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, true, false, false, false, false }, //
				{ false, false, false, false, false, false, true, false, false, false }, //
				{ false, false, false, false, false, false, false, true, false, false } //
		};
		System.out.println("\ntestBishop9x10");
		brechnetesArrayAusgeben(bishop);
		assertArrayEquals(bishop, sollBishop);
	}

	@Test
	void testKight8x8() {
		Figure[][] positions = positions8x8();
		boolean[][] knight = P1L2A09A.allowedMoves(positions, Figure.KNIGHT, 5, 1);
		boolean[][] sollKnight = { //
				{ false, false, false, true, false, false, false, true }, //
				{ false, false, false, false, false, false, false, false }, //
				{ false, false, false, true, false, false, false, true }, //
				{ false, false, false, false, true, false, true, false }, //
				{ false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false } //
		};
		System.out.println("\ntestKight8x8");
		brechnetesArrayAusgeben(knight);
		assertArrayEquals(knight, sollKnight);
	}

	@Test
	void testKight9x10() {
		Figure[][] positions = positions9x10KnightUmzingelt();
		boolean[][] knight = P1L2A09A.allowedMoves(positions, Figure.KNIGHT, 3, 5);
		boolean[][] sollKnight = { //
				{ false, false, false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false, false, false }, //
				{ false, false, false, false, true, false, false, false, false, false }, //
				{ false, true, false, false, false, true, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false, false, false }, //
				{ false, true, false, false, false, true, false, false, false, false }, //
				{ false, false, true, false, true, false, false, false, false, false }, //
				{ false, false, false, false, false, false, false, false, false, false } //
		};
		System.out.println("\ntestKight9x10");
		brechnetesArrayAusgeben(knight);
		assertArrayEquals(knight, sollKnight);
	}

	public Figure[][] positions8x8() {
		Figure[][] positions = { //
				{ null, null, null, null, null, null, null, null }, //
				{ null, null, null, null, null, Figure.KNIGHT, null, null }, //
				{ null, Figure.QUEEN, null, null, null, null, null, null }, //
				{ null, null, null, null, null, null, null, null }, //
				{ null, null, null, Figure.ROOK, null, null, null, null }, //
				{ null, null, null, null, null, null, null, null }, //
				{ null, null, null, null, null, null, Figure.BISHOP, null }, //
				{ null, null, null, null, null, null, null, null } //
		};
		return positions;
	}

	public Figure[][] positions9x10KnightUmzingelt() {
		Figure[][] positions = { //
				{ null, null, null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null, null, null }, //
				{ null, null, null, null, null, null, null, null, null, null }, //
				{ null, null, Figure.QUEEN, null, null, null, null, null, null, null }, //
				{ null, null, null, Figure.ROOK, null, null, null, null, null, null }, //
				{ null, null, Figure.ROOK, Figure.KNIGHT, Figure.BISHOP, null, null, null, null, null }, //
				{ null, null, null, Figure.BISHOP, null, null, null, null, null, null }, //
				{ null, null, null, null, null, null, null, null, null, null }, //
				{ null, null, null, null, null, null, null, null, null, null } //
		};
		return positions;
	}

	public Figure[][] positions1x1DieQueenHatPlatzangst() {
		Figure[][] positions = { //
				{ Figure.QUEEN } //
		};
		return positions;
	}

	public Figure[][] positions1x10TurmDurchDenGebirgspass() {
		Figure[][] positions = { //
				{ null, Figure.ROOK, null, null, null, null, null, null, null, null } //
		};
		return positions;
	}

	public void brechnetesArrayAusgeben(boolean[][] figure) {
		for (int y = 0; y < figure.length; y++) {
			for (int x = 0; x < figure[0].length; x++) {

				if (figure[y][x]) {
					System.out.print("T ");
				} else {
					System.out.print("F ");
				}
			}
			System.out.print("\n");
		}
	}

}
