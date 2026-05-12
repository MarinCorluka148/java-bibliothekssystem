package vererbung;

public final class TerminTest{
    private TerminTest() {}

    public static void main(String[] args){

        Termin t1 = new Termin(Datum.heute(), "Sex");
        System.out.println(t1);

        OrtsTermin t2 = new OrtsTermin(Datum.valueOf(01, 01,2020), "Anal", "Busch");
        System.out.println(t2);

        t1.verschieben(Datum.heute());
        System.out.println(t1);

        t2.verschieben(Datum.heute());
        System.out.println(t2);
    }
}