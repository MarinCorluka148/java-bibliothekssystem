package maximum;

public final class Main{
    private Main(){}

    public static void main(String[] args){

        if (args.length == 0){
            System.err.println("Yallah net gut");
            System.exit(1);
        }

        int m = Integer.parseInt(args[0]);

        for(int i = 1; i < args.length; i++){
            int n = Integer.parseInt(args[i]);
            m = Methode.max(m, n);
        }
        System.out.printf("Maximum ist: %d%n", m);
    }
}