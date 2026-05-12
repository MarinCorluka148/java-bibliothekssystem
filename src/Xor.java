import java.util.Scanner;
public final class Xor{
    private Xor () {}

    private static final Scanner EINGABE = new Scanner (System.in);

    public static void main (StringTest[] args) {
        int a = EINGABE.nextInt();
        int b = EINGABE.nextInt();

        System.out.println(a);
        System.out.println(b);

        a  = a^b;
        b = a ^b;
        a = a ^b;

        System.out.printf("%d %d%n", a, b);
        //java arbeitet im binär intern. Xor ist exklusive or das heißt nur dann 1 true wenn die Zeichen verscheiden sind zb immer nur wenn 1 und 0 und andersherum
    }
}
