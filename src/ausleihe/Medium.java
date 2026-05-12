package ausleihe;

import java.io.Serializable;

/*Wenn eine Klasse abstracte Methoden besitzt MUSS die Methode abstract sein!
Abstracte Kklasse ist eine Vorlage mit gemeinsamen Feldern und Methoden für Unterklassen.

Von abstracten Klassen kann man keine Objekte bauen.

Nur abstracte klassen dürfen abstracte Methoden besitzen

Abstracte Methoden haben keinen Code und MÜSSEN VON ALLEN nicht abstracten Unterklassen überschrieben werden!
 */


public abstract class Medium implements Ausleihe, Serializable {

    public Medium(String titel, int erscheinungsjahr, boolean ausgeliehen){
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.ausgeliehen = ausgeliehen;
    }

    private String titel;
    private int erscheinungsjahr;
    private boolean ausgeliehen;


    // Getter

    public String getTitel() {
        return titel;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }



    // Setter

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }



    @Override
    public void ausleihen(){
        System.out.println("Dieses Element wird ausgeliehen");
    }

    @Override
    public void zurueckgeben(){
        System.out.println("Dieses Element wird zurueckgegeben");
    }


    @Override
    public abstract void info();


}
