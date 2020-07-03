//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L2A07B {
	@Test
	void testPlaygrounds() {
		Element[][] playgroundEasyGame = { //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE }, //
				{ Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL }, //
				{ Element.WALL, Element.TREASURE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.WALL }, //
				{ Element.WALL, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.WALL, Element.DOOR, Element.WALL }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.FREE }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.PLAYER, Element.FREE }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.WALL, Element.DOOR, Element.WALL }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE }//
		};

		String zielString1 = ""//
				+ "FFFFFFF\n"//
				+ "WWWWWWW\n"//
				+ "WTFFFFW\n"//
				+ "WFFFFFF\n"//
				+ "FFFWWDW\n"//
				+ "FFFWFFF\n"//
				+ "FFFWFPF\n"//
				+ "FFFWWDW\n"//
				+ "FFFFFFF\n";
		System.out.println("\ntestPlaygroundEasyGame:\n");
		String feld1 = P1L2A07C.getPlaygroundAsString(playgroundEasyGame);
		System.out.println(feld1);
		assertTrue(feld1.equals(zielString1));

	

		// da steht "HopE IT HELpS" im Spielfeld :)
		Element[][] playgroundHopeItHelps = { //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.WALL, Element.WALL,
						Element.FREE, Element.WALL, Element.TREASURE, Element.DOOR, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.WALL, Element.WALL,
						Element.FREE, Element.WALL, Element.FREE, Element.DOOR, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.WALL, Element.WALL,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.WALL,
						Element.FREE, Element.DOOR, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.WALL,
						Element.FREE, Element.DOOR, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL,
						Element.FREE, Element.DOOR, Element.FREE, Element.WALL, Element.FREE, Element.FREE,
						Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.DOOR,
						Element.FREE, Element.WALL, Element.FREE, }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.WALL, Element.WALL,
						Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.FREE, Element.WALL,
						Element.WALL, Element.WALL, Element.FREE, }, //
				{ Element.FREE, Element.PLAYER, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, }, //
		};
		String zielString2 = ""//
				+ "FFFFFFFFFFFFFFFFFFFFFF\n" //
				+ "FWFFWFFFFFFFFFFFFFFFFF\n" //
				+ "FWFFWFFFFFFFFFWWWFFFFF\n"//
				+ "FWWWWFWWWFWWWFWTDFFFFF\n"//
				+ "FWFFWFWFWFWFWFWWWFFFFF\n"//
				+ "FWFFWFWWWFWWWFWFDFFFFF\n"//
				+ "FFFFFFFFFFWFFFWWWFFFFF\n"//
				+ "FFWFWWWFFFFFFFFFFFFFFF\n"//
				+ "FFWFFWFFFFFFFFFFFFFFFF\n"//
				+ "FFWFFWFFFFFFFFFFFFFFFF\n"//
				+ "FFFFFFFFFFFFFFFFFFFFFF\n"//
				+ "FWFFWFFFFFFFFFFFFFFFFF\n"//
				+ "FWFFWFWWWFWFFFFFFFWWWF\n"//
				+ "FWWWWFWFDFWFFFWWWFWFDF\n"//
				+ "FWFFWFWWWFWFFFWFWFWWWF\n"//
				+ "FWFFWFWFDFWFFFWWWFDFWF\n"//
				+ "FFFFFFWWWFWWWFWFFFWWWF\n"//
				+ "FPFFFFFFFFFFFFFFFFFFFF\n";

		System.out.println("\ntestPlaygroundHopeItHelps:\n");
		String feld2 = P1L2A07C.getPlaygroundAsString(playgroundHopeItHelps);
		System.out.println(feld2);
		assertTrue(feld2.equals(zielString2));
	


		Element[][] playgroundFortressOfTaketreasure = { //

				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL,
						Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.WALL,
						Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.FREE }, //
				{ Element.DOOR, Element.WALL, Element.DOOR, Element.WALL, Element.DOOR, Element.WALL, Element.WALL,
						Element.WALL, Element.DOOR, Element.WALL, Element.DOOR, Element.WALL, Element.DOOR }, //
				{ Element.PLAYER, Element.WALL, Element.FREE, Element.DOOR, Element.FREE, Element.WALL,
						Element.TREASURE, Element.DOOR, Element.FREE, Element.WALL, Element.FREE, Element.DOOR,
						Element.FREE }, //
				{ Element.DOOR, Element.WALL, Element.DOOR, Element.WALL, Element.DOOR, Element.WALL, Element.WALL,
						Element.WALL, Element.DOOR, Element.WALL, Element.DOOR, Element.WALL, Element.DOOR }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.WALL,
						Element.WALL, Element.WALL, Element.WALL, Element.FREE, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL,
						Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.WALL, Element.FREE }, //
				{ Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE,
						Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE, Element.FREE }, //
		};

		String zielString3 = ""//
				+ "FFFFFFFFFFFFF\n"//
				+ "FWWWWWWWWWWWF\n"//
				+ "FWFFFFFFFFFWF\n"//
				+ "FWFWWWWWWWFWF\n"//
				+ "FWFWFFFFFWFWF\n"//
				+ "DWDWDWWWDWDWD\n"//
				+ "PWFDFWTDFWFDF\n"//
				+ "DWDWDWWWDWDWD\n"//
				+ "FWFWFFFFFWFWF\n"//
				+ "FWFWWWWWWWFWF\n"//
				+ "FWFFFFFFFFFWF\n"//
				+ "FWWWWWWWWWWWF\n"//
				+ "FFFFFFFFFFFFF\n";

		System.out.println("\ntestPlaygroundFortressOfTaketreasure:\n");
		String feld3 = P1L2A07C.getPlaygroundAsString(playgroundFortressOfTaketreasure);
		System.out.println(feld3);
		assertTrue(feld3.equals(zielString3));
	}
}
