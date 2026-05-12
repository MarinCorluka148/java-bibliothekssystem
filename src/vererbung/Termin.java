package vererbung;

import java.util.Objects;

public class Termin{
    private Datum wann;
    private final String was;

    public Termin(Datum wann, String was){
        this.wann = Objects.requireNonNull(wann, "Ungültige Eingabe");
        this.was = Objects.requireNonNull(was, "Ungültige Eingabe");
    }

    public void verschieben(Datum wann){
        this.wann = Objects.requireNonNull(wann, "Ungültige Eingabe");
    }

    public String getWas(){
        return this.was;
    }

    public Datum getWann(){
        return this.wann;
    }

    public String toString(){
        return String.format("%s %s", was, wann);
    }
}