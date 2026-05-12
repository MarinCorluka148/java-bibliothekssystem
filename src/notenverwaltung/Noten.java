package notenverwaltung;

import java.util.Scanner;



public class Noten {

    public static final Scanner EINGABE = new Scanner(System.in);

    public static double[] leseNote() {


        System.out.println("geb die Noten im richtigem Format an: 1.0, 1.3, 1.7. 2.0 ...");
        double[] note = new double[100];
        int anzahl = 0;


        while (EINGABE.hasNext()) {
            try {
                String eingabe = EINGABE.next();

                if (eingabe.equals("Ende")) {

                    break;
                }

                double Note =
                        Double.parseDouble(eingabe);
                if (Note == 1.0
                        || Note == 1.3
                        || Note == 1.7
                        || Note == 2.0
                        || Note == 2.3
                        || Note == 2.7
                        || Note == 3.0
                        || Note == 3.3
                        || Note == 3.7 || Note == 4.0
                        || Note == 5.0) {
                    note[anzahl] = Note;
                    anzahl++;
                } else {
                    throw new IllegalArgumentException("Ungültige Note");
                }


            } catch (IllegalArgumentException x) {
                System.out.println(x.getMessage());
            }

        }
        return note;
    }


}