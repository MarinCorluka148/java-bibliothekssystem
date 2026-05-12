package binaeresuche;

public class Aufgabe4 {

    public static void test() {

        System.out.println("----------------------------------------------------------");
        System.out.println("Test für Aufgabe 4: Lineare Interpolation");
        System.out.println("----------------------------------------------------------");

        BinaereSucheInterpolation liste = new BinaereSucheInterpolation(20);

        liste.insert(10);
        liste.insert(20);
        liste.insert(30);
        liste.insert(40);
        liste.insert(50);
        liste.insert(60);
        liste.insert(70);
        liste.insert(80);
        liste.insert(90);

        System.out.println("Array:");
        liste.print();

        System.out.println();

        System.out.println("Suche nach 80:");
        System.out.println("Index: " + liste.search(80));

        System.out.println();

        System.out.println("Suche nach 30:");
        System.out.println("Index: " + liste.search(30));

        System.out.println();

        System.out.println("Suche nach 25:");
        System.out.println("Index: " + liste.search(25));

        System.out.println();

        System.out.println("Array sortiert?");
        System.out.println(liste.check());

        System.out.println("----------------------------------------------------------");
    }
}
