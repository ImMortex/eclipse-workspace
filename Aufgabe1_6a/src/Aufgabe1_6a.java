
public class Aufgabe1_6a {

	public static void main(String[] args) {
		String meineZeichenkette = "cdabababdc";
		if (meineZeichenkette.length() < 5) {
			System.out.println(meineZeichenkette);
		}

		else if ((meineZeichenkette.length() > 4) && (meineZeichenkette.length() < 10)) {
			if (meineZeichenkette.charAt(0) == 'a') {
				System.out.println(meineZeichenkette.charAt(2));
			} else if (meineZeichenkette.startsWith("cd")) {
				System.out.println("cd");
			} else if (meineZeichenkette.startsWith("c")) {
				System.out.println(meineZeichenkette.charAt(meineZeichenkette.length() - 1));
			}
		} else

		{
			System.out.println(meineZeichenkette);
		}
	}
}
