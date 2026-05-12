public final class PrintIntt{

    private PrintIntt () {}

    public static void main(StringTest[] args){

        System.out.printf("%10d%n", 1);
        System.out.printf("%10d%n", 123);
        System.out.printf("%10d%n", 123456789);

        int n = 1;
        System.out.printf("%10d%n", n);

        n = 123;
        System.out.printf("%10d%n", n);

        n = 123456789;
        System.out.printf("%10d%n", n);
        PrintInt(1);
        PrintInt(123);
        PrintInt(123456789);
    }
private static void PrintInt(int n) {
        System.out.printf("%10d%n", n);
}
}