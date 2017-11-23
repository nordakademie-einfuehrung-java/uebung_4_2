package uebung_4_2;

public class Primzahlberechnen {


public static void main (String[] args) {
	
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
}







