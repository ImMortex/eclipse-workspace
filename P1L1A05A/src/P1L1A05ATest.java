import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L1A05ATest {

	@Test
	void test1Ration() {
		assertTrue(P1L1A05A.berechneGesamtstreckeAusWasserrationen(1) == 100);
	}

	@Test
	void test2Ration() {
		double gesamtStrecke = P1L1A05A.berechneGesamtstreckeAusWasserrationen(2);
		String ausgabe = String.format("%.3f", gesamtStrecke);
		String testAusgabe = ausgabe.substring(0, ausgabe.length() - 1);
		assertTrue(testAusgabe.equals("166,66"));

	}

	@Test
	void test3Ration() {
		double gesamtStrecke = P1L1A05A.berechneGesamtstreckeAusWasserrationen(3);
		String ausgabe = String.format("%.3f", gesamtStrecke);
		String testAusgabe = ausgabe.substring(0, ausgabe.length() - 1);
		assertTrue(testAusgabe.equals("211,11"));
	}
}
