package ausleihe;

import java.util.Objects;

public final class Film extends Medium {


    private double laenge;
    private int fsk;

    public Film(String titel, int erscheinungsjahr,
                boolean ausgeliehen,
                double laenge,
                int fsk) {

        super(titel, erscheinungsjahr, ausgeliehen);

        this.fsk = fsk;
        this.laenge = laenge;
    }

    // Getter

    public double getLaenge() {
        return laenge;
    }

    public int getFsk() {
        return fsk;
    }

    // Setter

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setFsk(int fsk) {
        this.fsk = fsk;
    }


    @Override
    public void ausleihen(){

        if (isAusgeliehen()){
            System.out.println("Der Film ist schon ausgeliehen!");
        } else {
            setAusgeliehen(true);
            System.out.println("Der Film wurde jetzt für Sie ausgeliehen!");
        }
    }

    @Override
    public void zurueckgeben() {

        if (!isAusgeliehen()) {
            System.out.println("Dieser Film muss erstmal ausgeliehen sein");
        } else {
            setAusgeliehen(false);
            System.out.println("Dieser Film wurde jetzt für Sie zurueckgegeben");
        }
    }

    @Override
    public void info () {
        System.out.printf("Es handelt sich um den Film: %s, erschien im Jahr %d, " +
                "und dauert %.2f Minuten und hat Altersfreigabe von %d%n",
                getTitel(), getErscheinungsjahr(), laenge, fsk);


        if (isAusgeliehen()) {
            System.out.println("Der Film ist ausgeliehen und muss zurueckgegeben werden");
        } else {
            System.out.println("Der Film ist verfügbar!");
        }

    }


    // toString()

    @Override
    public String toString() {

        return "Film{" +
                "titel='" + getTitel() + '\'' +
                ", erscheinungsjahr=" + getErscheinungsjahr() +
                ", laenge=" + laenge +
                ", fsk=" + fsk +
                ", ausgeliehen=" + isAusgeliehen() +
                '}';
    }

    // equals()

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Film film)) {
            return false;
        }

        return Double.compare(film.laenge, laenge) == 0
                && fsk == film.fsk
                && getErscheinungsjahr() == film.getErscheinungsjahr()
                && Objects.equals(getTitel(), film.getTitel());
    }

    // hashCode()

    @Override
    public int hashCode() {

        return Objects.hash(
                getTitel(),
                getErscheinungsjahr(),
                laenge,
                fsk
        );
    }

}