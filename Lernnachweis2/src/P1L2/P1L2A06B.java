//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L2A06B {

	@Test
	void testNichts() {
		System.out.print("\ntestNichts\n");
		String soll = "";
		System.out.print(soll + "\n");
		String quadTree = "";
		String ausgabe = P1L2A06A.getQuadTreeAsString(quadTree);
		System.out.print(ausgabe);
		assertTrue(soll.equals(ausgabe));
	}

	@Test
	void testSchwarz() {
		System.out.print("\ntestSchwarz\n");
		String soll = "X\n";
		System.out.print(soll + "\n");
		String quadTree = "B";
		String ausgabe = P1L2A06A.getQuadTreeAsString(quadTree);
		System.out.print(ausgabe);
		assertTrue(soll.equals(ausgabe));
	}

	@Test
	void testWeiss() {
		System.out.print("\ntestWeiss\n");
		String soll = " \n";
		System.out.print(soll + "\n");
		String quadTree = "W";
		String ausgabe = P1L2A06A.getQuadTreeAsString(quadTree);
		System.out.print(ausgabe);
		assertTrue(soll.equals(ausgabe));
	}

	@Test
	void testFBWBW() {
		System.out.print("\ntestFBWBW\n");
		String soll = " X\nX \n";
		System.out.print(soll + "\n");
		String quadTree = "FBWBW";
		String ausgabe = P1L2A06A.getQuadTreeAsString(quadTree);
		System.out.print(ausgabe);
		assertTrue(soll.equals(ausgabe));
	}

	@Test
	void testPfeil() {
		System.out.print("\ntestPfeil\n");
		String soll = "XXXXXXXX\nXXXXXXXX\nXXXX XXX\nXXXX  XX\nX      X\nXXXX  XX\nXXXX XXX\nXXXXXXXX\n";
		System.out.print(soll + "\n");
		String quadTree = "FFBBFBWWWBBFFWWBBFWBBBBBFFBWBBWFBWBBB";
		String ausgabe = P1L2A06A.getQuadTreeAsString(quadTree);
		System.out.print(ausgabe);
		assertTrue(soll.equals(ausgabe));
	}

	// Tests zusätzlicher Methoden:

	@Test
	void testFuelleFeld() {
		System.out.print("\ntestFuelleFeld\n");
		char[][] feld = P1L2A06A.fuelleFeld(8, "FFBBFBWWWBBFFWWBBFWBBBBBFFBWBBWFBWBBB");
		char[][] soll = { //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X' }, //
				{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, //
				{ 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', ' ', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
		};
		// feld ausgeben
		for (int zeile = 0; zeile < feld[0].length; zeile++) {
			for (int spalte = 0; spalte < feld.length; spalte++) {
				System.out.print(feld[zeile][spalte]);
			}
			System.out.print("\n");
		}
		assertArrayEquals(feld, soll);
	}

	@Test
	void testFuelleFeld16() {
		System.out.print("\ntestFuelleFeld16\n");
		char[][] feld = P1L2A06A.fuelleFeld(16, "FFBBFBWWWBBFFWWBBFWBBBBBFFBWBBWFBWBBB");
		char[][] soll = { //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X' }, //
				{ 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, //
		};
		// feld ausgeben
		for (int zeile = 0; zeile < feld.length; zeile++) {
			for (int spalte = 0; spalte < feld.length; spalte++) {
				System.out.print(feld[zeile][spalte]);
			}
			System.out.print("\n");
		}
		assertArrayEquals(feld, soll);
	}
	
	@Test
	void testberechneBildGroeße16() {
		System.out.print("\ntestberechneBildGroeße16\n");
		String quadTree = "FFBBFFBBWWWWWBBFFWWBBFWBBBBBFFBWBBWFBWBBB";
		int wert = P1L2A06A.berechneBildGroeße(quadTree);
		System.out.println (wert);
		assertTrue(wert == 16);
	}

	@Test
	void testberechneBildGroeße8() {
		System.out.print("\ntestberechneBildGroeße8\n");
		String quadTree = "FFBBFBWWWBBFFWWBBFWBBBBBFFBWBBWFBWBBB";
		int wert = P1L2A06A.berechneBildGroeße(quadTree);
		System.out.println (wert);
		assertTrue(wert == 8);
	}
	
	@Test
	void testberechneBildGroeße4() {
		System.out.print("\ntestberechneBildGroeße4\n");
		String quadTree = "FFWWBWBFWWBWB";
		int wert = P1L2A06A.berechneBildGroeße(quadTree);
		System.out.println (wert);
		assertTrue(wert == 4);
	}
	
	@Test
	void testberechneBildGroeße2() {
		System.out.print("\ntestberechneBildGroeße2\n");
		String quadTree = "FBBBB";
		int wert = P1L2A06A.berechneBildGroeße(quadTree);
		System.out.println (wert);
		assertTrue(wert == 2);
	}

	@Test
	void testberechneBildGroeße1() {
		System.out.print("\ntestberechneBildGroeße1\n");
		String quadTree = "B";
		int wert = P1L2A06A.berechneBildGroeße(quadTree);
		System.out.println (wert);
		assertTrue(wert == 1);
	}

}
