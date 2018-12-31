
public class P1L1A05A {
	public static void main(String[] args) {

		int wasserrationen =300;

		double gesamtStrecke = berechneGesamtstreckeAusWasserrationen(wasserrationen);

		ergebnisAusgeben(gesamtStrecke);

	}

	public static void ergebnisAusgeben(double gesamtStrecke) {
		String ausgabe = String.format("%.3f", gesamtStrecke);
		int laenge = ausgabe.length() - 1;
		System.out.printf("%." + laenge + "s", ausgabe);
		System.out.println(" km");
	}

	public static double berechneGesamtstreckeAusWasserrationen(int wasserrationen) {

		double gesamtStrecke = 0;

		if (wasserrationen <= 0) {
			gesamtStrecke = 0;
		} else if (wasserrationen == 1) {
			gesamtStrecke += 100d;
		} else {

			gesamtStrecke = 100d * Math.pow((2d / 3d), wasserrationen-1)
					+ berechneGesamtstreckeAusWasserrationen(wasserrationen -1 );
		}
		return gesamtStrecke;
	}
}
