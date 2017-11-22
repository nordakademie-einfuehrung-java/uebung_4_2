package uebung_4_2;

public class Primzahlberechnen {

public static boolean isPrimzahl(int testzahl) {
		// TODO Auto-generated method stub
		boolean istPrimzahl;
		int k = 0;
		for (int n = testzahl-1; n > 2; n = n-1){
			
		if (testzahl % n == 0) {
				n = 2;
				k = 2;
			}
			
		}
		if (k == 2 ){
			istPrimzahl = false;
		} else{
			istPrimzahl = true;
		}
		System.out.println(istPrimzahl);
		
	return istPrimzahl;
	}


public static void main(String[] args) {

	isPrimzahl(7);
}

public static void zweibisZehntausend(String[] args) {
	int number = 10000;
	double numberd;
	numberd = number;
	int noprimzahl = 0;
	double counter = 0;
	
	for (int i = number; i >= 2; i = i - 1){
		for (int k = i - 1; k > 2; k = k - 1 ){
			noprimzahl= 0;
			if (i % k == 0){
				noprimzahl = 1;
				k = 2;
			}	
				
		}
		if (noprimzahl == 1){
			System.out.println( i + " = keine Primzahl");
		}
		if (noprimzahl == 0){
			System.out.println( i + " = Primzahl");
			counter = counter + 1;
		}
		}
		System.out.println("Primzahlen gesamt: " + counter);
		System.out.println("Primzahlenanteil von " + number + " (in %) = " + (numberd/counter));
	}

	
	
public static int ermittleAnzahlPrimzahlen (int von, int bis) {
	int rückgabewert = 0;
	int primzahl = 0;
	
	for (int i = bis; i > von; i = i - 1){
		for ( int c = i-1; c > 2; c = c - 1 ){
			primzahl = 0;
			if (i % c == 0){
				c = 2;
				primzahl = 1;
			}
		}
		if (primzahl == 0 ){
			rückgabewert = rückgabewert + 1;
			
		}
		
	}
	//System.out.println("Im Bereich von " + von + " bis " + bis +" gibt es " + rückgabewert + " Primzahlen.")
	return rückgabewert;
	
	
}
public static void berechneBlöcke (String[] args) {
	
	int zaehler = 1001;
	int primzahl = 1;
	int counter = 0;
	int start = 1;
	
	
	for (int i = 1; i <= 10; i = i + 1){
	counter = 0;
		for ( int z = zaehler; z >= start; z = z - 1){
			for (int k = z - 1; k > 1; k = k - 1){
				primzahl = 0;
				if ( z % k == 0 ){
				k = 2;
				primzahl = 1;
				}
			}
			if (primzahl == 0){
				counter = counter + 1;
			}
		}
		System.out.println("Im Bereich von " + start + " bis " + zaehler + " gibt es " + counter + " Primzahlen.");
		
		zaehler = zaehler + 1000;
		start = start + 1000;
		
	}
}

public static void main1(String[] args) {
	System.out.println(ermittleAnzahlPrimzahlen(0, 10));
	
}
}







