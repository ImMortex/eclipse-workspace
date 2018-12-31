import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L1A10BTest {

	public void kronePruefen(int breite, char[][] soll) {
		int hoehe = breite / 2;
		char[][] krone = P1L1A10B.erstelleKrone(breite, hoehe);

		for (int y = 0; y <= soll.length - 1; y++) {
			for (int x = 0; x <= soll[0].length - 1; x++) {
				assertTrue(krone[y][x] == soll[y][x]);
			}
		}
	}

	@Test
	void testBreite11() {

		int breite = 11;

		char[][] soll = {

				{ '*', 0, 0, 0, 0, '*', 0, 0, 0, 0, '*' },

				{ '0', 0, 0, 0, 0, '0', 0, 0, 0, 0, '0' },

				{ '0', '0', 0, 0, '0', '0', '0', 0, 0, '0', '0' },

				{ '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' },

				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }

		};

		kronePruefen(breite, soll);
	}

	@Test
	void testBreite5() {

		int breite = 5;

		char[][] soll = {

				{ '*', 0, '*', 0, '*' },

				{ 'X', 'X', 'X', 'X', 'X' }

		};

		kronePruefen(breite, soll);
	}

}
