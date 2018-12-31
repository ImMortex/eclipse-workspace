import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AussagenTest {

	@Test
	void testAlleFalse() {

		Boolean BennoZusage = false;
		Boolean FaysalZusage = false;

		Boolean DennisZusage = false;
		Boolean EllaZusage = false;

		Boolean HadrianZusage = false;
		Boolean IdaZusage = false;

		Boolean AnnaZusage = false;
		Boolean CarmenZusage = false;
		Boolean GretaZusage = false;

		Boolean KlaraZusage = false;
		Boolean JanZusage = false;

		Boolean[] errechneteErgebnisse = P1L1A01B.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage,
				DennisZusage, EllaZusage, FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] ergebnisse = { false, false, false, false, false, false, false, false, false, false, false };

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == ergebnisse[i]);
		}
	}

	@Test
	void testAlleNull() {

		Boolean BennoZusage = null;
		Boolean FaysalZusage = null;

		Boolean DennisZusage = null;
		Boolean EllaZusage = null;

		Boolean HadrianZusage = null;
		Boolean IdaZusage = null;

		Boolean AnnaZusage = null;
		Boolean CarmenZusage = null;
		Boolean GretaZusage = null;

		Boolean KlaraZusage = null;
		Boolean JanZusage = null;

		Boolean[] errechneteErgebnisse = P1L1A01B.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage,
				DennisZusage, EllaZusage, FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse1 = { null, null, null, true, false, null, null, null, null, null, null };
		Boolean[] richtigeErgebnisse2 = { null, null, null, false, true, null, null, null, null, null, null };

		for (int i = 6; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == null);
			assertTrue(errechneteErgebnisse[i] == null);
		}
		// Entweder Dennis oder Ella
		assertTrue(((errechneteErgebnisse[4] == richtigeErgebnisse1[4])
				^ (errechneteErgebnisse[5] == richtigeErgebnisse2[5])));

	}

	@Test
	void testAlleTrue() {

		Boolean BennoZusage = true;
		Boolean FaysalZusage = true;

		Boolean DennisZusage = true;
		Boolean EllaZusage = true;

		Boolean HadrianZusage = true;
		Boolean IdaZusage = true;

		Boolean AnnaZusage = true;
		Boolean CarmenZusage = true;
		Boolean GretaZusage = true;

		Boolean KlaraZusage = true;
		Boolean JanZusage = true;

		Boolean[] errechneteErgebnisse = P1L1A01B.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage,
				DennisZusage, EllaZusage, FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, true, true, true, false, true, true, true, true };

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}

	@Test
	void testAussage2Und3() {

		Boolean BennoZusage = true;
		Boolean FaysalZusage = true;

		Boolean DennisZusage = true;
		Boolean EllaZusage = null;

		Boolean HadrianZusage = true;
		Boolean IdaZusage = true;

		Boolean AnnaZusage = true;
		Boolean CarmenZusage = true;
		Boolean GretaZusage = null;

		Boolean KlaraZusage = true;
		Boolean JanZusage = true;

		Boolean[] errechneteErgebnisse = P1L1A01B.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage,
				DennisZusage, EllaZusage, FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, true, false, true, false, true, true, true, true };

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}

	@Test
	void testAussage1Und5() {

		Boolean BennoZusage = true;
		Boolean FaysalZusage = false;

		Boolean DennisZusage = true;
		Boolean EllaZusage = false;

		Boolean HadrianZusage = true;
		Boolean IdaZusage = true;

		Boolean AnnaZusage = true;
		Boolean CarmenZusage = true;
		Boolean GretaZusage = false;

		Boolean KlaraZusage = false;
		Boolean JanZusage = false;

		Boolean[] errechneteErgebnisse = P1L1A01B.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage,
				DennisZusage, EllaZusage, FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, true, false, false, false, true, true, false, false };

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}

	@Test
	void testAussage4() {

		Boolean BennoZusage = true;
		Boolean FaysalZusage = false;

		Boolean DennisZusage = false;
		Boolean EllaZusage = true;

		Boolean HadrianZusage = false;
		Boolean IdaZusage = true;

		Boolean AnnaZusage = true;
		Boolean CarmenZusage = true;
		Boolean GretaZusage = false;

		Boolean KlaraZusage = false;
		Boolean JanZusage = false;

		Boolean[] errechneteErgebnisse = P1L1A01B.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage,
				DennisZusage, EllaZusage, FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, false, true
				, false, false, false, false, false, false};

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}
}
