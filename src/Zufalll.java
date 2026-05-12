public final class Zufalll{
    private Zufalll () {}

    public static int [] ZUFALLARRAY;

    static {
        java.util.Random r = new java.util.Random();
        ZUFALLARRAY = new int [r.nextInt(10) + 1];
        for (int i = 0; i < ZUFALLARRAY.length; ++i){
            ZUFALLARRAY[i] = r.nextInt();
        }
    }

    public static void main(StringTest[] args) {
        for (int n : ZUFALLARRAY){
            System.out.println(n);
        }


    }
}
