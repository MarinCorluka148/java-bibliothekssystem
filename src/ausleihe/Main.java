package ausleihe;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {

        try {

            Datenbank.verbinden();
            Datenbank.tabelleErstellen();

            System.out.println("Datenbank verbunden!");

        } catch (Exception e) {

            System.out.println("Fehler bei der Verbindung.");
        }

        Bibliothek bibliothek = new Bibliothek();
        bibliothek.setMedien(Datenbank.medienLaden());
        Scanner scanner = new Scanner(System.in);


        boolean laeuft = true;

        while (laeuft) {

            System.out.println();
            System.out.println("=== Bibliothekssystem ===");
            System.out.println("1 - Alle Medien anzeigen");
            System.out.println("2 - Medium suchen");
            System.out.println("3 - Medium ausleihen");
            System.out.println("4 - Medium zurueckgeben");
            System.out.println("5 - Medium entfernen");
            System.out.println("6 - Nach Titel sortieren");
            System.out.println("7 - Nach Jahr sortieren");
            System.out.println("8 - Beenden");
            System.out.println("9 - Neues Medium hinzufügen");
            System.out.println("10 - Bibliothek speichern");
            System.out.println("11 - Bibliothek laden");
            System.out.println("12 - Datenbank anzeigen");
            System.out.print("Auswahl: ");


            int auswahl;
            try{
                auswahl = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Bitte eine Zahl eingeben.");
                scanner.nextLine();
                continue;
            }

            switch (auswahl) {

                case 1:

                    bibliothek.alleMedienAnzeigen();
                    break;


                case 2:

                    System.out.print("Titel eingeben: ");
                    String suchTitel = scanner.nextLine();

                    bibliothek.mediumSuchen(suchTitel);
                    break;


                case 3:

                    System.out.print("Titel zum Ausleihen eingeben: ");
                    String ausleihTitel = scanner.nextLine();

                    bibliothek.mediumAusleihen(ausleihTitel);
                    Datenbank.ausleihStatusAktualisieren(ausleihTitel, true);

                    break;


                case 4:

                    System.out.print("Titel zum Zurueckgeben eingeben: ");
                    String rueckgabeTitel = scanner.nextLine();

                    bibliothek.mediumZurueckgeben(rueckgabeTitel);
                    Datenbank.ausleihStatusAktualisieren(rueckgabeTitel, false);
                    break;


                case 5:

                    System.out.print("Titel zum Entfernen eingeben: ");
                    String entfernTitel = scanner.nextLine();

                    bibliothek.mediumEntfernen(entfernTitel);
                    Datenbank.mediumLoeschen(entfernTitel);

                    break;


                case 6:

                    bibliothek.sortiereNachTitel();

                    System.out.println(
                            "Medien wurden nach Titel sortiert."
                    );

                    break;


                case 7:

                    bibliothek.sortiereNachJahr();

                    System.out.println(
                            "Medien wurden nach Jahr sortiert."
                    );

                    break;


                case 8:

                    laeuft = false;

                    System.out.println("Programm beendet.");

                    break;


                case 9:

                    System.out.println("1 - Buch");
                    System.out.println("2 - Film");
                    System.out.println("3 - Spiel");
                    System.out.print("Auswahl: ");


                    int typ;

                     try {
                         typ = scanner.nextInt();
                         scanner.nextLine();
                     } catch (InputMismatchException e) {

                         System.out.println("Bitte eine Zahl eingeben.");

                         scanner.nextLine();

                         break;
                     }




                    switch (typ) {

                        case 1:

                            System.out.print("Titel: ");
                            String buchTitel = scanner.nextLine();

                            int buchJahr;

                            try {
                                System.out.print("Erscheinungsjahr: ");
                                buchJahr = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Bitte ein gueltiges Erscheinungsjahr eingeben.");
                                scanner.nextLine();
                                break;
                            }

                            System.out.print("Autor: ");
                            String autor = scanner.nextLine();

                            int seitenzahl;

                            try {
                                System.out.print("Seitenzahl: ");
                                seitenzahl = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Bitte eine gueltige Seitenzahl eingeben.");
                                scanner.nextLine();
                                break;
                            }

                            Buch buch = new Buch(
                                    buchTitel,
                                    buchJahr,
                                    false,
                                    autor,
                                    seitenzahl
                            );

                            bibliothek.mediumHinzufuegen(buch);
                            Datenbank.mediumSpeichern(buch);

                            System.out.println("Buch hinzugefügt.");

                            break;


                        case 2:

                            System.out.print("Titel: ");
                            String filmTitel = scanner.nextLine();

                            int filmJahr;

                            try {

                                System.out.print("Erscheinungsjahr: ");
                                filmJahr = scanner.nextInt();
                                scanner.nextLine();

                            } catch (InputMismatchException e) {

                                System.out.println("Bitte ein gueltiges Erscheinungsjahr eingeben.");
                                scanner.nextLine();
                                break;
                            }

                            double laenge;

                            try {

                                System.out.print("Länge in Minuten: ");
                                laenge = scanner.nextDouble();
                                scanner.nextLine();

                            } catch (InputMismatchException e) {

                                System.out.println("Bitte eine gueltige Länge eingeben.");
                                scanner.nextLine();
                                break;
                            }

                            int fsk;

                            try {

                                System.out.print("FSK: ");
                                fsk = scanner.nextInt();
                                scanner.nextLine();

                            } catch (InputMismatchException e) {

                                System.out.println("Bitte eine gueltige FSK eingeben.");
                                scanner.nextLine();
                                break;
                            }


                            Film film = new Film(
                                    filmTitel,
                                    filmJahr,
                                    false,
                                    laenge,
                                    fsk
                            );

                            bibliothek.mediumHinzufuegen(film);
                            Datenbank.mediumSpeichern(film);

                            System.out.println("Film hinzugefügt.");

                            break;


                        case 3:

                            System.out.print("Titel: ");
                            String spielTitel = scanner.nextLine();

                            int spielJahr;

                            try {

                                System.out.print("Erscheinungsjahr: ");
                                spielJahr = scanner.nextInt();
                                scanner.nextLine();

                            } catch (InputMismatchException e) {

                                System.out.println("Bitte ein gueltiges Erscheinungsjahr eingeben.");
                                scanner.nextLine();
                                break;
                            }

                            System.out.print("Plattform: ");
                            String plattform = scanner.nextLine();

                            boolean multiplayer;

                            try {

                                System.out.print("Multiplayer (true/false): ");
                                multiplayer = scanner.nextBoolean();
                                scanner.nextLine();

                            } catch (InputMismatchException e) {

                                System.out.println("Bitte true oder false eingeben.");
                                scanner.nextLine();
                                break;
                            }


                            Spiel spiel = new Spiel(
                                    spielTitel,
                                    spielJahr,
                                    false,
                                    plattform,
                                    multiplayer
                            );

                            bibliothek.mediumHinzufuegen(spiel);
                            Datenbank.mediumSpeichern(spiel);

                            System.out.println("Spiel hinzugefügt.");

                            break;


                        default:

                            System.out.println("Ungueltige Auswahl.");
                            break;
                    }

                    break;
                case 10:
                    bibliothek.speichern("bibliothek.dat");
                    break;

                case 11:
                    bibliothek.laden("bibliothek.dat");
                    break;

                case 12:
                    Datenbank.alleMedienAusgeben();
                    break;

                default:

                    System.out.println("Ungueltige Auswahl.");

                    break;
            }
        }

        scanner.close();
    }
}
