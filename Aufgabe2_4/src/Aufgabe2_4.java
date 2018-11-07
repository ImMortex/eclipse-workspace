import java.util.Scanner;

public class Aufgabe2_4 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		long memoryNanoseconds;
		System.out.print("Eingabe Nanosekunden: ");
		memoryNanoseconds = myScanner.nextLong();

		long nanoseconds = memoryNanoseconds % 1000000;
		long memoryMilliseconds = memoryNanoseconds / 1000000;

		long milliseconds = memoryMilliseconds % 1000;
		System.out.println("Ausgabe in Millisekunden:   " + memoryMilliseconds + "    Rest Nanosekunden: " + nanoseconds);
		long memorySeconds = memoryMilliseconds / 1000;

		long seconds = memorySeconds % 60;
		System.out.println(
				"Ausgabe in Sekunden: 	   " + memorySeconds + "." + milliseconds + "    Rest Nanosekunden: " + nanoseconds);
		long memoryMinutes = memorySeconds / 60;

		long minutes = memoryMinutes % 60;
		System.out.println("Ausgabe in Minuten: 	  " + memoryMinutes + ":" + seconds + "." + milliseconds
				+ "    Rest Nanosekunden: " + nanoseconds);
		long memoryHours = memoryMinutes / 60;

		long hours = memoryHours % 24;
		System.out.println("Ausgabe in Stunden: 	 " + memoryHours + ":" + minutes + ":" + seconds + "." + milliseconds
				+ "    Rest Nanosekunden: " + nanoseconds);
		long days = memoryHours / 24;

		System.out.println("Ausgabe in Tagen: 	" + days + " " + hours + ":" + minutes + ":" + seconds + "."
				+ milliseconds + "    Rest Nanosekunden: " + nanoseconds);

		myScanner.close();
	}
}