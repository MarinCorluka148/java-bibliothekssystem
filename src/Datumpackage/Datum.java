package Datumpackage;

import java.util.Calendar;

public final class Datum{
    public final int tag;
    public final int monat;
    public final int jahr;

    private Datum(int tag, int monat, int jahr){
        this.tag= tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public static Datum valueOf(int tag, int monat, int jahr){
        if(tag < 1 || tag > 31 || monat < 1 || monat > 12){
            throw new IllegalArgumentException("Fehlerhafter Datum");
        }
        return new Datum(tag, monat, jahr);
    }

    public static Datum heute(){
        Calendar c = Calendar.getInstance();
        return new Datum(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH) +1, c.get(Calendar.YEAR));
    }

    public String toString(){
        return String.format("%d%d%d", this.tag, this.monat, this.jahr);
    }

    public boolean equals(Object o){
        if(o instanceof Datum){
            Datum that = (Datum) o;
            return this.tag == that.tag
                    && this.monat == that.monat
                    && this.jahr == that.jahr;
        }
        return false;
    }
}