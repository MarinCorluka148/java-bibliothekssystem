package binaeresuche;

public class Aufgabe5 {

    public static void test() {

        System.out.println("----------------------------------------------------------");
        System.out.println("Test für Aufgabe 5");
        System.out.println("Vergleich: Binäre Suche vs Interpolation Search");
        System.out.println("----------------------------------------------------------");

        BinaereSuche binaer = new BinaereSuche(20);
        BinaereSucheInterpolation interpolation = new BinaereSucheInterpolation(20);

        int[] zahlen = {10, 10000, 30, 40, 50, 60, 70, 80, 90};

        for (int zahl : zahlen) {
            binaer.insert(zahl);
            interpolation.insert(zahl);
        }

        int[] suchwerte = {10, 30, 50, 80, 90, 25, 100, 100};

        for (int key : suchwerte) {
            int index1 = binaer.search(key);
            int index2 = interpolation.search(key);

            System.out.println("Suche nach: " + key);
            System.out.println("Binäre Suche: " + index1);
            System.out.println("Interpolation Search: " + index2);

            if (index1 == index2) {
                System.out.println("→ gleiches Ergebnis");
            } else {
                System.out.println("→ unterschiedliches Ergebnis");
            }

            System.out.println();
        }

        System.out.println("Messung:");

        System.out.println();
        System.out.println("Binäre Suche:");
        System.out.println("Vergleiche: " + binaer.getVergleiche());
        System.out.println("Zuweisungen: " + binaer.getZuweisungen());

        System.out.println();

        System.out.println("Interpolation Search:");
        System.out.println("Vergleiche: " + interpolation.getVergleiche());
        System.out.println("Zuweisungen: " + interpolation.getZuweisungen());

        System.out.println("----------------------------------------------------------");



    }
}
