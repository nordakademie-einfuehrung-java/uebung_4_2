package uebung_4_2;

public class Primzahlen {

	public static boolean primzahl(int testzahl) {

		for (int n = 2; n <= (testzahl - 1); n++) {
			if (testzahl % n == 0)

				return false;
		}
		System.out.println(testzahl);
		return true;
	}

	public static void main(String[] args) {

		int x = 10000;

		System.out.println("Anzahl  " + anzahlprimzahl(2, x));

		double y = x;
		double prozent = (anzahlprimzahl(2, x) / y) * 100;

		System.out.println("Prozentanteil " + prozent + "%");
	}

	public static int anzahlprimzahl(int von, int bis) {

		int anzahl = 0;

		for (int p = von; p <= bis; p++) {

			if (primzahl(p)) {
				anzahl = anzahl + 1;
			}
		}
		return anzahl;

	}
}
