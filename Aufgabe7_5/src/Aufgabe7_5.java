import java.util.Scanner;

public class Aufgabe7_5 {

	public static void main(String[] args) {
		if (args.length == 0) {
			Scanner myScanner = new Scanner(System.in);
			String[] ausgabeArray = {};
			eingabe(myScanner, ausgabeArray);

		} else {
			getResponsesForTextCommand("ende");
			System.out.println("FEHLER: Es darf kein Parameter angegeben werden!");
		}
	}

	public static void eingabe(Scanner myScanner, String[] ausgabeArray) {
		System.out.println("Kommandos eingeben:");

		String eingabe = myScanner.nextLine();
		ausgabeArray = getResponsesForTextCommands(eingabe);
		for (int index = 0; index <= ausgabeArray.length-1; index++) {
			System.out.println(ausgabeArray[index]);
		}
		System.out.println("");
		if (!eingabe.contains("ende")) {
			eingabe(myScanner, ausgabeArray);
		}
		myScanner.close();

	}

	public static String[] getResponsesForTextCommands(String userInput) {
		String[] array = { "" };
		return rekursivArrayFuellen(userInput, array);

	}

	public static String[] rekursivArrayFuellen(String userInput, String[] array) {
		String connectionString = " und ";

		if (userInput.startsWith("ende")) {
			array = arrayUmElementErweitern(array, getResponsesForTextCommand("ende"));
			return array;
		}

		else if (!userInput.contains(connectionString) ) {
			array = arrayUmElementErweitern(array, getResponsesForTextCommand(userInput));
		}
		
		else {
			int position = userInput.indexOf(connectionString);
			String subCommand = userInput.substring(0, position);
			userInput = userInput.substring(position + connectionString.length());
			array = arrayUmElementErweitern(array, getResponsesForTextCommand(subCommand));

			array = rekursivArrayFuellen(userInput, array);
		}

		return array;
	}

	public static String[] arrayUmElementErweitern(String[] array, String neuesElement) {
		if (array.length == 1 && array[0].equals("")) {
			array[0] = neuesElement;
		}

		else {
			String[] zwischenSpeicherArray = new String[array.length];
			for (int index = 0; index <= array.length - 1; index++) {
				zwischenSpeicherArray[index] = array[index];
			}
			array = new String[array.length + 1];
			for (int index = 0; index <= zwischenSpeicherArray.length - 1; index++) {
				array[index] = zwischenSpeicherArray[index];
			}
			array[array.length - 1] = neuesElement;

		}
		return array;
	}

	public static String getResponsesForTextCommand(String command) {

		String response = "Kommando nicht verstanden.";

		String[] definedCommands = new String[6];

		definedCommands[0] = "ende";
		definedCommands[1] = "schau nach";
		definedCommands[2] = "drehe nach";
		definedCommands[3] = "status";
		definedCommands[4] = "öffne";
		definedCommands[5] = "benutze";

		if (command.equals(definedCommands[0])) {
			// command: "ende"
			response = "Bis zum nächsten Mal.";
		}

		else if (command.startsWith(definedCommands[1])) {
			// command: "schau nach"
			response = responseSchauNach(command, response, definedCommands);
		}

		else if (command.startsWith(definedCommands[2])) {
			// command: "drehe nach"
			response = responseDreheNach(command, response, definedCommands);
		}

		else if (command.equals(definedCommands[3])) {
			// command: "status"
			response = "Ich bin bei (x,y) und schaue nach nicht definiert.";
		}

		else if (command.startsWith(definedCommands[4])) {
			// command: "öffne"
			response = responseOeffne(command, response, definedCommands);
		}

		else if (command.startsWith(definedCommands[5])) {
			// command: "benutze"
			response = responseBenutze(command, response, definedCommands);

		} else {
			response = "Kommando nicht verstanden.";
		}

		return response;

	}

	public static String responseBenutze(String command, String response, String[] definedCommands) {
		int argumentBegin = definedCommands[5].length();
		int argumentEnd = getArgumentEnd(command, argumentBegin);
		Boolean validCommand = isValidCommand(command, argumentEnd);

		// String gegenstand = getArgumentName(command, definedCommands, 5,
		// argumentEnd);

		if (validCommand) {
			response = "Etwas ist passiert.";
		}
		return response;
	}

	public static String responseOeffne(String command, String response, String[] definedCommands) {
		int argumentBegin = definedCommands[4].length();
		int argumentEnd = getArgumentEnd(command, argumentBegin);
		Boolean validCommand = isValidCommand(command, argumentEnd);

		if (validCommand) {
			String behaelter = getArgumentName(command, definedCommands, 4, argumentEnd);

			response = "Ich habe in " + behaelter + " Goldstücke gefunden.";
		}
		return response;
	}

	public static String responseDreheNach(String command, String response, String[] definedCommands) {
		int argumentBegin = definedCommands[2].length();
		int argumentEnd = getArgumentEnd(command, argumentBegin);
		Boolean validCommand = isValidCommand(command, argumentEnd);

		if (validCommand) {

			String direction = getArgumentName(command, definedCommands, 2, argumentEnd);

			switch (direction) {
			case "Norden":
			case "Osten":
			case "Westen":
			case "Süden":
				response = "Ich habe mich nach " + direction + " gedreht.";
				break;
			}
		}
		return response;
	}

	public static String responseSchauNach(String command, String response, String[] definedCommands) {
		int argumentBegin = definedCommands[1].length();
		int argumentEnd = getArgumentEnd(command, argumentBegin);
		Boolean validCommand = isValidCommand(command, argumentEnd);

		if (validCommand) {

			String direction = getArgumentName(command, definedCommands, 1, argumentEnd);

			switch (direction) {
			case "Norden":
			case "Osten":
			case "Westen":
			case "Süden":
				response = "Ich schaue nach " + direction + ".";
				break;
			}
		}
		return response;
	}

	public static Boolean isValidCommand(String command, int argumentEnd) {
		return (argumentEnd == command.length());
	}

	public static int getArgumentEnd(String command, int argumentBegin) {
		int argumentEnd = 0;
		for (int index = argumentBegin + 1; index <= command.length() - 1 && command.charAt(index) != ' '; index++) {
			argumentEnd = index + 1;
		}
		return argumentEnd;
	}

	public static String getArgumentName(String command, String[] definedCommands, int index, int argumentEnd) {
		return command.substring(definedCommands[index].length() + 1, argumentEnd);
	}

}
