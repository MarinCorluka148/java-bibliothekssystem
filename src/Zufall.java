public final class Zufall{
    private Zufall () {}

    private static final int[] ZUFALLSZAHLEN;

    static {
        java.util.Random r = new java.util.Random();
        ZUFALLSZAHLEN = new int [r.nextInt(10) + 1];
        for (int i = 0; i < ZUFALLSZAHLEN.length; ++i){
            ZUFALLSZAHLEN[i] = r.nextInt();
        }
    }

    public static void main(StringTest[] args){
        for(int n : ZUFALLSZAHLEN){
            System.out.println(n);
        }
    }
}
