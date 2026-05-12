package binaeresuche;

public class Aufgabe3 {

    public static void test() {
// zählt einfach wie oft Array etwas speichert (Zuweisung)
        // Zählt wie oft etwas im Array vergliechen Wird also Anzahl Vergleiche
        System.out.println("----------------------------------------------------------");
        System.out.println("Test für Aufgabe 3: Messung");
        System.out.println("----------------------------------------------------------");

        BinaereSuche liste = new BinaereSuche(10);

        liste.insert(5);
        liste.insert(2);
        liste.insert(8);
        liste.insert(1);
        liste.insert(4);

        System.out.println("Array nach dem Einfügen:");
        liste.print();

        liste.search(4);
        liste.search(7);

        liste.remove(2);

        System.out.println("Array nach dem Löschen:");
        liste.print();

        System.out.println();
        liste.printMessung();

        System.out.println("----------------------------------------------------------");
    }
}
