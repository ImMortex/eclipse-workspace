import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Aufgabe7_4Test {

	@Test
	void testAlwaysTrue() {
		assertTrue(true);
	}

	@Test
	void testAlwaysFalse() {
		assertFalse(false);
	}

	@Test
	void testArraysEqual() {
		System.out.println("testArraysEqual");
		char[] array1 = { 1, 2, 3 };
		char[] array2 = { 1, 2, 3 };
		char[] array3 = {};
		char[] array4 = {};
		char[] array5 = { 'a' };
		char[] array6 = { 'b' };

		assertArrayEquals(array1, array2);
		assertArrayEquals(array3, array4);
		assertFalse(Arrays.equals(array1, array3));
		assertFalse(Arrays.equals(array5, array6));
	}

	@Test
	void testWorstCaseZahlen() {
		System.out.println("testWorstCaseZahlen");
		char[] liste1 = { '5', '4', '3', '2', '1' };
		char[] liste2 = { '9', '8', '7', '6' };
		char[] soll = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);

	}

	@Test
	void testBestCaseZahlen() {
		System.out.println("testBestCaseZahlen");
		char[] liste1 = { '1', '2', '3', '4', '5' };
		char[] liste2 = { '6', '7', '8', '9' };
		char[] soll = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);
	}

	@Test
	void testLeer() {
		System.out.println("testLeer");
		char[] liste1 = {};
		char[] liste2 = {};
		char[] soll = {,};
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);
	}

	@Test
	void testWorstCaseBuchstaben() {
		System.out.println("testWorstCaseBuchstaben");
		char[] liste1 = { 'e', 'd', 'c', 'b', 'A' };
		char[] liste2 = { 'k', 'j', 'i', 'h', 'g', 'f' };
		char[] soll = { 'A', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);
	}

	@Test
	void testBestCaseBuchstaben() {
		System.out.println("testBestCaseBuchstaben");
		char[] liste1 = { '1', 'B', 'c', 'd', 'e', 'f', 'g' };
		char[] liste2 = { 'h', 'i', 'j', 'k' };
		char[] soll = { '1', 'B', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);
	}

	@Test
	void testExtrem1() {
		System.out.println("testExtrem1");
		char[] liste1 = { '~', '1', 'a', 's', 'B', 'c', 'd', '|', 'e', 'f', 'g', '!', 'l', 'o', 't' };
		char[] liste2 = { 'h', 'i', 'j', 'k' };
		char[] soll = { '!', '1', 'B', 'a', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'o', 's', 't', '|', '~' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);
	}

	@Test
	void testExtrem2() {
		System.out.println("testExtrem2");
		char[] liste1 = { '~', '|', 't', 's', 'o', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c' };
		char[] liste2 = { 'a', 'B', '1', '!', '!', '1', 'B', 'a', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'o',
				's', 't', '|', '~' };
		char[] soll = { '!', '!', '1', '1', 'B', 'B', 'a', 'a', 'c', 'c', 'd', 'd', 'e', 'e', 'f', 'f', 'g', 'g', 'h',
				'h', 'i', 'i', 'j', 'j', 'k', 'k', 'l', 'l', 'o', 'o', 's', 's', 't', 't', '|', '|', '~', '~' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);
	}

	@Test
	void testGleicheZeichen() {
		System.out.println("testGleicheZeichen");
		char[] liste1 = { 'A', 'a' };
		char[] liste2 = { 'a', 'A' };
		char[] soll = { 'A', 'A', 'a', 'a' };
		char[] ist = Aufgabe7_4.erzeugeSortierteListe(liste1, liste2);
		assertArrayEquals(soll, ist);

	}

	@Test
	void testListenKonkatenieren() {
		System.out.println("testListenKonkatenieren");
		char[] liste1 = { 'e', 'd', 'c', 'b', 'A' };
		char[] liste2 = { 'k', 'j', 'i', 'h', 'g', 'f' };
		char[] soll = { 'e', 'd', 'c', 'b', 'A', 'k', 'j', 'i', 'h', 'g', 'f' };
		char[] ist = Aufgabe7_4.arraysKonkatenieren(liste1, liste2);
		assertArrayEquals(soll, ist);

	}

}
