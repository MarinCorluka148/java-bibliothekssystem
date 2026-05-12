package termin;
import Datumpackage.Datum;

import java.util.Objects;


public final class Termin{

    private Datum wann;
    private final String was;

    public Termin(Datum datum, String was){
        this.wann = Objects.requireNonNull(datum, "Darf nicht null sein");
        this.was = Objects.requireNonNull(was, "Darf nicht null sein");
    }

    public void verschieben(Datum datum){
        this.wann = Objects.requireNonNull(datum, "Darf net null sein");
    }

    public Datum datum(){
        return this.wann;
    }

    public String beschreibung(){
        return this.was;
    }

}