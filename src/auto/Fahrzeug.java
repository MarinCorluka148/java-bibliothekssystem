package auto;

public class Fahrzeug {
    String marke;
    String modell;
    int baujahr;
    int leistung;

    public Fahrzeug(String a, String b, int c, int d){
        this.marke = a;
        this.modell = b;
        this.baujahr = c;
        this.leistung = d;
    }

    public void fahren(){
        System.out.printf("Das Fahrzeug %s %s %d %d ist am Fahren", marke, modell, baujahr, leistung);
    }

    public void bremsen(){
        System.out.printf("Das Fahrzeug %s %s %d %d ist am Bremsen", marke, modell, baujahr, leistung);
    }

    public void infoAusgeben(){
        System.out.printf("Fahrzeugdaten: %s %s %d %d ", marke, modell, baujahr, leistung);
    }

}
