package binaeresuche;

public class BinaereSucheInterpolation {

    private int[] a;
    private int size;

    //-------------------------für die Aufgabe 3
    private int vergleiche;
    private int zuweisungen;
    //------------------------------------------------------------------

    public BinaereSucheInterpolation(int maxGroesse) {
        a = new int[maxGroesse];
        size = 0;
        //-----------------für die Aufgabe 3 / 5
        vergleiche = 0;
        zuweisungen = 0;
        //-----------------------------------
    }

    public boolean insert(int key) {
        if (size == a.length) {
            return false;
        }

        if (search(key) != -1) {
            return false;
        }

        int i = size - 1;

        while (i >= 0 && a[i] > key) {
            vergleiche++;
            a[i + 1] = a[i];
            zuweisungen++;
            i--;
        }

        a[i + 1] = key;
        zuweisungen++;
        size++;
        return true;
    }

    public boolean remove(int key) {
        int index = search(key);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
            zuweisungen++;
        }

        size--;
        return true;
    }

    // Aufgabe 4: Lineare Interpolation statt Mitte
    public int search(int key) {
        int links = 0;
        int rechts = size - 1;

        while (links <= rechts && key >= a[links] && key <= a[rechts]) {// existiert Suchbereich und Wertebereich
            vergleiche++;
            if (a[links] == a[rechts]) { //Sonderfall 0 wenn beide gleich, verboten teilen 0 zb [5]
                vergleiche++;
                if (a[links] == key) { // es gibt nur einen und den kann man ausgeben.
                    return links;
                } else {
                    return -1;
                }
            }

            int pos = links + (rechts - links) * (key - a[links]) / (a[rechts] - a[links]);
            //die wahrscheinliche Position (pos) abzuschätzen
            vergleiche++;
            if (a[pos] == key) {
                return pos;
            } else if (key < a[pos]) {
                vergleiche++;
                rechts = pos - 1;
            } else {
                links = pos + 1;
            }
        }

        return -1; // Zahl wurde nicht gefunden
    }

    public boolean check() {
        for (int i = 0; i < size - 1; i++) {
            vergleiche++;
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public void print() {
        System.out.print("[ ");

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("]");
    }

    public int getSize() {
        return size;
    }

    public int getValue(int index) {
        return a[index];
    }
    public void printMessung() {
        System.out.println("Vergleiche: " + vergleiche);
        System.out.println("Zuweisungen: " + zuweisungen);
    }

    public int getVergleiche() {
        return vergleiche;
    }

    public int getZuweisungen() {
        return zuweisungen;
    }

}
