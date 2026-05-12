import java.util.Scanner;
public final class Bubblesort{

    private Bubblesort() {}

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(StringTest[] args){
        //--------------------------------- Anzahl zu sortierenden Elementen
        int n;
        System.out.print("Anzahl zu sortierenden Werten eingeben");
        n = EINGABE.nextInt();
        //---------------------------------- Zahlen einlesen
        int [] a = new int [n];
        System.out.printf("%d ganze Zahlen eingeben: ", n);

        for (int i = 0; i < a.length; ++i) {
            a[i] = EINGABE.nextInt();
        }


        //------------------------------------------ Zahlen sortieren
        for (int i = a.length; i > 1; i --) {
            //groessten Wert nach hinten schieben
            for(int j = 0; j < i -1; ++j) {
                if (a[j] > a[j+1]){
                    //Wert tauschen
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }







        //-------------------- Zahlen ausgeben
        System.out.print("Sortierte Zahlenfolge");

        System.out.print("Sortierte Zahlenfolge: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d: ", a[i]);
        }
System.out.println();
    }
}
