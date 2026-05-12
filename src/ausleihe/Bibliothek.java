package ausleihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Bibliothek {

    private ArrayList<Medium> medien;

    public Bibliothek() {
        medien = new ArrayList<>();
    }

    public void mediumHinzufuegen(Medium medium) {
        medien.add(medium);
    }

    public void alleMedienAnzeigen() {
        if (medien.isEmpty()) {
            System.out.println("Keine Medien vorhanden.");
        } else {
            for (Medium medium : medien) {
                System.out.println(medium);
            }

        }
    }

    private Medium findeMedium(String mediumName) {

        for (Medium medium : medien) {

            if (medium.getTitel().equalsIgnoreCase(mediumName)) {
                return medium;
            }
        }

        return null;
    }


    public void mediumSuchen(String mediumName){

        Medium medium = findeMedium(mediumName);

        if (medium != null) {

            System.out.printf("Das Medium %s wurde gefunden.%n", medium);

        } else {
            System.out.println("Kein Medium mit diesem Titel gefunden.");
        }
    }

    public void mediumEntfernen(String mediumName){
        Medium medium = findeMedium(mediumName);

        if (medium != null) {
            medien.remove(medium);

            System.out.printf("Das Medium %s wurde entfernt.%n", medium);

        } else {
            System.out.println("Kein Medium mit diesem Titel gefunden.");
        }
    }


    public void mediumAusleihen(String mediumName){
        Medium medium = findeMedium(mediumName);
        if (medium != null) {

            medium.ausleihen();

        } else {
            System.out.println("Kein Medium mit diesem Titel gefunden.");
        }
    }


    public void mediumZurueckgeben(String mediumName){
        Medium medium = findeMedium(mediumName);

        if (medium != null){
            medium.zurueckgeben();
        } else {
            System.out.println("Kein Medium mit diesem Titel gefunden.");
        }
    }

    public void sortiereNachTitel() {

        Collections.sort(
                medien,
                Comparator.comparing(Medium::getTitel)
        );
    }

    public void sortiereNachJahr(){
        Collections.sort(
                medien,
                Comparator.comparing(Medium::getErscheinungsjahr)
        );
    }

    public void speichern(String dateiname) {

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(dateiname))) {

            out.writeObject(medien);

            System.out.println("Bibliothek wurde gespeichert.");

        } catch (IOException e) {

            System.out.println("Fehler beim Speichern.");
        }
    }


    @SuppressWarnings("unchecked")
    public void laden(String dateiname) {

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(dateiname))) {

            medien = (ArrayList<Medium>) in.readObject();

            System.out.println("Bibliothek wurde geladen.");

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Fehler beim Laden.");
        }
    }

    public int anzahlMedien() {
        return medien.size();
    }

}
