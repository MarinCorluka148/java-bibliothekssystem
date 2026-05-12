package binaeresuche;

import java.util.Random;

public class Aufgabe2 {

    public static void test() {

        Random zufall = new Random();

        BinaereSuche liste = new BinaereSuche(100);

        System.out.println("----------------------------------------------------------");
        System.out.println("Test für Aufgabe 2");
        System.out.println("----------------------------------------------------------");

        // 1. Zufallszahlen zwischen 1 und 200 einfügen,
        // bis das Array 100 Zahlen enthält
        System.out.println("2.1 Zufallszahlen einfügen bis 100 Zahlen im Array sind");

        while (liste.getSize() < 100) {
            int zahl = zufall.nextInt(200) + 1;
            liste.insert(zahl);
        }

        liste.print();
        System.out.println("Anzahl im Array: " + liste.getSize());
        System.out.println("Array sortiert? " + liste.check());

        System.out.println();

        // 2. 100 Zufallszahlen zwischen 1 und 200 suchen
        // und prüfen, ob die Indizes richtig sind
        System.out.println("2.2 100 Zufallszahlen suchen und Index prüfen");

        for (int i = 0; i < 100; i++) {
            int zahl = zufall.nextInt(200) + 1;
            int index = liste.search(zahl);

            if (index == -1) {
                System.out.println(zahl + " nicht gefunden");
            } else {
                if (liste.getValue(index) == zahl) {
                    System.out.println(zahl + " gefunden bei Index " + index + " -> Index richtig");
                } else {
                    System.out.println(zahl + " gefunden bei Index " + index + " -> Index falsch");
                }
            }
        }

        System.out.println();

        // 3. Zufallszahlen zwischen 1 und 200 löschen,
        // bis nur noch 50 Zahlen im Array stehen
        System.out.println("2.3 Zufallszahlen löschen bis nur noch 50 Zahlen im Array sind");

        while (liste.getSize() > 50) {
            int zahl = zufall.nextInt(200) + 1;
            liste.remove(zahl);
        }

        liste.print();
        System.out.println("Anzahl im Array: " + liste.getSize());
        System.out.println("Array sortiert? " + liste.check());

        System.out.println("----------------------------------------------------------");
    }
}
