
public class Primzahl {

	public static boolean istPrimzahl(int testzahl) {
		
		int i = 2;
				
		
		while (i < (testzahl - 1)) {
			if (testzahl % i != 0) {
				i++;
			} else {
				return false;
			}
		}
		
		return true;
					
	}
	
	public static void mengePrimzahlen(int von, int bis) {
		
		int mz = 0;
		
		for (int i = von; i <= bis; i++) {
			if (istPrimzahl(i) == true) {
				mz++;
			}
		}
		
		double mzd = mz;
		double prozent = mzd / (bis - von) * 100;
		
		System.out.println("Es wurden " + mz + " Primzahlen in dem Block von " + von + " bis " + bis + " gefunden.");
		// System.out.println("Dies sind " + prozent + " %");
		
		return;
		
	}
	
	public static void main(String[] args) {
		
		int mz = 0;

/*
		if (istPrimzahl(29) == true) {
			System.out.println("Jo, ist Primzahl");
		} else {
			System.out.println("Nope");
		}
		

		
		for (int i = 2; i < 10000; i++) {
			if (istPrimzahl(i) == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.print(" ...");
*/
		
		
		for (int i = 2; i <= 10000; i++) {
			if (istPrimzahl(i) == true) {
				System.out.println(i + " Primzahl");
			} else {
				System.out.println(i + " keine Primzahl");
			}
			
		}
		System.out.println("\n");
		
		
		for (int i = 2; i < 10000; i++) {
			if (istPrimzahl(i) == true) {
				mz++;
			}
		}
		
		double mzd = mz;
		double prozent = mzd / 10000 * 100;
		
		System.out.println("Es wurden " + mz + " Primzahlen gefunden.");
		System.out.println("Dies sind " + prozent + " % \n \n");
		
		for (int i = 1; i <= 10; i++) {
			switch (i) {
			case 1: mengePrimzahlen(1, 1000); break;
			case 2: mengePrimzahlen(1001, 2000); break;
			case 3: mengePrimzahlen(2001, 3000); break;
			case 4: mengePrimzahlen(3001, 4000); break;
			case 5: mengePrimzahlen(4001, 5000); break;
			case 6: mengePrimzahlen(5001, 6000); break;
			case 7: mengePrimzahlen(6001, 7000); break;
			case 8: mengePrimzahlen(7001, 8000); break;
			case 9: mengePrimzahlen(8001, 9000); break;
			case 10: mengePrimzahlen(9001, 10000); break;
			}
		}
				
		
	}

		
		

}
