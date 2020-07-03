package packageVersuch.nr1;

import java.io.*;

public class Aufgabe10_3 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("quad.ein.txt");
	    BufferedReader br = new BufferedReader(fr);
	    
	    FileWriter fw = new FileWriter("quad.aus.txt");
	    BufferedWriter bw = new BufferedWriter(fw);
	    
	    String zeile1 = br.readLine();
	    String eins = zeile1.substring(0, zeile1.indexOf(" "));
	    String zwei = zeile1.substring(zeile1.indexOf(" "+1));
	    
	    int[] ergebnisse= ZweiFelderZsmRechnen(eins, zwei);
	    
	    //Fertig
	}
	
	public static int[] ZweiFelderZsmRechnen(String eins, String zwei) {
		int[] Ausgabe = new int[3];
		int[][] feld = fülleFeld(32, eins);
		int[][] feld2 = fülleFeld(32, zwei);
		int count=0;

		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 32; j++) {
				if (feld[i][j] == 1) {
					count++;
				}
			}
		}
		Ausgabe[0]=count;
		count=0;
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 32; j++) {
				if (feld2[i][j] == 1) {
					feld[i][j] = 1;
					count++;
				}
			}
		}
		Ausgabe[1]=count;
		count=0;
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 32; j++) {
				if (feld[i][j] == 1) {
					count++;
				}
			}
		}
		Ausgabe[2]=count;
		
		return Ausgabe;
	}

	public static int[][] fülleFeld(int Wert, String eingabe) {
		int[][] Ausgabe = new int[Wert][Wert];
		if (eingabe.contentEquals("b")) {
			for (int i = 0; i < Wert; i++) {
				for (int j = 0; j < Wert; j++) {
					Ausgabe[i][j] = 1;
				}
			}
		}
		if (eingabe.charAt(0) == 'f') {
			int index = 1;
			int count = 1;
			String eins = "";
			String zwei = "";
			String drei = "";
			String vier = "";

			while (count > 0) {
				if (eingabe.charAt(index) == 'f') {
					eins = eins + eingabe.charAt(index);
					index++;
					count += 3;
				} else {
					eins = eins + eingabe.charAt(index);
					index++;
					count--;
				}
			}
			count = 1;
			while (count > 0) {
				if (eingabe.charAt(index) == 'f') {
					zwei = zwei + eingabe.charAt(index);
					index++;
					count += 3;
				} else {
					zwei = zwei + eingabe.charAt(index);
					index++;
					count--;
				}
			}
			count = 1;

			while (count > 0) {
				if (eingabe.charAt(index) == 'f') {
					drei = drei + eingabe.charAt(index);
					index++;
					count += 3;
				} else {
					drei = drei + eingabe.charAt(index);
					index++;
					count--;
				}
			}
			count = 1;
			while (count > 0) {
				if (eingabe.charAt(index) == 'f') {
					vier = vier + eingabe.charAt(index);
					index++;
					count += 3;
				} else {
					vier = vier + eingabe.charAt(index);
					index++;
					count--;
				}
			}
			int feldeins[][] = fülleFeld(Wert / 2, eins);
			int feldzwei[][] = fülleFeld(Wert / 2, zwei);
			int felddrei[][] = fülleFeld(Wert / 2, drei);
			int feldvier[][] = fülleFeld(Wert / 2, vier);

			for (int i = 0; i < Wert / 2; i++) {
				for (int j = 0; j < Wert / 2; j++) {
					Ausgabe[i][j + (Wert / 2)] = feldeins[i][j];
					Ausgabe[i][j] = feldzwei[i][j];
					Ausgabe[i + (Wert / 2)][j] = felddrei[i][j];
					Ausgabe[i + (Wert / 2)][j + (Wert / 2)] = feldvier[i][j];
				}
			}
		}
		return Ausgabe;
	}

}
