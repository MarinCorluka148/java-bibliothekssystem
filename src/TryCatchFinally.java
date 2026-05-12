import java.util.Scanner;
import java.util.NoSuchElementException;

public final class TryCatchFinally{
    private TryCatchFinally() {}

    private static final Scanner EINGABE = new Scanner(System.in);

    /*
    Try Catch Finally: try wird immer ausgeführt und wenn es nicht geht dann wird
    catch ausgeführt. Finally wird immer ausgeführt egal ob try oder catch ausgeführt wird.
    Zudem return beendet normalerweoise die Methode aber bei try catch wird trotzdem noch catch
    ausgeführt.
     */

    public static void main (StringTest[] args){

        try{
            int n = EINGABE.nextInt();
            if(n < 0){
                System.out.println(1);
                return;
            }
            System.out.println(2);
        } catch (NoSuchElementException x) {
            if(!EINGABE.hasNext()){
                System.out.println(3);
            }
            System.out.println(4);
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

}
