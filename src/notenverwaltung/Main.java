package notenverwaltung;

public class Main {

    private Main() {
    }

    public static void main(String[] args) {

        NotenSchnitt eins = new NotenSchnitt();
        System.out.printf("Durschnitt ist %f%n", eins.durschnitt());
        System.out.printf("Beste Note ist %f", eins.besteNote());

    }
}