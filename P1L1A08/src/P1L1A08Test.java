import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L1A08Test {

	@Test
	void testRichtigEntschluesseltMit3_Groﬂbuchstaben() {

		String verschluesselteZeichenkette = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int Verschiebung = 3;

		int LaengeDesAlphabets = 26;
		assertTrue(P1L1A08
				.zeichenNacheindanderEntschluesseln(verschluesselteZeichenkette, Verschiebung, LaengeDesAlphabets)
				.equals("XYZABCDEFGHIJKLMNOPQRSTUVW"));
	}

	@Test
	void testRichtigEntschluesseltMit3_Kleinbuchstaben() {

		String verschluesselteZeichenkette = "abcdefghijklmnopqrstuvwxyz";
		int Verschiebung = 3;

		int LaengeDesAlphabets = 26;
		assertTrue(P1L1A08
				.zeichenNacheindanderEntschluesseln(verschluesselteZeichenkette, Verschiebung, LaengeDesAlphabets)
				.equals("XYZABCDEFGHIJKLMNOPQRSTUVW"));
	}

	@Test
	void testRichtigEntschluesseltMit3() {

		String verschluesselteZeichenkette = "GLHPDFKWGHUFRPSXWHU";
		int Verschiebung = 3;

		int LaengeDesAlphabets = 26;
		assertTrue(P1L1A08
				.zeichenNacheindanderEntschluesseln(verschluesselteZeichenkette, Verschiebung, LaengeDesAlphabets)
				.equals("DIEMACHTDERCOMPUTER"));
	}

	@Test
	void testRichtigEntschluesseltMit2() {

		String verschluesselteZeichenkette = "GLHPDFKWGHUFRPSXWHU";
		int Verschiebung = 2;

		int LaengeDesAlphabets = 26;
		assertTrue(P1L1A08
				.zeichenNacheindanderEntschluesseln(verschluesselteZeichenkette, Verschiebung, LaengeDesAlphabets)
				.equals("EJFNBDIUEFSDPNQVUFS"));
	}

}
