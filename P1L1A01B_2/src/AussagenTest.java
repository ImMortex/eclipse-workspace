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

		Boolean[] errechneteErgebnisse = P1L1A01B_2.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage, DennisZusage, EllaZusage,
				FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
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

		Boolean[] errechneteErgebnisse = P1L1A01B_2.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage, DennisZusage, EllaZusage,
				FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { null, null, null, null, null, null, null, null, null, null, null};

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}

	@Test
	void testAussage2Und3() {

		Boolean BennoZusage = true;
		Boolean FaysalZusage = true;

		Boolean DennisZusage = true;
		Boolean EllaZusage = false;

		Boolean HadrianZusage = true;
		Boolean IdaZusage = true;

		Boolean AnnaZusage = true;
		Boolean CarmenZusage = true;
		Boolean GretaZusage = false;

		Boolean KlaraZusage = true;
		Boolean JanZusage = true;

		Boolean[] errechneteErgebnisse = P1L1A01B_2.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage, DennisZusage, EllaZusage,
				FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, true, false, true, false, true, true, true, true};

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

		Boolean[] errechneteErgebnisse = P1L1A01B_2.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage, DennisZusage, EllaZusage,
				FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, true, false, true, false, true, true, true, true};

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}
	
	@Test
	void testAussage4() {

		Boolean BennoZusage = true;
		Boolean FaysalZusage = false;

		Boolean DennisZusage = true;
		Boolean EllaZusage = false;

		Boolean HadrianZusage = false;
		Boolean IdaZusage = true;

		Boolean AnnaZusage = true;
		Boolean CarmenZusage = true;
		Boolean GretaZusage = false;

		Boolean KlaraZusage = false;
		Boolean JanZusage = false;

		Boolean[] errechneteErgebnisse = P1L1A01B_2.aussagenBeruecksichtigen(AnnaZusage, BennoZusage, CarmenZusage, DennisZusage, EllaZusage,
				FaysalZusage, GretaZusage, HadrianZusage, IdaZusage, JanZusage, KlaraZusage);
		Boolean[] richtigeErgebnisse = { true, true, true, true, false, true, false, false, false, true, true};

		for (int i = 0; i <= errechneteErgebnisse.length - 1; i++) {
			assertTrue(errechneteErgebnisse[i] == richtigeErgebnisse[i]);
		}
	}
}
