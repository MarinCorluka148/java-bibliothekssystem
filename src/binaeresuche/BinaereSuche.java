package binaeresuche;

import java.util.Random;

public class BinaereSuche {

    private int[] a;
    private int size;

    //-------------------------------------------------------für die Aufgabe 3
    private int vergleiche;
    private int zuweisungen;
    //------------------------------------------------------------------

    public BinaereSuche(int maxGroesse) {
        a = new int[maxGroesse];
        size = 0;
        //-----------------für die Aufgabe 3
        vergleiche = 0;
        zuweisungen = 0;
        //-----------------------------------
    }

    public boolean insert(int key) {
        if (size == a.length) {
            return false;
        }
        // prüft ob vorhanden
        if (search(key) != -1) {
            return false;
        }

        int i = size - 1;

        // größere Elemente nach rechts verschieben
        while (i >= 0 && a[i] > key) {
            vergleiche++;          // Vergleich mit Array-Element
            a[i + 1] = a[i];
            zuweisungen++;         // Zuweisung ins Array
            i--;
        }
        // die neue Zahl einfügen
        a[i + 1] = key;
        zuweisungen++;         // Zuweisung ins Array
        size++;
        return true;
    }

    public boolean remove(int key) {
        int index = search(key); // suche zuerst wo die Zahl steht(index).

        if (index == -1) {
            return false; // zahl nicht gefunden liefert false (-1)
        }

        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
            zuweisungen ++;
        }

        size--;
        return true;
    }

    public int search(int key) {
        int links = 0;
        int rechts = size - 1;

        while (links <= rechts) {
            int mitte = (links + rechts) / 2;
            vergleiche++;
            if (a[mitte] == key) {
                return mitte;
            } else if (key < a[mitte]) {
                vergleiche++;
                rechts = mitte - 1;
            } else {

                links = mitte + 1;
            }
        }

        return -1;
    }
    // schaut ob die Zahlen richtig sortiert sind
    public boolean check() {
        for (int i = 0; i < size - 1; i++) {
            vergleiche++;
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    //gibt Array zurück
    public void print() {
        System.out.print("[ ");

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("]");
    }

    //--------------------------für die Aufgabe 2
    //wie viele Zahlen aktuell wirklich im Array gespeichert sind
    public int getSize() {
        return size;
    }

    //welche Zahl an einem bestimmten Index steht
    public int getValue(int index) {
        return a[index];
    }
    //-----------------------------------------------

    //------------------------------------------für die Aufgabe 3
    public void printMessung() {
        System.out.println("Vergleiche: " + vergleiche);
        System.out.println("Zuweisungen: " + zuweisungen);
        //-----------------------------------------------------------

    }
    public int getVergleiche() {
        return vergleiche;
    }

    public int getZuweisungen() {
        return zuweisungen;
    }

}