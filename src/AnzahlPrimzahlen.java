public class AnzahlPrimzahlen {

    public static void main(String[] args) {

        int anfang = 1;
        int ende = 10000;
        int anzahlDerPrimzahlen = 0;

        while (anfang < ende) {

            anzahlDerPrimzahlen = ermittelteAnzahlPrimzahlen(anfang, anfang + 999);
            System.out.println("Zwischen " + anfang + " und " + (anfang + 999) + " befinden sich "
                    + anzahlDerPrimzahlen + " Primzahlen.");
            anfang = anfang + 1000;
        }

    }

    public static int ermittelteAnzahlPrimzahlen(int von, int bis) {

        boolean pruefung = true;
        int anzahl = 0;

        while (von < bis) {
            pruefung = isPrimzahl(von);
            if (pruefung == true) {
                anzahl++;
            }
            von++;
        }
        return anzahl;

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
