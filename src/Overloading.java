public final class Overloading{
    private Overloading() {}

private static int max(int a, int b){
        return a > b? a:b;
}

private static int max(int a, int b, int c){
        return max(a, max(b,c));
}

private static double max(double a, double b){
        return a > b ? a : b;
}



    public static void main(StringTest[] args){

        System.out.println(max(1,2));
        System.out.println(max(1,2,3));
        System.out.println(max(1.2, 3.12));

    }
}
