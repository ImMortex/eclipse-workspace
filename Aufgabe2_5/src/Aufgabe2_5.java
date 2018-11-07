
public class Aufgabe2_5 {
	public static void main(String[] args) {
		double[] abstaende =  {5, 4.3d, 6};
		double[] messpunkte = {2.1d, 4, 3};
		double ergebnis = 0;
		int laenge = messpunkte.length;
		for (int zaehler = 0; zaehler < laenge; zaehler++) {
			ergebnis = ergebnis + (abstaende[zaehler] * messpunkte[zaehler]);
		}
		System.out.println("Der abgeschätzte Flächeninhalt beträgt: " + ergebnis + "km²");

	}

}
