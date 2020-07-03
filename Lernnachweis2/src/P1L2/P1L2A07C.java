//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import java.util.Scanner;

enum Element {
	FREE, WALL, DOOR, TREASURE, PLAYER
};

enum Action {
	MOVEUP, MOVELEFT, MOVEDOWN, MOVERIGHT, HELP, OPENDOOR, TAKETREASURE, EXIT
};

public class P1L2A07C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Element[][] playground = loadPlayGround();

		System.out.println("Spiel gestartet. Bitte Befehle zur Steuerung des Spielers (Player) eingeben:");

		boolean spielLaeuft = true;
		while (spielLaeuft) {

			String command = scanner.nextLine();
			Action[] actions = commandverwaltung(command);// command in action umwandeln

			playground = processUserActions(actions, playground);// action umsetzen
			spielLaeuft = aufTruhePruefen(playground) && aufExitPruefen(actions);
		}
		System.out.println("Programm beendet.");
		scanner.close();
	}

	public static Element[][] loadPlayGround() {
		Element[][] playground = { //
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
		return playground;
	}

	public static boolean aufTruhePruefen(Element[][] playground) {
		for (int y = 0; y < playground.length; y++) {
			for (int x = 0; x < playground[0].length; x++) {
				if (playground[y][x] == Element.TREASURE) {
					return true;
				}
			}
		}
		System.out.println("Du hast gewonnen");
		return false;
	}

	public static boolean aufExitPruefen(Action[] actions) {
		/*
		 * es reicht ein Teilbefehl EXIT aus, um die While-Schleife der Main-Methode zu
		 * stoppen
		 */
		for (int index = 0; index < actions.length; index++) {
			if (actions[index] == Action.EXIT) {
				return false;
			}
		}
		return true;
	}

	public static String getPlaygroundAsString(Element[][] playground) {
		/*
		 * diese Funktion wandelt den Inhalt des Spielfelds in einen ausgabefähigen
		 * String um, welcher zur Ausgabe des kompletten Spielfelds dienen soll
		 */

		String ausgabeString = "";
		for (int y = 0; y < playground.length; y++) {
			for (int x = 0; x < playground[0].length; x++) {
				ausgabeString += giveShortcut(playground[y][x]);
			}
			ausgabeString += "\n";
		}
		return ausgabeString;
	}

	public static Action[] commandverwaltung(String command) {
		/*
		 * diese Funktion entscheidet, wie der command verarbeitet werden soll (single
		 * oder sequence)
		 */

		Action[] actions = new Action[1];

		// sequence
		if (command.contains("und") || command.contains(",")) {
			command = command.replace(",", " und bewege nach");

			// command in Teilbefehle splitten
			String[] eingaben = command.split(" und ");

			actions = processUserInputSequences(eingaben);

		} else {
			// single
			actions[0] = processUserInput(command);
		}
		return actions;
	}

	public static Action processUserInput(String command) {
		/*
		 * Diese Funktion wandelt einen command in action um, return null falls es den
		 * command nicht gibt. Bei null wird also die Fkt. processUserActions
		 * "Fehlerhafte Aktion." ausgeben
		 */

		command = command.toLowerCase();
		if (command.startsWith("bewege nach ")) {
			command = command.substring(12);
			if (command.equals("links")) {
				return Action.MOVELEFT;
			} else if (command.equals("rechts")) {
				return Action.MOVERIGHT;
			} else if (command.equals("oben")) {
				return Action.MOVEUP;
			} else if (command.equals("unten")) {
				return Action.MOVEDOWN;
			}
		} else if (command.equals("help") || command.equals("hilfe")) {
			return Action.HELP;
		} else if (command.equals("aufbrechen") || command.equals("dietrich benutzen")) {
			return Action.OPENDOOR;
		} else if (command.equals("nimm den schatz")) {
			return Action.TAKETREASURE;
		} else if (command.equals("ende")) {
			return Action.EXIT;
		}
		return null;
	}

	public static Action[] processUserInputSequences(String[] command) {
		// diese Funktion wandelt jeden command (Teilbefehl) in eine action um

		Action[] actions = new Action[command.length];
		for (int i = 0; i < command.length; i++) {
			actions[i] = processUserInput(command[i]);
		}
		return actions;
	}

	public static Element[][] processUserActions(Action[] actions, Element[][] spielfeld) {
		// diese Funktion kümmert sich um die Verarbeitung der actions

		for (int index = 0; index < actions.length; index++) {
			int[] playerPos = givePositionOfPlayer(spielfeld);
			int yPosition = playerPos[0]; // yKoordinate Player
			int xPosition = playerPos[1]; // xKoordinate Player
			if (actions[index] == Action.EXIT) {// Aktionsfolgen abbrechen, while-Schleife in Main-Methode abbrechen
				return spielfeld;
			} else

			if (actions[index] == Action.MOVEDOWN && spielfeld.length > yPosition + 1
					&& spielfeld[yPosition + 1][xPosition] == Element.FREE) {
				spielfeld[yPosition][xPosition] = Element.FREE;
				spielfeld[yPosition + 1][xPosition] = Element.PLAYER;

			} else if (actions[index] == Action.MOVEUP && yPosition - 1 >= 0
					&& spielfeld[yPosition - 1][xPosition] == Element.FREE) {
				spielfeld[yPosition][xPosition] = Element.FREE;
				spielfeld[yPosition - 1][xPosition] = Element.PLAYER;

			} else if (actions[index] == Action.MOVELEFT && xPosition - 1 >= 0
					&& spielfeld[yPosition][xPosition - 1] == Element.FREE) {
				spielfeld[yPosition][xPosition] = Element.FREE;
				spielfeld[yPosition][xPosition - 1] = Element.PLAYER;

			} else if (actions[index] == Action.MOVERIGHT && spielfeld[0].length > xPosition + 1
					&& spielfeld[yPosition][xPosition + 1] == Element.FREE) {
				spielfeld[yPosition][xPosition] = Element.FREE;
				spielfeld[yPosition][xPosition + 1] = Element.PLAYER;

			} else if (actions[index] == Action.HELP) {
				System.out.print(getOverviewOfUser(spielfeld));
			} else if (actions[index] == Action.OPENDOOR) {
				if (spielfeld.length > yPosition + 1 && spielfeld[yPosition + 1][xPosition] == Element.DOOR) {
					spielfeld[yPosition + 1][xPosition] = Element.FREE; // Tür unten entfernt
				} else

				if (0 < yPosition && spielfeld[yPosition - 1][xPosition] == Element.DOOR) {
					spielfeld[yPosition - 1][xPosition] = Element.FREE; // Tür oben entfernt
				} else

				if (0 < xPosition && spielfeld[yPosition][xPosition - 1] == Element.DOOR) {
					spielfeld[yPosition][xPosition - 1] = Element.FREE; // Tür links entfernt

				} else if (spielfeld[0].length > xPosition + 1 && spielfeld[yPosition][xPosition + 1] == Element.DOOR) {
					spielfeld[yPosition][xPosition + 1] = Element.FREE; // Tür rechts entfernt
				}
			} else if (actions[index] == Action.TAKETREASURE) {
				if (spielfeld.length > yPosition + 1 && spielfeld[yPosition + 1][xPosition] == Element.TREASURE) {
					spielfeld[yPosition + 1][xPosition] = Element.FREE; // Truhe unten entfernt
				} else

				if (0 < yPosition && spielfeld[yPosition - 1][xPosition] == Element.TREASURE) {
					spielfeld[yPosition - 1][xPosition] = Element.FREE; // Truhe oben entfernt
				} else

				if (0 < xPosition && spielfeld[yPosition][xPosition - 1] == Element.TREASURE) {
					spielfeld[yPosition][xPosition - 1] = Element.FREE; // Truhe links entfernt
				} else if (spielfeld[0].length > xPosition + 1
						&& spielfeld[yPosition][xPosition + 1] == Element.TREASURE) {
					spielfeld[yPosition][xPosition + 1] = Element.FREE; // Truhe rechts entfernt
				}
			} else {
				System.out.println("Fehlerhafte Aktion.");
				return spielfeld;
			}
		}
		return spielfeld;
	}

	public static String getOverviewOfUser(Element[][] spielfeld) {
		/*
		 * diese Funktion nimmt einen bestimmten Ausschnitt des Spielfelds, 4 Felder um
		 * den Spieler herum, und wandelt darstellbare Inhalte in einen asugabefähigen
		 * String um, welcher den kreisähnlichen Teilbereich des Spielfelds zeigen soll
		 */

		String ausgabeString = "";
		int[] playerPosition = givePositionOfPlayer(spielfeld);
		int yPosition = playerPosition[0];
		int xPosition = playerPosition[1];

		for (int yKoordinate = -4; yKoordinate <= 4; yKoordinate++) {
			// gibt es diesen y-Wert im Array?
			if (yPosition + yKoordinate >= 0 && yPosition + yKoordinate < spielfeld.length) {

				for (int xKoordinate = -4; xKoordinate <= 4; xKoordinate++) {
					// gibt es diesen x-Wert im Array?
					if (xPosition + xKoordinate >= 0 && xPosition + xKoordinate < spielfeld[0].length) {

						if (yKoordinate == -4 || yKoordinate == 4) {
							switch (xKoordinate) {
							case -4:
							case -3:
								ausgabeString += " ";
								break;
							case 3:
							case 4:
								break;
							default:
								ausgabeString += giveShortcut(
										spielfeld[yPosition + yKoordinate][xPosition + xKoordinate]);
							}
						} else {
							if (yKoordinate == -3 || yKoordinate == 3) {
								switch (xKoordinate) {
								case -4:
									ausgabeString += " ";
									break;
								case 4:
									break;
								default:
									ausgabeString += giveShortcut(
											spielfeld[yPosition + yKoordinate][xPosition + xKoordinate]);
								}
							} else {
								ausgabeString += giveShortcut(
										spielfeld[yPosition + yKoordinate][xPosition + xKoordinate]);
							}
						}
					}
				} // Ende innere Schleife

				ausgabeString += "\n";
			}
		} // Ende äußere Schleife
		return ausgabeString;
	}

	public static int[] givePositionOfPlayer(Element[][] spielfeld) {
		// diese Funktion ermittelt die aktuelle Position des Spielers auf dem Spielfeld

		// yKoordinate ist die Senkrechte und die xKoordinate ist die Waagerechte
		int[] position = new int[2];
		for (int yKoordinate = 0; yKoordinate < spielfeld.length; yKoordinate++) {
			for (int xKoordinate = 0; xKoordinate < spielfeld[0].length; xKoordinate++) {
				if (spielfeld[yKoordinate][xKoordinate] == Element.PLAYER) {
					position[0] = yKoordinate;
					position[1] = xKoordinate;
				}
			}
		}
		return position;
	}

	public static String giveShortcut(Element eingabe) {
		switch (eingabe) {
		case DOOR:
			return "D";

		case FREE:
			return "F";

		case PLAYER:
			return "P";

		case TREASURE:
			return "T";

		case WALL:
			return "W";

		default:
			return null;
		}
	}
}
