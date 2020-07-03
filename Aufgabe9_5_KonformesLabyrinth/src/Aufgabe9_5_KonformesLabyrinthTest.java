import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

enum Field {
	FREE, DOOR, WALL

}

class Aufgabe9_5_KonformesLabyrinthTest {

	Field[][] labyrinth1 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.WALL, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.DOOR, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth2 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.WALL, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth3 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.FREE, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.FREE, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth4 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.FREE, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.FREE, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth5 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.FREE, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.DOOR, Field.FREE, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	// invalid fields:

	Field[][] labyrinth6 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.FREE, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.FREE, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.FREE, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth7 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL, Field.FREE }, //
			{ Field.WALL, Field.WALL, Field.DOOR, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.FREE, Field.WALL, Field.WALL, Field.WALL } //
	};

	/*im nachhinein: ein Array
	// ist IMMER rechteckig. alle
	// Zeilen sind gleich lang ind
	// alle Spalten sind gleich
	// lang*/
	
	
	Field[][] labyrinth8 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL, Field.WALL, Field.WALL }, // 
			{ Field.WALL, Field.WALL, Field.DOOR, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth9 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth10 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.DOOR, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};
	Field[][] labyrinth11 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.DOOR, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth12 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.DOOR, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	Field[][] labyrinth13 = { //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.FREE, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.DOOR, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL }, //
			{ Field.WALL, Field.WALL, Field.WALL, Field.WALL } //
	};

	public static boolean validDemension(Field[][] labyrinth) {

		if (labyrinth.length < 5)
			return false;

		for (int x = 0; x <= labyrinth.length - 1; x++) {

			if (labyrinth[x].length < 5)
				return false;

			if (x >= 1 && labyrinth[x].length != labyrinth[x - 1].length)
				return false;
		}

		if (labyrinth.length % 2 == 0 || labyrinth[0].length % 2 == 0) {
			return false;
		}

		return true;
	}

	public static boolean roomPresent(Field[][] labyrinth) {

		if (validDemension(labyrinth)) {

			for (int x = 0; x <= labyrinth[0].length - 1; x++) {
				for (int y = 0; y <= labyrinth.length - 1; y++) {
					if (element(labyrinth, x, y, Field.FREE))
						return true;
				}
			}
		}
		return false;
	}

	public static boolean isSingleDoorIfDoorPresent(Field[][] labyrinth) {
		if (roomPresent(labyrinth) && validDemension(labyrinth)) {

			for (int y = 0; y <= labyrinth.length - 1; y++) {
				for (int x = 0; x <= labyrinth[0].length - 1; x++) {

					if (element(labyrinth, x, y, Field.DOOR) && rightElement(labyrinth, x, y, Field.DOOR)) {
						return false;
					}
					if (element(labyrinth, x, y, Field.DOOR) && leftElement(labyrinth, x, y, Field.DOOR)) {
						return false;
					}
					if (element(labyrinth, x, y, Field.DOOR) && upperElement(labyrinth, x, y, Field.DOOR)) {
						return false;
					}
					if (element(labyrinth, x, y, Field.DOOR) && lowerElement(labyrinth, x, y, Field.DOOR)) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	public static boolean validRoom(Field[][] labyrinth) {
		if (roomPresent(labyrinth) && validDemension(labyrinth)) {

			for (int y = 0; y <= labyrinth.length - 1; y++) {
				for (int x = 0; x <= labyrinth[0].length - 1; x++) {

					if ((element(labyrinth, x, y, Field.FREE) && (rightElement(labyrinth, x, y, Field.DOOR) == false))
							&& (element(labyrinth, x, y, Field.WALL)
									&& (rightElement(labyrinth, x, y, Field.DOOR) == false))) {
						return false;
					}
					if ((element(labyrinth, x, y, Field.FREE) && (leftElement(labyrinth, x, y, Field.DOOR) == false))
							&& (element(labyrinth, x, y, Field.WALL)
									&& (leftElement(labyrinth, x, y, Field.DOOR) == false))) {
						return false;
					}
					if ((element(labyrinth, x, y, Field.FREE) && (upperElement(labyrinth, x, y, Field.DOOR) == false))
							&& (element(labyrinth, x, y, Field.WALL)
									&& (upperElement(labyrinth, x, y, Field.DOOR) == false))) {
						return false;
					}
					if ((element(labyrinth, x, y, Field.FREE) && (lowerElement(labyrinth, x, y, Field.DOOR) == false))
							&& (element(labyrinth, x, y, Field.WALL)
									&& (lowerElement(labyrinth, x, y, Field.DOOR) == false))) {
						return false;
					}
				}
			}
			return true;
		}
		return false;

	}

	public static boolean singleRoom(Field[][] labyrinth) {

		if (roomPresent(labyrinth) && validDemension(labyrinth)) {

			for (int y = 0; y <= labyrinth.length - 1; y++) {
				for (int x = 0; x <= labyrinth[0].length - 1; x++) {

					if (element(labyrinth, x, y, Field.FREE) && rightElement(labyrinth, x, y, Field.FREE)) {
						return false;
					}
					if (element(labyrinth, x, y, Field.FREE) && leftElement(labyrinth, x, y, Field.FREE)) {
						return false;
					}
					if (element(labyrinth, x, y, Field.FREE) && upperElement(labyrinth, x, y, Field.FREE)) {
						return false;
					}
					if (element(labyrinth, x, y, Field.FREE) && lowerElement(labyrinth, x, y, Field.FREE)) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	public static boolean everyRoomHasADoor(Field[][] labyrinth) {

		if (roomPresent(labyrinth) && validDemension(labyrinth)) {

			for (int y = 0; y <= labyrinth.length - 1; y++) {
				for (int x = 0; x <= labyrinth[0].length - 1; x++) {

					if (element(labyrinth, x, y, Field.FREE) && rightElement(labyrinth, x, y, Field.DOOR)) {
						return true;
					}
					if (element(labyrinth, x, y, Field.FREE) && leftElement(labyrinth, x, y, Field.DOOR)) {
						return true;
					}
					if (element(labyrinth, x, y, Field.FREE) && upperElement(labyrinth, x, y, Field.DOOR)) {
						return true;
					}
					if (element(labyrinth, x, y, Field.FREE) && lowerElement(labyrinth, x, y, Field.DOOR)) {
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}

	public static boolean everyDoorHasARoom(Field[][] labyrinth) {

		if (roomPresent(labyrinth) && validDemension(labyrinth)) {

			for (int y = 0; y <= labyrinth.length - 1; y++) {
				for (int x = 0; x <= labyrinth[0].length - 1; x++) {

					if (element(labyrinth, x, y, Field.DOOR) && rightElement(labyrinth, x, y, Field.FREE)) {
						return true;
					}
					if (element(labyrinth, x, y, Field.DOOR) && leftElement(labyrinth, x, y, Field.FREE)) {
						return true;
					}
					if (element(labyrinth, x, y, Field.DOOR) && upperElement(labyrinth, x, y, Field.FREE)) {
						return true;
					}
					if (element(labyrinth, x, y, Field.DOOR) && lowerElement(labyrinth, x, y, Field.FREE)) {
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}

	private static boolean element(Field[][] labyrinth, int x, int y, Field content) {
		return labyrinth[y][x] == content;
	}

	private static boolean lowerElement(Field[][] labyrinth, int x, int y, Field content) {
		return y - 1 >= 0 && labyrinth[y - 1][x] == content;
	}

	private static boolean upperElement(Field[][] labyrinth, int x, int y, Field content) {
		return y + 1 <= labyrinth.length - 1 && labyrinth[y + 1][x] == content;
	}

	private static boolean leftElement(Field[][] labyrinth, int x, int y, Field content) {
		return x - 1 >= 0 && labyrinth[y][x - 1] == content;
	}

	private static boolean rightElement(Field[][] labyrinth, int x, int y, Field content) {
		return x + 1 <= labyrinth.length - 1 && labyrinth[y][x + 1] == content;
	}

	private void validField(Field[][] field) {
		assertTrue(validDemension(field));
		assertTrue(roomPresent(field));
		assertTrue(singleRoom(field));
		assertTrue(validRoom(field));
		assertTrue(everyRoomHasADoor(field));
		assertTrue(isSingleDoorIfDoorPresent(field));
		assertTrue(enclosingWall(field));
	}

	public static boolean enclosingWall(Field[][] labyrinth) {

		if (validDemension(labyrinth)) {

			// upper Wall
			for (int y = 0; y <= labyrinth.length - 1; y++) {
				if (labyrinth[y][0] != Field.WALL) {
					return false;
				}
			}
			// lower Wall
			for (int y = 0; y <= labyrinth.length - 1; y++) {
				if (labyrinth[y][labyrinth[0].length - 1] != Field.WALL) {
					return false;
				}
			}
			// left Wall
			for (int x = 0; x <= labyrinth[0].length - 1; x++) {
				if (labyrinth[0][x] != Field.WALL) {
					return false;
				}
			}
			// right Wall
			for (int x = 0; x <= labyrinth[0].length - 1; x++) {
				if (labyrinth[labyrinth.length - 1][x] != Field.WALL) {
					return false;
				}
			}

			return true;
		}

		return false;
	}

	@Test
	void testlabyrinth1() {
		validField(labyrinth1);
	}

	@Test
	void testlabyrinth2() {
		validField(labyrinth2);
	}

	@Test
	void testlabyrinth3() {
		validField(labyrinth3);
	}

	@Test
	void testlabyrinth4() {
		validField(labyrinth4);
	}

	@Test
	void testlabyrinth5() {
		validField(labyrinth5);
	}

	@Test
	void testlabyrinth6() {
		Field[][] field = labyrinth6;
		assertTrue(validDemension(field));
		assertTrue(roomPresent(field));
		assertFalse(singleRoom(field));
		assertTrue(validRoom(field));
		assertFalse(everyRoomHasADoor(field));
		assertTrue(isSingleDoorIfDoorPresent(field));
		assertTrue(enclosingWall(field));
	}

	@Test
	void testlabyrinth7() {
		Field[][] field = labyrinth7;
		assertTrue(validDemension(field));
		assertTrue(roomPresent(field));
		assertTrue(singleRoom(field));
		assertTrue(validRoom(field));
		assertTrue(everyRoomHasADoor(field));
		assertTrue(isSingleDoorIfDoorPresent(field));
		assertFalse(enclosingWall(field));
	}

	@Test
	void testlabyrinth8() {
		Field[][] field = labyrinth8;
		assertFalse(validDemension(field));
		assertFalse(roomPresent(field));
		assertFalse(singleRoom(field));
		assertFalse(validRoom(field));
		assertFalse(everyRoomHasADoor(field));
		assertFalse(isSingleDoorIfDoorPresent(field));
		assertFalse(enclosingWall(field));
	}

	@Test
	void testlabyrinth9() {
		Field[][] field = labyrinth9;
		assertTrue(validDemension(field));
		assertFalse(roomPresent(field));
		assertFalse(singleRoom(field));
		assertFalse(validRoom(field));
		assertFalse(everyRoomHasADoor(field));
		assertFalse(isSingleDoorIfDoorPresent(field));
		assertTrue(enclosingWall(field));
	}

	@Test
	void testlabyrinth10() {
		Field[][] field = labyrinth10;
		assertFalse(validDemension(field));
		assertFalse(roomPresent(field));
		assertFalse(singleRoom(field));
		assertFalse(validRoom(field));
		assertFalse(everyRoomHasADoor(field));
		assertFalse(isSingleDoorIfDoorPresent(field));
		assertFalse(enclosingWall(field));
	}

	@Test
	void testlabyrinth11() {
		Field[][] field = labyrinth11;
		assertTrue(validDemension(field));
		assertTrue(roomPresent(field));
		assertTrue(singleRoom(field));
		assertTrue(validRoom(field));
		assertTrue(everyRoomHasADoor(field));
		assertFalse(isSingleDoorIfDoorPresent(field));
		assertTrue(enclosingWall(field));
	}

	@Test
	void testlabyrinth12() {
		Field[][] field = labyrinth12;
		assertTrue(validDemension(field));
		assertTrue(roomPresent(field));
		assertFalse(singleRoom(field));
		assertTrue(validRoom(field));
		assertTrue(everyRoomHasADoor(field));
		assertTrue(isSingleDoorIfDoorPresent(field));
		assertTrue(enclosingWall(field));
	}

	@Test
	void testlabyrinth13() {
		Field[][] field = labyrinth13;
		assertFalse(validDemension(field));
		assertFalse(roomPresent(field));
		assertFalse(singleRoom(field));
		assertFalse(validRoom(field));
		assertFalse(everyRoomHasADoor(field));
		assertFalse(isSingleDoorIfDoorPresent(field));
		assertFalse(enclosingWall(field));
	}

}
