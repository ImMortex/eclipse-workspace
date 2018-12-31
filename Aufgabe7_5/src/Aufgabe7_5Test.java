import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Aufgabe7_5Test {

	public void testEingabe(String order, String response) {
		System.out.println("Eingabe: " + order);
		assertTrue(Aufgabe7_5.getResponsesForTextCommand(order).equals(response));
		System.out.println("Response: " + Aufgabe7_5.getResponsesForTextCommand(order));
		System.out.println("");
	}

	@Test
	void testEnde() {
		testEingabe("ende", "Bis zum nächsten Mal.");
	}

	@Test
	void testSchauNach() {
		testEingabe("schau nach Norden", "Ich schaue nach Norden.");
		testEingabe("schau nach Süden", "Ich schaue nach Süden.");
		testEingabe("schau nach Westen", "Ich schaue nach Westen.");
		testEingabe("schau nach Osten", "Ich schaue nach Osten.");

	}

	@Test
	void testDreheNach() {
		testEingabe("drehe nach Norden", "Ich habe mich nach Norden gedreht.");
		testEingabe("drehe nach Süden", "Ich habe mich nach Süden gedreht.");
		testEingabe("drehe nach Westen", "Ich habe mich nach Westen gedreht.");
		testEingabe("drehe nach Osten", "Ich habe mich nach Osten gedreht.");
	}

	@Test
	void testStatus() {
		testEingabe("status", "Ich bin bei (x,y) und schaue nach nicht definiert.");
	}

	@Test
	void testOeffne() {
		testEingabe("öffne Kiste", "Ich habe in Kiste Goldstücke gefunden.");
		testEingabe("öffne Truhe", "Ich habe in Truhe Goldstücke gefunden.");
	}

	@Test
	void testBenutze() {
		testEingabe("benutze Schlüssel", "Etwas ist passiert.");
	}

	@Test
	void testUnbekanntesKommando() {
		String ausgabe = "Kommando nicht verstanden.";
		testEingabe("ende fa", ausgabe);
		testEingabe("status bla", ausgabe);
		testEingabe("irgend etwas falsches", ausgabe);
		testEingabe("schau nach Norden bla", ausgabe);
		testEingabe("drehe nach Osten blabla", ausgabe);
		testEingabe("drehe nach Westen drehe nach Westen", ausgabe);
		testEingabe("öffne Kiste bla", ausgabe);
		testEingabe("benutze Schwert blabla", ausgabe);
		testEingabe("", ausgabe);
		testEingabe("728346827352", ausgabe);
	}

	@Test
	void mehrereKommandos() {

		String[] soll = new String[4];
		soll[0] = "Ich schaue nach Norden.";
		soll[1] = "Ich habe in Kiste Goldstücke gefunden.";
		soll[2] = "Ich bin bei (x,y) und schaue nach nicht definiert.";
		soll[3] = "Bis zum nächsten Mal.";
		testMehrfachEingabe("schau nach Norden und öffne Kiste und status und ende", soll);

		soll = new String[3];
		soll[0] = "Ich schaue nach Norden.";
		soll[1] = "Ich habe in Kiste Goldstücke gefunden.";
		soll[2] = "Bis zum nächsten Mal.";
		testMehrfachEingabe("schau nach Norden und öffne Kiste und ende und status", soll);

		soll = new String[3];
		soll[0] = "Ich schaue nach Norden.";
		soll[1] = "Kommando nicht verstanden.";
		soll[2] = "Bis zum nächsten Mal.";
		testMehrfachEingabe("schau nach Norden und öffne Kiste schnell und ende und status", soll);
	}

	public void testMehrfachEingabe(String eingabe, String[] erwartung) {
		String[] istAusgabe = Aufgabe7_5.getResponsesForTextCommands(eingabe);
		for (int index = 0; index <= istAusgabe.length - 1; index++) {
			System.out.println(istAusgabe[index]);
		}
		Assertions.assertArrayEquals(erwartung, istAusgabe);

	}
}
