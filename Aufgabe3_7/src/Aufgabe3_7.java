
public class Aufgabe3_7 {
	public static void main(String[] args) {
		// spielfeld [Y][X]
		
		 int spielfeld[][] = {

				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		spielfeld[0][0] = 2; // Spieler steht am Anfang bei (0|0)
		int spielerPositionX = 0;
		int spielerPositionY = 0;
		int SpielerSpuren = 2; // die "2" auf dem Spielfeld stehen für die Fußspuren des Spielers
		int Mauer = 1; // die "1" auf dem Spielfeld steht für eine Mauer
		int Laenge = spielfeld[0].length - 1;
		int lueckePositionY;
		boolean mauerVorhanden = false;
		int MaximaleVersuche = (int) (Math.pow(spielfeld[0].length, 2)) / 2; // Abbruch,wenn der Spieler nach einer
																				// bestimmten
		// maximale Schrittzahl auf dem Weg zum Ziel
		int versuche = 1;

		// While-Schleife für die Wegfindung
		if (spielfeld[Laenge][Laenge] != SpielerSpuren) {
			// Schleife startet gar nicht erst, wenn der Spieler bereits am Ziel ist
			while (spielfeld[Laenge][Laenge] != 2 && spielerPositionX <= Laenge && spielerPositionY <= Laenge
					&& versuche <= MaximaleVersuche) {

				lueckePositionY = -1; // Reset lueckePositionY

				// Lücke suchen, wenn Spieler über einer Mauer steht
				for (int i = spielfeld[0].length - 1; i >= 0; i--) {
					mauerVorhanden = false;
					if (spielerPositionY < spielfeld[0].length - 1
							&& spielfeld[spielerPositionY + 1][spielerPositionX] == 1) {
						mauerVorhanden = true;
					}

					if (mauerVorhanden == true && spielfeld[spielerPositionY + 1][i] == 0 && lueckePositionY == -1) {
						lueckePositionY = i;

					}
				}
				;
				// Prüfen auf Mauer und Lücken
				if (mauerVorhanden && lueckePositionY == -1) {
					System.out.println(
							"Der Spieler wird das Ziel nicht erreichen, \n da es mindestens eine Mauer ohne Lücken gibt!");
					break;
				} else {

					// Bewegungsmuster:
					if (lueckePositionY != -1) {
						System.out.println("Mauer vorhanden. Lücke bei X=" + (lueckePositionY) + " gefunden.");
					}
					;
					System.out.println("Spieler soll sich nach unten bewegen, wenn es geht.");

					// NACH UNTEN
					if (spielerPositionY + 1 <= Laenge && spielfeld[spielerPositionY + 1][spielerPositionX] != Mauer
							&& spielfeld[spielerPositionY + 1][spielerPositionX] != SpielerSpuren) {
						spielerPositionY = (spielerPositionY + 1);
						spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
						System.out.println("Spieler geht nach unten.");

						// NACH RECHTS
						/*
						 * Rechtsdrall: der Spieler weiß, dass das Ziel rechts ist und dass rechts immer
						 * der kürzeste Weg ist
						 */
					} else if (lueckePositionY > spielerPositionX || lueckePositionY == -1) {
						System.out.println("Nach unten blockiert. Schaue, ob es nach rechts geht.");
						if (spielerPositionX + 1 <= Laenge && spielfeld[spielerPositionY][spielerPositionX + 1] != Mauer
								&& spielfeld[spielerPositionY][spielerPositionX + 1] != SpielerSpuren) {
							spielerPositionX = (spielerPositionX + 1);
							spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
							System.out.println("Spieler geht nach rechts.");
						} else {
							System.out.println("Alle Wege sind blockiert.");
							System.out.println("Spieler konnte das Ziel nicht erreichen!");
							break;
						}
						;
						// NACH LINKS
					} else if (lueckePositionY < spielerPositionX) {
						System.out.println("Weg nach unten und rechts blockiert. Schaue, ob es nach links geht.");
						if (spielerPositionX - 1 >= 0 && spielfeld[spielerPositionY][spielerPositionX - 1] != Mauer
								&& spielfeld[spielerPositionY][spielerPositionX - 1] != SpielerSpuren) {
							spielerPositionX = (spielerPositionX - 1);
							spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
							System.out.println("Spieler geht nach links.");
						} else {
							System.out.println("Alle Wege sind blockiert.");
							System.out.println("Spieler konnte das Ziel nicht erreichen!");
							break;
						}
						;
					}

					versuche++;
					System.out.println(
							"Spieler befindet sich bei (X=" + spielerPositionX + "|Y=" + spielerPositionY + ")");
					System.out.println(" ");
				}
			}
		} else {
			System.out.println("Spieler ist schon am Ziel und brauch sich nicht bewegen.");
		}
		if (spielfeld[Laenge][Laenge] == SpielerSpuren) {
			System.out.println("Spieler ist am Ziel und braucht sich nicht mehr bewegen.");
			System.out.println("Versuche: " + versuche);

		}
		System.out.println("Hier ist das Spielfeld:");

		for (int zaehlerB = 0; zaehlerB <= Laenge; zaehlerB++) {

			for (int zaehlerA = 0; zaehlerA <= Laenge; zaehlerA++) {
				// Augenkrebs-Schutz -> Zeichen statt Zahlen
				switch (spielfeld[zaehlerB][zaehlerA]) {
				case 0:
					System.out.print(". ");
					break;
				case 1:
					System.out.print("_ ");
					break;
				case 2:
					System.out.print("@ ");
					break;
				}

			}
			;
			System.out.println("");
		}

	}

}
