package Maximumpackage;

public final class MaximumAnwendung{
    private MaximumAnwendung() {}


    public static void main(String[] args){

        if(args.length == 0){
            System.err.println("Aufruf: java maximum Zahl...");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; ++i){
            int b = Integer.parseInt(args[i]);
            a = Maximum.max(a,b);
        }

        System.out.printf("Maximum ist: %d%n", a);
    }
}
