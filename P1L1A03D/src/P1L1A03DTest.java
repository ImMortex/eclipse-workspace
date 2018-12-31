import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P1L1A03DTest {

	@Test
	void test1() {

		char[][] spielfeld = { { 'E', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'A' } };
		char[][] soll = { { 'E', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'A' } };
		char[][] ist = P1L1A03D.erzeugeAufgefuelltesSpielfeld(spielfeld);
		Assertions.assertArrayEquals(soll, ist);
	}

	@Test
	void test2() {

		char[][] spielfeld = {

				{ 'M', 'M', 'M', 'M', 'M' },

				{ 'M', 'F', 'M', 'F', 'A' },

				{ 'M', 'F', 'F', 'F', 'M' },

				{ 'E', 'F', 'M', 'F', 'M' },

				{ 'M', 'M', 'M', 'M', 'M' } };

		char[][] soll = {

				{ 'M', 'M', 'M', 'M', 'M' },

				{ 'M', 'S', 'M', 'F', 'A' },

				{ 'M', 'F', 'F', 'F', 'M' },

				{ 'E', 'F', 'M', 'S', 'M' },

				{ 'M', 'M', 'M', 'M', 'M' } };
		char[][] ist = P1L1A03D.erzeugeAufgefuelltesSpielfeld(spielfeld);
		Assertions.assertArrayEquals(soll, ist);

	}

	@Test
	void test3() {

		char[][] spielfeld = { { 'E', 'A' } };
		char[][] soll = { { 'E', 'A' } };
		char[][] ist = P1L1A03D.erzeugeAufgefuelltesSpielfeld(spielfeld);
		Assertions.assertArrayEquals(soll, ist);
	}
}
