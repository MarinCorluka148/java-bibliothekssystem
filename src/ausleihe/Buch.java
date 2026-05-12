package ausleihe;

import java.util.Objects;

public final class Buch extends Medium{

    private String author;
    private int seitenzahl;


    public Buch(String titel, int erscheinungsjahr,
                boolean ausgeliehen,
                String author,
                int seitenzahl) {

        super(titel, erscheinungsjahr, ausgeliehen);

        this.author = author;
        this.seitenzahl = seitenzahl;
    }

    //Getter

    public String getAuthor() {
        return author;
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    // Setter

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSeitenzahl(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    @Override
    public void ausleihen(){

        if (isAusgeliehen()){
            System.out.println("Das Buch ist schon ausgeliehen!");
        } else {
            setAusgeliehen(true);
            System.out.println("Das Buch wurde jetzt für Sie ausgeliehen!");
        }
    }


    @Override
    public void zurueckgeben() {

        if (!isAusgeliehen()) {
            System.out.println("Dieses Buch muss erstmal ausgeliehen sein");
        } else {
            setAusgeliehen(false);
            System.out.println("Dieses Buch wurde jetzt für Sie zurueckgegeben");
        }
    }


    public void info () {

        System.out.printf("Es handelt sich um das Buch: %s, erschien im Jahr %d, " +
                        "und hat %d Seiten%n",
                        getTitel(), getErscheinungsjahr(), seitenzahl);


        if (isAusgeliehen()) {
            System.out.println("Das Buch ist ausgeliehen und muss zurueckgegeben werden");
        } else {
            System.out.println("Das Buch ist verfügbar!");
        }


    }

    // toString()

    @Override
    public String toString() {

        return "Buch{" +
                "titel='" + getTitel() + '\'' +
                ", erscheinungsjahr=" + getErscheinungsjahr() +
                ", author='" + author + '\'' +
                ", seitenzahl=" + seitenzahl +
                ", ausgeliehen=" + isAusgeliehen() +
                '}';
    }

    // equals()

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Buch buch)) {
            return false;
        }

        return seitenzahl == buch.seitenzahl
                && getErscheinungsjahr() == buch.getErscheinungsjahr()
                && Objects.equals(getTitel(), buch.getTitel())
                && Objects.equals(author, buch.author);
    }

    // hashCode()

    @Override
    public int hashCode() {

        return Objects.hash(
                getTitel(),
                getErscheinungsjahr(),
                author,
                seitenzahl
        );
    }

}

