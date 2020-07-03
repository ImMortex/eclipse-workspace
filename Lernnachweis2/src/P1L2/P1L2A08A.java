//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import java.util.Random;

public class P1L2A08A {

	public static void main(String[] args) {

		//ruft Spielfeld aus der vorherigen Aufgabe auf
		Element[][] spielfeld = P1L2.P1L2A07C.loadPlayGround();
		
		printPathToTreasure(spielfeld);
	}

	public static int[] givePositionOfTreasure(Element[][] spielfeld) {
		int[] treasurePosition = new int[2];
		for (int yKoordinate = 0; yKoordinate < spielfeld.length; yKoordinate++) {
			for (int xKoordinate = 0; xKoordinate < spielfeld[0].length; xKoordinate++) {
				if (spielfeld[yKoordinate][xKoordinate] == Element.TREASURE) {
					treasurePosition[0] = yKoordinate;
					treasurePosition[1] = xKoordinate;
				}
			}
		}
		return treasurePosition;
	}

	public static void printPathToTreasure(Element[][] spielfeld) {
		// Funktionsaufruf aus einer anderen Klasse
		int[] treasurePosition = givePositionOfTreasure(spielfeld);
		int yPositionTreasure = treasurePosition[0];
		int xPositionTreasure = treasurePosition[1];
		Random zufall = new Random();
		boolean treasureNotFound = true;
		
		//Spieler findet per Zufall zum Ziel
		while (treasureNotFound) {
			int richtung = zufall.nextInt(8);
			
			int[] playerPosition = P1L2.P1L2A07C.givePositionOfPlayer(spielfeld);
			int yPositionPlayer = playerPosition[0];
			int xPositionPlayer = playerPosition[1];

			if ((yPositionPlayer + 1 == yPositionTreasure && xPositionPlayer == xPositionTreasure)
					|| (yPositionPlayer == yPositionTreasure && xPositionPlayer + 1 == xPositionTreasure)
					|| (yPositionPlayer - 1 == yPositionTreasure && xPositionPlayer == xPositionTreasure)
					|| (yPositionPlayer == yPositionTreasure && xPositionPlayer - 1 == xPositionTreasure)) {
				treasureNotFound = false;
			}

			// nach unten
			if ((richtung==0 ||richtung==1)  &&spielfeld.length > yPositionPlayer + 1
					&& (spielfeld[yPositionPlayer + 1][xPositionPlayer] == Element.FREE
							|| spielfeld[yPositionPlayer + 1][xPositionPlayer] == Element.DOOR)) {
				spielfeld[yPositionPlayer][xPositionPlayer] = Element.FREE;
				spielfeld[yPositionPlayer + 1][xPositionPlayer] = Element.PLAYER;
				positionAusgeben(yPositionPlayer, xPositionPlayer);
			} else

			// nach rechts
			if ((richtung==2 ||richtung==3) && spielfeld[0].length > xPositionPlayer + 1
					&& (spielfeld[yPositionPlayer][xPositionPlayer + 1] == Element.FREE
							|| spielfeld[yPositionPlayer][xPositionPlayer + 1] == Element.DOOR)) {
				spielfeld[yPositionPlayer][xPositionPlayer] = Element.FREE;
				spielfeld[yPositionPlayer][xPositionPlayer + 1] = Element.PLAYER;
				positionAusgeben(yPositionPlayer, xPositionPlayer);
			} else
			// nach links
			if ((richtung==4 ||richtung==5) && xPositionPlayer - 1 >= 0
					&& (spielfeld[yPositionPlayer][xPositionPlayer - 1] == Element.FREE
							|| spielfeld[yPositionPlayer][xPositionPlayer - 1] == Element.DOOR)) {
				spielfeld[yPositionPlayer][xPositionPlayer] = Element.FREE;
				spielfeld[yPositionPlayer][xPositionPlayer - 1] = Element.PLAYER;
				positionAusgeben(yPositionPlayer, xPositionPlayer);
			} else

			// nach oben
			if ((richtung==6 ||richtung==7) && yPositionPlayer - 1 >= 0 && (spielfeld[yPositionPlayer - 1][xPositionPlayer] == Element.FREE
					|| spielfeld[yPositionPlayer - 1][xPositionPlayer] == Element.DOOR)) {
				spielfeld[yPositionPlayer][xPositionPlayer] = Element.FREE;
				spielfeld[yPositionPlayer - 1][xPositionPlayer] = Element.PLAYER;
				positionAusgeben(yPositionPlayer, xPositionPlayer);
			}

			else {
				// passiert nichts
			}

			

		}
	}

	public static void positionAusgeben(int yPositionPlayer, int xPositionPlayer) {
		System.out.println(yPositionPlayer + "," + xPositionPlayer);
	}

}
