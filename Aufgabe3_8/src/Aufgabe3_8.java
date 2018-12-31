
public class Aufgabe3_8 {
	public static void main(String[] args) {
		int MaxKampfkraft = 200;
		int Magier = 200;    //Es ist egal, in welcher Reihenfolge die Werte geordnet sind
		int Riese = 50;
		int Ritter = 20;
		int Bogen = 10;
		int Lanzen = 5;
		int anzahl = 0;

		for (int a = MaxKampfkraft / Magier; a >= 0; a--) {
			for (int b = MaxKampfkraft / Riese; b >= 0; b--) {
				for (int c = MaxKampfkraft / Ritter; c >= 0; c--) {
					for (int d = MaxKampfkraft / Bogen; d >= 0; d--) {
						for (int e = MaxKampfkraft / Lanzen; e >= 0; e--) {
							if (a * Magier + b * Riese + c * Ritter + d * Bogen + e * Lanzen == MaxKampfkraft) {
								anzahl++;
							}
						}
					}
				}
				;
			}
		}
		System.out.println("Für die 5 Klassen gibt es " + anzahl + " Möglichkeiten, um eine Armee der Kampfkraft "
				+ MaxKampfkraft + " zu bilden.");
	}
}
