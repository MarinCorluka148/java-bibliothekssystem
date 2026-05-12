package Datumpackage;

import java.util.Scanner;

public final class DatumTest{
    private DatumTest() {}


    private static final Scanner EINGABE = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Gib heuteigen Datum an mit tag m,onat jahr");

        Datum heute = Datum.valueOf(EINGABE.nextInt(), EINGABE.nextInt(), EINGABE.nextInt());


        Datum heutee = Datum.heute();

        if (heutee.equals(heute)){
            System.out.println("Datum entspricht heute");
        } else {
            System.out.println("Heutiger Datum falsch eingegeben");
        }
    }
}
