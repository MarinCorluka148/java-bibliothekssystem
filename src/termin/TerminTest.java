package termin;
import Datumpackage.Datum;

public final class TerminTest{
    private TerminTest() {}

    public static void main(String[] args) {
        Datum teins = Datum.valueOf(28, 04, 2026);
        Datum tzwei = Datum.valueOf(29, 03, 2027);

        Termin termineins = new Termin(teins, "Bumsen");
        System.out.println(termineins.datum());

        termineins.verschieben(tzwei);
        System.out.println(termineins.datum());
        System.out.println(termineins.beschreibung());
    }


}
