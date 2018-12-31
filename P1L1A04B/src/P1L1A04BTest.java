import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L1A04BTest {

	@Test
	void basicTests() {
		testAlwaysTrue();
		testAlwaysFalse();
	}

	void testAlwaysTrue() {
		assertTrue(true);
	}

	void testAlwaysFalse() {
		assertFalse(false);
	}

	@Test
	void punkteTests() {
		testFall1();
		testFall2();
		testFall3();
		testFall4();

	}

	void testFall1() {
		assertTrue(P1L1A04B.punkteInZeile("ABCGGEDF") == 3);
	}

	void testFall2() {
		assertTrue(P1L1A04B.punkteInZeile("AGGGGGAAA") == 5);
	}

	void testFall3() {
		assertTrue(P1L1A04B.punkteInZeile("AGGGGGAADA") == 10);
	}

	void testFall4() {
		assertTrue(P1L1A04B.punkteInZeile("AGGGGGAADAGGXXX") == 13);
	}

}
