import java.util.Scanner;

public final class Thrownew{
    private Thrownew() {}
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        if (in.hasNext() && !in.hasNextInt()){
            throw new IllegalArgumentException("Yallah nur Zahlen eingeben");
        }
int a = in.nextInt();
        int b = a * 2;
        System.out.println(b);
    }
}
