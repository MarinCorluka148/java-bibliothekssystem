package auto;

public final class Auto extends Fahrzeug{
    double nullAufHundert;


    public Auto(String a, String b, int c, int d, double nullAufHundert){
        super(a,b,c,d);
        this.nullAufHundert = nullAufHundert;
    }


    public void fahren(){
        System.out.printf("Das Auto %s %s %d %d ist brutal schnell am Fahren", marke, modell, baujahr, leistung);
    }

    public void isSportwagen(double nullAufHundert){
       if(nullAufHundert < 5){
           System.out.println("brotal schnell");
       } else {
           System.out.println("Yallah schwach macht perle net nass");
       }
    }

}