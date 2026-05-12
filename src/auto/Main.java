package auto;

public final class Main{
    private Main() {}

    public static void main(String[] args){
        Auto auto = new Auto("BMW","fünfer", 1999, 250, 4);

        auto.fahren();
        auto.isSportwagen(4.4);
    }
}
