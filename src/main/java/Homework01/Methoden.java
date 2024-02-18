package Homework01;

import java.util.Scanner;

public class Methoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String region1 = "Bayern";
        String region2= "Rest";
        System.out.println("In welcher Bayern =1 und Region Rest =2 befinden Sie sich?");
        String region = scanner.next();
        if (region =="Bayern" && region =="Rest") {
            System.out.println("Sie sind in Bayern");
            if (region =="Rest");
        } else System.out.println("Sie sind in der Region " + region);

        mwstRegion1();
    }


    public static void mwstRegion1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Für ihre Region gelten 12% Mwst. auf Elektronik und 7% auf Bekleidung.");
        System.out.println("Geben Sie die Warengruppe ein, Elektronik oder Bekleidung.");
        String warengruppe = "Elektronik";
        String ware = scanner.next();
        if (ware.equals("Elektronik"));
        System.out.println("Für welchen Betrag haben Sie eingekauft?");
        double summe = scanner.nextDouble();
        System.out.println("Sie haben für " + summe + " eingekauft");

    }
}
