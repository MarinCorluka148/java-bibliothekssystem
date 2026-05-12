package ausleihe;

import java.util.Objects;

public final class Spiel extends Medium{

    private String plattform;
    private boolean multiplayer;

    public Spiel(String titel,
                 int erscheinungsjahr,
                 boolean ausgeliehen,
                 String plattform,
                 boolean multiplayer) {

        super(titel, erscheinungsjahr, ausgeliehen);

        this.plattform = plattform;
        this.multiplayer = multiplayer;
    }


    // Getter

    public String getPlattform() {
        return plattform;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    // Setter

    public void setPlattform(String plattform) {
        this.plattform = plattform;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }


    @Override
    public void ausleihen(){
        if (isAusgeliehen()){
            System.out.println("Das Spiel ist schon ausgeliehen!");
        } else {
            setAusgeliehen(true);
            System.out.println("Das Spiel wurde jetzt für Sie ausgeliehen!");
        }
    }


    @Override
    public void zurueckgeben() {

        if (!isAusgeliehen()) {
            System.out.println("Dieses Spiel muss erstmal ausgeliehen sein");
        } else {
            setAusgeliehen(false);
            System.out.println("Dieses Spiel wurde jetzt für Sie zurueckgegeben");
        }
    }


    @Override
    public void info () {
        System.out.printf("Es handelt sich um das Spiel: %s, erschien im Jahr %d, " +
                "wird auf der Spielplattform %s gespielt.%n",
                getTitel(),
                getErscheinungsjahr(),
                plattform);


        if (multiplayer) {

            System.out.println("Das Spiel besitzt einen Multiplayer-Modus.");

        } else {

            System.out.println("Das Spiel besitzt keinen Multiplayer-Modus.");
        }


        if (isAusgeliehen()) {
            System.out.println("Das Spiel ist ausgeliehen und muss zurueckgegeben werden");
        } else {

            System.out.println("Das Spiel ist verfügbar!");
        }


    }


    // toString()

    @Override
    public String toString() {

        return "Spiel{" +
                "titel='" + getTitel() + '\'' +
                ", erscheinungsjahr=" + getErscheinungsjahr() +
                ", plattform='" + plattform + '\'' +
                ", multiplayer=" + multiplayer +
                ", ausgeliehen=" + isAusgeliehen() +
                '}';
    }


    // equals()

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Spiel spiel)) {
            return false;
        }

        return multiplayer == spiel.multiplayer
                && getErscheinungsjahr() == spiel.getErscheinungsjahr()
                && Objects.equals(getTitel(), spiel.getTitel())
                && Objects.equals(plattform, spiel.plattform);
    }

    // hashCode()

    @Override
    public int hashCode() {

        return Objects.hash(
                getTitel(),
                getErscheinungsjahr(),
                plattform,
                multiplayer
        );
    }

}
