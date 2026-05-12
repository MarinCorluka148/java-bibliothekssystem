import java.util.Scanner;
public final class IntSum {
    private IntSum() {}

    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main(StringTest[] args){
        int sum = 0;
        System.out.println("Ganze Zahlen Eingeben");

        while(EINGABE.hasNextInt()){
            sum = sum + EINGABE.nextInt();
        }
        System.out.printf("Summe: %d%n",sum);
    }
}
