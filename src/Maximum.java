public final class Maximum {
    private Maximum() {}


private static int max(int m, int n){
        return m > n ? m:n;
}
    public static void main(StringTest[] args){
if(args.length == 0) {
    System.err.println("Aufruf: java max Zahl");
    System.exit(1);
}
    int m = Integer.parseInt(args[0]);

    for (int i = 1; i < args.length; ++i){
        int n = Integer.parseInt(args[i]);
        m = max(m, n);
    }

System.out.printf("Maximum %d%n", m);

    }
}
