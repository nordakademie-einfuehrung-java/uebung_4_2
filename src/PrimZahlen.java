public class PrimZahlen {

    public static void main(String[] args) {

        int testzahl = 2;
        boolean pruefung1 = true;
        double getesteteZahlen = 0;
        int primzahlen = 0;
        double primzahlen1 = 0;
        double anteil = 0;

        while (testzahl <= 10000) {
            getesteteZahlen++;

            pruefung1 = isPrimzahl(testzahl);

            if (pruefung1 == true) {
                System.out.println(testzahl + " ist eine Primzahl!");
                primzahlen++;
            }

            testzahl++;
        }

        primzahlen1 = primzahlen;

        anteil = primzahlen1 / getesteteZahlen * 100;

        System.out.println();
        System.out.println("Es wurden " + primzahlen + " gefunden, was einen Anteil von " + anteil + "% ausmacht.");

    }

    public static boolean isPrimzahl(int testzahl) {

        double testzahl1 = testzahl;
        double zahl = 2;
        boolean pruefung = true;

        while (zahl < testzahl1 && pruefung == true) {

            if (testzahl1 % zahl == 0) {
                pruefung = false;
            } else {
                pruefung = true;
            }
            zahl++;
        }
        return pruefung;
    }

}
