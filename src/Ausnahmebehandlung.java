import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

public final class Ausnahmebehandlung{
    private Ausnahmebehandlung() {}

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(StringTest[] args){
        System.out.println("Einen Monat [1-12] eingeben");
        try {

            int month = EINGABE.nextInt();
            if(month < 1 || month > 12) {
                throw new Exception("Fehler: koi Monat");
            }

                switch(month) {
                    case 2:
                        System.out.println("28 oder 29 Tage");
                        break;
                    case 4, 6, 9, 11:
                        System.out.println("30 Tage");
                        break;
                    default:
                        System.out.println("31 Tag");
                }
            } catch(InputMismatchException x) {
                System.err.println("Fehler koi Zahl");
            } catch(NoSuchElementException x) {
                System.err.println("Koi Eingabe");
            } catch(Exception x){
                System.err.println(x.getMessage());
            } finally {
                EINGABE.close();
            }


    }
}