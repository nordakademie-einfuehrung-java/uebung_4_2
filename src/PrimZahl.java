
public class PrimZahl {

	public static void main(String[] args) {

		int testzahl = 2;
		boolean pruefung1;
		pruefung1 = isPrimzahl(testzahl);

		if (pruefung1==true) {
			System.out.println("Die Zahl ist eine Primzahl!");
		} else {
			System.out.println("Die Zahl ist keine Primzahl!");
		}

	}

	public static boolean isPrimzahl(int testzahl) {
		boolean pruefung;
		int zahl = 2;

		while (zahl < testzahl) {
			zahl++;

			if (testzahl == 1) {
				pruefung = false;
			}

			if (testzahl % zahl == 0) {
				pruefung = false;
			} else {
				pruefung = true;
			}

			return (pruefung);
		}
	}
}
