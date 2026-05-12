public final class ObjectInt{
    private ObjectInt() {}

public static void main(String[] args){
        Beispiel x = new Beispiel();
        Beispiel y = new Beispiel(4);

        System.out.printf("%d%d%d%d%n",x.a, x.b, x.c, x.d);
        System.out.printf("%d%d%d%d", y.a, y.b, y.c, y.d);
}
}

final class Beispiel{
    int a; // implizit a = 0...
    int b = a +1;
    int c;
    int d;

    {
        c = b +1;
    }

    public Beispiel () {
        d = c +1;
    }

    public Beispiel(int e){
        a = e;
        d = a +1;
    }
}
