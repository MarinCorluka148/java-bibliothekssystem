package vererbung;

public final class OrtsTermin extends Termin{
    private final String wo;

    public OrtsTermin(Datum wann, String was, String wo){
        super(wann, was);
        if(wo == null || wo.length() == 0){
            throw new IllegalArgumentException("Ungültiger Termin");
        }
        this.wo = wo;
    }

    public String getWo(){
        return this.wo;
    }

    public String toString(){
        return String.format("%s %s", this.wo, super.toString());
    }
}
