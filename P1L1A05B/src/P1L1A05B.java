
public class P1L1A05B {
	public static void main(String[] args) {

		double strecke = 299.9999999999999999999999;

		//bei >=300 Endlosrekursion
		if (strecke < 300) {

			int wasserrationen = berechneWasserrationenFurGesamtstrecke(strecke);

			System.out.println(wasserrationen);
		} else {
		}
	}

	public static int berechneWasserrationenFurGesamtstrecke(double strecke) {

		int wasserrationen = 0;

		if (strecke <= 0) {
			return 0;
		}

		if (strecke <= 100) {
			return 1;
		}

		// strecke wird immer kleiner durch: s = F((s-100) *3/2), wenn s<=100 -> abbruch

		if (strecke >= 0) {
			wasserrationen++;

			wasserrationen += berechneWasserrationenFurGesamtstrecke((strecke - 100) * (3d / 2d));
		}

		return wasserrationen;
	}

}
