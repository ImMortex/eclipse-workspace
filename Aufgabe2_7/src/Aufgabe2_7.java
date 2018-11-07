
public class Aufgabe2_7 {
	public static void main(String[] args) {
		int spielfeld[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		spielfeld[0][0] = 2; // Spieler steht am Anfang bei (0|0)
		int spielerPositionX = 0;
		int spielerPositionY = 0;
		int SpielerSpuren = 2; // die "2" auf dem Spielfeld stehen für die Fußspuren des Spielers
		int Mauer = 1; // die "1" auf dem Spielfeld steht für eine Mauer
		int Laenge = spielfeld[0].length - 1;
		int MaximaleVersuche = (int) Math.pow(spielfeld[0].length, 2); // Abbruch,wenn der Spieler nach einer bestimmten
																		// Versuchszahl nicht am Ziel ankommt
		int versuche = 0;

		if (spielfeld[Laenge][Laenge] != SpielerSpuren) {
			while (spielfeld[Laenge][Laenge] != 2 && spielerPositionX <= Laenge && spielerPositionY <= Laenge
					&& versuche <= MaximaleVersuche) {
				System.out.println("Spieler soll sich nach unten bewegen, wenn es geht.");

				if (spielerPositionY + 1 <= Laenge && spielfeld[spielerPositionY + 1][spielerPositionX] != Mauer) {
					spielerPositionY = (spielerPositionY + 1);
					spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
					System.out.println("Spieler geht nach unten.");

				} else if (spielerPositionX + 1 <= Laenge
						&& spielfeld[spielerPositionY][spielerPositionX + 1] != Mauer) {
					spielerPositionX = (spielerPositionX + 1);
					spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
					System.out.println("Weg nach unten blockiert.");
					System.out.println("Spieler geht nach rechts.");

				} else if (spielerPositionY - 1 >= 0 && spielfeld[spielerPositionY - 1][spielerPositionX] != Mauer) {
					spielerPositionY = (spielerPositionY - 1);
					spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
					System.out.println("Weg nach unten und rechts blockiert.");
					System.out.println("Spieler geht nach oben.");

				} else if (spielerPositionX - 1 >= 0 && spielfeld[spielerPositionY][spielerPositionX - 1] != Mauer) {
					spielerPositionX = (spielerPositionX - 1);
					spielfeld[spielerPositionY][spielerPositionX] = SpielerSpuren;
					System.out.println("Weg nach oben, unten und rechts blockiert.");
					System.out.println("Spieler geht nach links.");

				} else {
					System.out.println("Alle Himmelsrichtungen sind blockiert.");
					System.out.println("Spieler kann sich nicht bewegen");
				}

				versuche++;
				System.out.println("Spieler befindet sich bei (" + spielerPositionX + "|" + spielerPositionY + ")");
				System.out.println(" ");
			}

		} else {
			System.out.println("Spieler ist schon am Ziel und brauch sich nicht bewegen.");

		}
		if (spielfeld[Laenge][Laenge] == SpielerSpuren) {
			System.out.println("Spieler ist am Ziel und braucht sich nicht mehr bewegen.");
		} else {
			System.out.println("Spieler konnte das Ziel nicht erreichen");
		}
		System.out.println("Hier ist das Spielfeld:");

		for (int zaehlerB = 0; zaehlerB <= Laenge; zaehlerB++) {

			for (int zaehlerA = 0; zaehlerA <= Laenge; zaehlerA++) {
				System.out.print(spielfeld[zaehlerB][zaehlerA]);
			}
			;
			System.out.println("");
		}

	}

}
