public final class Overloadingg{
    private Overloadingg () {}


    private static int max(int a, int b){
        return a > b? a : b;
    }

    private static int max(int a, int b, int c){
        return max(a, max(b, c));
    }

    private static double max(double a, double b){
       return a > b? a : b;
    }

    public static void main(StringTest[] args){

       System.out.println( max(10, 20));
       System.out.println( max(10, 20, 30));
       System.out.println(max(3.23, 32.1));
    }
}
