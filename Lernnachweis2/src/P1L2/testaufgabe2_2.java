//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

public class testaufgabe2_2 {
	public static void algoE(int n) {

		int k = 2;

		int result = 1;

		for (int i = 1; i < n; i++) {

			for (int j = 0; j <= k; j++) {

				result = result * i;

			}

			k = k * i;

		}

	}
/*
	public static int algoF(int i) {

		if (i <= 0) {

			return 0;

		} else if (i == 1) {

			return 1;

		} else {

			return algoE(i - 2) + algoE(i - 1);

		}

	}
	*/
}
