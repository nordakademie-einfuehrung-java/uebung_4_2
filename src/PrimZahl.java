public class PrimZahl {

    public static void main(String[] args) {

        int testzahl = 71357;
        boolean pruefung1 = true;

        if (testzahl == 1) {
            System.out.println(testzahl + " ist keine Primzahl!");
        } else if (testzahl == 2) {
            System.out.println(testzahl + " ist eine Primzahl!");
        } else {

            pruefung1 = isPrimzahl(testzahl);

            if (pruefung1 == true) {
                System.out.println(testzahl + " ist eine Primzahl!");
            } else {
                System.out.println(testzahl + " ist keine Primzahl!");
            }
        }
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
