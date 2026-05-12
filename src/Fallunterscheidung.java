import java.util.Scanner;
import java.util.NoSuchElementException;
public final class Fallunterscheidung{
    private Fallunterscheidung() {}


    private static final Scanner EINGABE = new Scanner(System.in);

    private enum Month {JAN, FEB, MAR, APR, MAI, JUN, JUL, AUG, SEP, OKT, NOV, DEZ};

    public static void main(StringTest[] args){
        System.out.print("Monat eingeben [ ");
        for(Month m: Month.values()){
            System.out.printf("%s ",m);
        }
        System.out.print(" ]");

        Month m = Month.valueOf(EINGABE.next());

        try{
            switch(m){
                case FEB:
                    System.out.println("28 oder 29 Tage");
                    break;

                case APR, JUN, SEP, NOV:
                    System.out.println("30 Tage");
                    break;
                default:
                    System.out.println("31 TAg");
            }
        } catch (NoSuchElementException x){
            System.err.println("Keine Eingabe");
        } catch (IllegalArgumentException x) {
            System.out.println("Fehler: kein Monat");
        }
    }
}
