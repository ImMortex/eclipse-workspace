//Namen: Christian Gurski [4067886], Florian Ryll [4068296]

package P1L2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1L2A05B {

	@Test
	void testIsAllowedDimensions1() {
		assertTrue(P1L2A05C.isAllowedDimensions(1) == false);
	}

	@Test
	void testIsAllowedDimensions2() {
		assertTrue(P1L2A05C.isAllowedDimensions(2) == true);
	}

	@Test
	void testIsAllowedDimensions3() {
		assertTrue(P1L2A05C.isAllowedDimensions(8000) == false);
	}

	@Test
	void testIsAllowedDimensions8() {
		assertTrue(P1L2A05C.isAllowedDimensions(8) == true);
	}

	@Test
	void testIsAllowedDimensions32() {
		assertTrue(P1L2A05C.isAllowedDimensions(32) == true);
	}

	@Test
	void testCreateMemoryKeineSingle1Mal2() {

		int height = 1;
		int width = 2;

		// testet 10 zufällige erstellte Spiele als Stichprobe
		for (int testDurchlauf = 0; testDurchlauf < 10; testDurchlauf++) {
			int[][] memory = P1L2A05C.createMemory(height, width);
			keineSingle(height, width, memory);
		}
	}
	
	@Test
	void testCreateMemoryKeineSingle11Mal22() {

		int height = 11;
		int width = 22;

		// testet 10 zufällige erstellte Spiele als Stichprobe
		for (int testDurchlauf = 0; testDurchlauf < 10; testDurchlauf++) {
			int[][] memory = P1L2A05C.createMemory(height, width);
			keineSingle(height, width, memory);
		}
	}
		
	@Test
	void testCreateMemoryKeineSingle2Mal4() {

		int height = 2;
		int width = 4;

		// testet 10 zufällige erstellte Spiele als Stichprobe
		for (int testDurchlauf = 0; testDurchlauf < 10; testDurchlauf++) {
			int[][] memory = P1L2A05C.createMemory(height, width);
			keineSingle(height, width, memory);
		}
	}

	@Test
	void testCreateMemoryKeineInvalidenKarten20Mal40() {

		int height = 20;
		int width = 40;

		int[][] memory = P1L2A05C.createMemory(height, width);

		System.out.println("testCreateMemoryKeineInvalidenKarten20Mal40");
		keineInvalidenKarten(height, width, memory);
		System.out.println("");
	}
	
	
	@Test
	void testCreateMemoryKeineInvalidenKarten2Mal4() {

		int height = 2;
		int width = 4;

		int[][] memory = P1L2A05C.createMemory(height, width);

		System.out.println("testCreateMemoryKeineInvalidenKarten2Mal4");
		keineInvalidenKarten(height, width, memory);
		System.out.println("");
	}

	public void keineInvalidenKarten(int height, int width, int[][] memory) {
		// Ausgabe des Arrays		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.print(memory[y][x] + " ");
			}
			System.out.print("\n");
		}
		// Test auf invalide Werte beim Erstellen des Spielfelds
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				assertFalse((memory[y][x] <= 0 || memory[y][x] > 999));
			}
		}
	}

	public void keineSingle(int height, int width, int[][] memory) {
//Diese Testfunktion testet, ob jede Karte einen Partner hat

		// geht alle paare durch
		for (int paar = 1; paar < 999; paar++) {

			int karte1 = 0;
			boolean karte1Gefunden = false;
			boolean karte2Gefunden = false;
			int currentX = 0;
			int currentY = 0;

			// Sucht eine vorhandene Karte1
			for (int y = 0; y < height && karte1 == 0; y++) {
				currentY = y;
				for (int x = 0; x < width && karte1 == 0; x++) {
					currentX = x;
					if (memory[y][x] == paar) {
						karte1 = paar;
						karte1Gefunden = true;
					}
				}
			}
			if (karte1Gefunden) {
				assertFalse(currentX == width - 1 && currentY == height - 1,
						"Nach Karte1 kann es keine Karte 2 mehr geben");
				for (int y = 0; y < height && !karte2Gefunden; y++) {
					for (int x = 0; x < width && !karte2Gefunden; x++) {
						if ((x != currentX || y != currentY) && memory[y][x] == karte1) {
							karte2Gefunden = true;
							// Paar gefunden, nächstes Paar wird anschließend geprüft
						}
					}
				}
				assertFalse(!karte2Gefunden, "Für eine Karte1 gibt es keinen Partner");
			}
			// Karte1 nicht gefunden, nächstes Paar wird anschließend geprüft
		}

	}
	

	@Test
	void testUpdatePlaygroundÄnderung() {
		int[][] feld1 = { { 1, 1, 50, 77 }, { 77, 50, 3, 3 } };		
		int[][] feld2 = { { 1, 1, 50, 77 }, { 77, 50, 3, 3 } };		
		assertFalse(java.util.Arrays.deepEquals(P1L2A05C.updatePlayground(feld1, 0, 0, 0, 1),feld2));	
	}
	@Test
	void testUpdatePlaygroundkeineÄnderung() {
		int[][] feld1 = { { 1, 1, 50, 77 }, { 77, 50, 3, 3 } };	
		int[][] feld2 = { { 1, 1, 50, 77 }, { 77, 50, 3, 3 } };		
		assertTrue(java.util.Arrays.deepEquals(P1L2A05C.updatePlayground(feld1, 0, 0, 0, 2),feld2));	
	}
	@Test
	void testUpdatePlaygroundÄnderungAnwenden() {
		int[][] feld1 = { { 1, 1, 50, 77 }, { 77, 50, 3, 3 } };
		int[][] feld2= { { -1, -1, 50, 77 }, { 77, 50, 3, 3 } };
		assertTrue(java.util.Arrays.deepEquals(P1L2A05C.updatePlayground(feld1, 0, 0, 0, 1),feld2));
	}
	@Test
	void testUpdatePlaygroundÄnderungBeiSchonGeändertem() {
		int[][] feld2= { { -1, -1, 50, 77 }, { 77, 50, 3, 3 } };
		int[][] feld3= { { -1, -1, 50, -77 }, { -77, 50, 3, 3 } };
		assertTrue(java.util.Arrays.deepEquals(P1L2A05C.updatePlayground(feld2, 0, 3, 1, 0),feld3));
	}
	@Test
	void testUpdatePlaygroundKeineÄnderungBeiSchonUmgedrehten() {
		int[][] feld3= { { -1, -1, 50, -77 }, { -77, 50, 3, 3 } };
		int[][] feld4= { { -1, -1, 50, -77 }, { -77, 50, 3, 3 } };
		assertTrue(java.util.Arrays.deepEquals(P1L2A05C.updatePlayground(feld3, 0, 0, 1, 0),feld4));
	}
	@Test
	void getPlaygroundAsStringEinfacheAusgabe()
	{
		int[][] feld1 = {{906, 298, 600, 906},{	254, 298, 254, 600}}; 
		String ausgabe="XXX XXX XXX XXX\n\nXXX XXX XXX XXX\n";
		
		assertTrue(ausgabe.equals(P1L2A05C.getPlaygroundAsString(feld1)));
	}
	@Test
	void getPlaygroundAsStringMitNegativenWertenOhneLeerzeichen()
	{
		int[][] feld1 = {{906, -298, 600, 906},{	254, -298, 254, 600}}; 
		String ausgabe="XXX 298 XXX XXX\n\nXXX 298 XXX XXX\n";
		
		assertTrue(ausgabe.equals(P1L2A05C.getPlaygroundAsString(feld1)));
	}
	@Test
	void getPlaygroundAsStringMitNegativenVerschiedenenWertenOhneLeerzeichen()
	{
		int[][] feld1 = {{906, -298, -600, 906},{	254, 298, 254, 600}}; 
		String ausgabe="XXX 298 600 XXX\n\nXXX XXX XXX XXX\n";
		
		assertTrue(ausgabe.equals(P1L2A05C.getPlaygroundAsString(feld1)));
	}
	@Test
	void getPlaygroundAsStringMitNegativenVerschiedenenWertenMitLeerzeichen()
	{
		int[][] feld1 = {{906, -28, -6, 906},{	254, 28, 254, 6}}; 
		String ausgabe="XXX  28   6 XXX\n\nXXX XXX XXX XXX\n";
		
		assertTrue(ausgabe.equals(P1L2A05C.getPlaygroundAsString(feld1)));
	}
	@Test
	void getPlaygroundAsStringKomplettesFeld()
	{
		int[][] feld1 = {{-906, -28, -6, -906},{-254, -28, -254, -6}}; 
		String ausgabe="906  28   6 906\n\n254  28 254   6\n";
		
		assertTrue(ausgabe.equals(P1L2A05C.getPlaygroundAsString(feld1)));
	}
}
