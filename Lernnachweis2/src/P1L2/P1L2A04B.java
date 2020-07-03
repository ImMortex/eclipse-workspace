//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import java.io.*;
import java.util.Scanner;

public class P1L2A04B {

	public static void main(String[] args) throws IOException {
		String vollstaendigerPfadZuBilddatei = "";
		if (args.length == 1) {
			vollstaendigerPfadZuBilddatei = args[0];
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Eingabe Pfad zur Bilddatei:");
			vollstaendigerPfadZuBilddatei = scanner.nextLine();
			scanner.close();
		}
		int[][] farbigesBild = getObjectsInPicture(vollstaendigerPfadZuBilddatei);
		
		//Ausgabe
		for (int height = 0; height < farbigesBild.length; height++) {
			for (int width = 0; width < farbigesBild[0].length; width++) {
				System.out.print(farbigesBild[height][width]);
			}
			System.out.print("\n");
		}
	}

	public static int[][] getObjectsInPicture(String vollstaendigerPfadZuBilddatei) throws IOException {
		FileReader myFileReader = new FileReader(vollstaendigerPfadZuBilddatei);
		BufferedReader myBufferedReader = new BufferedReader(myFileReader);

		String[] inputs = myBufferedReader.readLine().split(" ");
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		int[][] bild = new int[x][y];
		for (int zeile = 0; zeile < x; zeile++) {
			inputs = myBufferedReader.readLine().split(" ");
			for (int spalte = 0; spalte < y; spalte++) {
				bild[zeile][spalte] = Integer.parseInt(inputs[spalte]);
			}
		}
		myBufferedReader.close();
		bild = getObjectsInPicture(bild);
		return bild;
	}

	public static int[][] getObjectsInPicture(int[][] schwarzWeissBild) {
		int colorCount = 2; // Nummer der Farbe
		boolean isColered = true; //ist Fläche farbig?
		boolean einsGefunden = true;

		// wiederholen, bis auf eine Null gestoßen wird -> dann colorCount erhöhen
		while (einsGefunden) {
			einsGefunden = false;
			for (int i = 0; isColered && i < schwarzWeissBild.length; i++) {
				for (int j = 0; isColered && j < schwarzWeissBild[i].length; j++) {
					if (schwarzWeissBild[i][j] == 1) {
						schwarzWeissBild[i][j] = colorCount;
						isColered = false; //Fläche ist nicht weiß, sondern schwarz, somit nicht farbig
						einsGefunden = true;
					}
				}
			}
			isColered = true;

			// solange es noch Werte=colorCount gibt wiederholen
			while (isColered) {
				isColered = false;// sucht schwarze Pixel (1)
				for (int zeile = 0; zeile < schwarzWeissBild.length; zeile++) {
					for (int spalte = 0; spalte < schwarzWeissBild[zeile].length; spalte++) {
						if (schwarzWeissBild[zeile][spalte] == 1) {

							// übernimmt darüber stehenden farbigen Wert, falls dort einer sein kann
							// > 1 für weder schwarz, noch weiß -> Farbe
							if (zeile > 0 && spalte < schwarzWeissBild[zeile - 1].length
									&& schwarzWeissBild[zeile - 1][spalte] > 1) {
								schwarzWeissBild[zeile][spalte] = schwarzWeissBild[zeile - 1][spalte];
								isColered = true;
							} else
							// übernimmt darunter stehenden farbigen Wert, falls dort einer sein kann
							if (zeile < schwarzWeissBild.length - 1 && spalte < schwarzWeissBild[zeile + 1].length
									&& schwarzWeissBild[zeile + 1][spalte] > 1) {
								schwarzWeissBild[zeile][spalte] = schwarzWeissBild[zeile + 1][spalte];
								isColered = true;
							} else
							// übernimmt links stehenden farbigen Wert, falls dort einer sein kann
							if (spalte > 0 && schwarzWeissBild[zeile][spalte - 1] > 1) {
								schwarzWeissBild[zeile][spalte] = schwarzWeissBild[zeile][spalte - 1];
								isColered = true;
							} else
							// übernimmt rechts stehenden farbigen Wert, falls dort einer sein kann
							if (spalte < schwarzWeissBild[zeile].length - 1
									&& schwarzWeissBild[zeile][spalte + 1] > 1) {
								schwarzWeissBild[zeile][spalte] = schwarzWeissBild[zeile][spalte + 1];
								isColered = true;
							}

						}
					}
				}
			}
			colorCount++;  //nächste Farbe gewählt
			isColered = true;
		}

		return schwarzWeissBild;
	}
}
