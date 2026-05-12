public final class KlausurArray{
    private KlausurArray() {}

    public static void main(StringTest[] args){

        int [] Punkte = {12, 8, 10};

        for (int i = 0; i < Punkte.length; i ++){
            System.out.printf("Aufgabe %d: %d Punkte%n", i+1, Punkte[i]);
        }

    }
}
