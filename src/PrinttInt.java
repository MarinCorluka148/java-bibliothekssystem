public final class PrinttInt {
    private PrinttInt() {
    }

    public static void main(String[] args) {

        System.out.printf("%10d%n", 1);
        System.out.printf("%10d%n", 123);
        System.out.printf("%10d%n", 123456789);


        {
            int n = 1;
            System.out.printf("%10d%n", 123);
        }

        {
            int n = 123;
            System.out.printf("%10d%n", n);
        }

        {
            int n = 123456789;
            System.out.printf("%10d%n", n);
        }


        printInt(1);
        printInt(123);
        printInt(123456789);
    }



public static void printInt(int n){
        System.out.printf("%10d%n", n);
}
}