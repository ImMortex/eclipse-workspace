
public class Aufgabe4_6 {
	enum Zustaende {
		MONSTER, VERFUEG
	}// m�gliche Zust�nde f�r das Array Spielfeld in einer enum (Liste) definiert

	public static void main(String[] args) {

		Zustaende[][] spielfeld = {

				 {Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.MONSTER },
				 {Zustaende.MONSTER, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.MONSTER },
				 {Zustaende.MONSTER, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.MONSTER },
				 {Zustaende.MONSTER, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.MONSTER },
				 {Zustaende.MONSTER, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.MONSTER },
				 {Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.MONSTER } };
		boolean monsterImWeg = false;

		// Spielfeld spaltenweise und zeilenweise (Doppelschleife) durchlaufen
		for (int y = 0; monsterImWeg == false && y <= spielfeld[0].length - 1; y++) {
			for (int x = 0; x <= spielfeld[0].length - 1; x++) {

				System.out.println(x + " " + y);
				if (spielfeld[y][x] == Zustaende.MONSTER) { /*
															 * wenn Monster gefunden, dann die diagonalen rechts von dem
															 * Monster auf weiterer Monster �berpr�fen. Wenn nur ein
															 * Monster auf der Diagonalen eines anderen Mosters steht,
															 * ist das Spielfeld schon invalide->Abbruch
															 */

					for (int untereDiagonale = 1; x + untereDiagonale <= spielfeld[0].length - 1
							&& y + untereDiagonale <= spielfeld[0].length - 1; untereDiagonale++) {
						if (spielfeld[y + untereDiagonale][x + untereDiagonale] == Zustaende.MONSTER) {
							monsterImWeg = true;// wenn Monster in oberer Diagonale gefunden-> true, Schleifenabbruch
						}
					}
					for (int obereDiagonale = 1; x + obereDiagonale <= spielfeld[0].length - 1
							&& y - obereDiagonale >= 0; obereDiagonale++) {
						if (spielfeld[y - obereDiagonale + 1][x + obereDiagonale] == Zustaende.MONSTER) {
							monsterImWeg = true;// wenn Monster in unterer Diagonale gefunden-> true, Schleifenabbruch
						}
					}
				}
			}
		}
		if (monsterImWeg) {
			System.out.println("Kein valides Spielfeld");
		} else {
			System.out.println("Valides Spielfeld");
		}
	}

}
