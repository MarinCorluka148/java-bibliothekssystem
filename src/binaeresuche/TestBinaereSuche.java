package binaeresuche;

public class TestBinaereSuche {

    public static void main(String[] args) {
//----------------------------------------------------------test für Aufgabe 1
        // Objekt erstellen (maximal 10 Zahlen)
        BinaereSuche liste = new BinaereSuche(10);

        // Zahlen einfügen
        liste.insert(5);
        liste.insert(2);
        liste.insert(8);
        liste.insert(1);
        liste.insert(4);

        // Array ausgeben
        System.out.println("Array nach dem Einfügen:");
        liste.print();

        // Zahl suchen
        System.out.println();
        System.out.println("Suche nach Zahlen:");

        System.out.println("Index von 4: " + liste.search(4));
        System.out.println("Index von 7: " + liste.search(7));

        // Prüfen ob sortiert
        System.out.println();
        System.out.println("Ist das Array sortiert?");
        System.out.println(liste.check());

        // Zahl löschen
        System.out.println();
        System.out.println("Lösche die Zahl 2:");

        liste.remove(2);
        liste.print();

        // Noch einmal prüfen
        System.out.println();
        System.out.println("Ist das Array noch sortiert?");
        System.out.println(liste.check());
        //---------------------------------------------------------------------------------------
        //---------------------------------------------------------- test für Aufgabe 2

        Aufgabe2.test();

        //----------------------------------------------------------


        //---------------------------------------------------------- test für Aufgabe 3

        Aufgabe3.test();

        //----------------------------------------------------------


        //---------------------------------------------------------- test für Aufgabe 4

        Aufgabe4.test();

        //----------------------------------------------------------

        //---------------------------------------------------------- test für Aufgabe 5

        Aufgabe5.test();

//----------------------------------------------------------
    }


}