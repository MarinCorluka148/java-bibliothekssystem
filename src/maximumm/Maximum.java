package maximumm;

public final class Maximum{
    private Maximum() {}


    public static void main(String[] args){
        if(args.length == 0){
            System.err.println("Keine Eingabe");
            System.exit(1);
        }
        int m = Integer.parseInt(args[0]);

        for(int i = 0; i < args.length; i++){
            int n = Integer.parseInt(args[i]);
            m = MaximumMethode.max(m, n);
        }
        System.out.printf("Maximum ist: %d", m);
    }
}
