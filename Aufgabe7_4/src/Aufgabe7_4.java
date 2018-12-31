import java.util.Date;

public class Aufgabe7_4 {
	public static void main(String[] args) {

		char[] liste0 = { 'e', 'd', '1', 'b', 'A', 'e', 'd', '1', 'b', 'A' };
		char[] liste1 = { '4', 'j', 'i', '2', 'g', 'f' };

		System.out.println(erzeugeSortierteListe(liste0, liste1));

	}

	public static char[] erzeugeSortierteListe(char[] liste0, char[] liste1) {
		
		long startTime= System.nanoTime();

		char[] vereint = arraysKonkatenieren(liste0, liste1);

		vereint = selectionSortCharacterAufsteigend(vereint);

		long endTime =System.nanoTime();
		long runningTime = (endTime-startTime);
		
		System.out.println("runtime: "+ runningTime + " ns");
		
		
		return vereint;
	}

	public static char[] arraysKonkatenieren(char[] liste0, char[] liste1) {

		int gesamtLaenge = liste0.length + liste1.length;
		char[] vereint = new char[gesamtLaenge];

		for (int index0 = 0; index0 <= liste0.length - 1; index0++) {
			vereint[index0] = liste0[index0];
		}
		for (int index1 = 0; index1 <= liste1.length - 1; index1++) {
			vereint[index1 + liste0.length] = liste1[index1];
		}

		return vereint;
	}

	public static char[] selectionSortCharacterAufsteigend(char[] array) {
		
		int pointer = array.length - 1;
		int indexGroeﬂteZahl = 0;
		int countSwap = 0;
		int countCompare = 0;
		for (int durchlauf = 0; durchlauf <= array.length - 1; durchlauf++) {
			for (int index = 0; index <= pointer - 1; index++) {

				countCompare++;
				if (array[index + 1] > array[indexGroeﬂteZahl]) {

					indexGroeﬂteZahl = index + 1;
				}
			}
			swapCharacters(array, indexGroeﬂteZahl, pointer);
			countSwap++;
			pointer--;
			indexGroeﬂteZahl = 0;
		}
		System.out.println("compars: " + countCompare + ". swaps: " + countSwap);
		return array;
	}

	public static char[] swapCharacters(char[] array, int index1, int index2) {
		char zwischenspeicher;
		zwischenspeicher = array[index1];
		array[index1] = array[index2];
		array[index2] = zwischenspeicher;

		return array;
	}

}
