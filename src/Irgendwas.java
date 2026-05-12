import java.util.Scanner;
public final class Irgendwas{
    private Irgendwas() {}

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(StringTest[] args){

        System.out.println("Gib ne Zahl ein:");

        int x = EINGABE.nextInt();

        if(x < 0) {
            System.out.println("Die Zahl ist kleiner 0");
            return;
        }
       System.out.println("Baba 1");

        if(x < -2) {
            System.out.println("Die Zahl ist kleiner -2");
            return;
        }
        System.out.println("Baba 2");


    }

}
