package notenverwaltung;

public final class NotenSchnitt {
    public NotenSchnitt() {
    }

    double[] array = Noten.leseNote();
    int anzahlNoten = 0;
    public double durschnitt() {


        double summe = 0;
        double durchnittt = 0;

        for (double n : array) {
            if (n != 0.0) {
                summe = summe + n;
                anzahlNoten ++ ;
            }
        }
        return summe / anzahlNoten;
    }

public double besteNote(){
        for(int j = 0; j < anzahlNoten - 1; j++) {
            for (int i = 0; i < anzahlNoten - 1; i++) {
                if (array[i + 1] < array[i]) {

                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
       return array[0];
}


}