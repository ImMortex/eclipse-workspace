import java.util.Scanner;

public class Aufgabe3_6 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Eingabe Bytes: ");
		double bytes = myScanner.nextDouble();
		double kb = 0;
		double kib = 0;
		double mb = 0;
		double mib = 0;
		double gb = 0;
		double gib = 0;
		double tb = 0;
		double tib = 0;
		double pb = 0;
		double pib = 0;
		double zahlen[] = new double[5];
		zahlen[0] = Math.pow(10, 3);
		zahlen[1] = Math.pow(10, 6);
		zahlen[2] = Math.pow(10, 9);
		zahlen[3] = Math.pow(10, 12);
		zahlen[4] = Math.pow(10, 15);

		// %.3f ist ein Platzhalter für eine Gleitkommazahl auf 3 Nachkommastellen
		// gerundet
		System.out.printf("Bytes: %.0f B\n", bytes);

		kb = bytes / 1000.0;
		kib = bytes / 1024.0;
		mb = kb / 1000.0;
		mib = kib / 1024.0;
		gb = mb / 1000.0;
		gib = mib / 1024.0;
		tb = gb / 1000.0;
		tib = gib / 1024.0;
		pb = tb / 1000.0;
		pib = tib / 1024.0;

		if (bytes <= 0) {
			System.out.println("Falsche Eingabe");
		} else if (bytes >= zahlen[4]) {
			System.out.printf("Dezimalpräfix: %.3f PB\n", pb);
			System.out.printf("Binärpräfix: %.3f PiB\n", pib);

		} else if (bytes >= zahlen[3]) {
			System.out.printf("Dezimalpräfix: %.3f TB\n", tb);
			System.out.printf("Binärpräfix: %.3f TB\n", tib);

		} else if (bytes >= zahlen[2]) {
			System.out.printf("Dezimalpräfix: %.3f GB\n", gb);
			System.out.printf("Binärpräfix: %.3f GiB\n", gib);

		} else if (bytes >= zahlen[1]) {
			System.out.printf("Dezimalpräfix: %.3f MB\n", mb);
			System.out.printf("Binärpräfix: %.3f MiB\n", mib);

		} else {
			System.out.printf("Dezimalpräfix: %.3f KB\n", kb);
			System.out.printf("Binärpräfix: %.3f KiB\n", kib);
		}

	}
}
