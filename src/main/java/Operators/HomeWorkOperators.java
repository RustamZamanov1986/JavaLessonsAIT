package Operators;

import java.util.Scanner;

public class HomeWorkOperators {
    public static void main(String[] args) {
        // Task01
        int a = 1;
        int b = 2;
        if (a < b) {
            System.out.println("a is smaller then b");
            System.out.println("------------------------------------------");

        } else {
            System.out.println("a is unequal b");


        }
        // Task 02

        int x = 10;
        int y = 20;
        int z = 30;
        boolean xyz = (y < 29 && y > 11);
        {
            System.out.println(xyz);
            System.out.println("------------------------------------------");

        }
        //Task03
        int minAge = 16;
        int maxAge = 75;
        int age = 20;
        boolean ageRequirement = true;

        if (age >= 16 || age <= 75) {
            System.out.println("you can get your driver's license");
        } else {
            System.out.println("Unfortunately, something seems wrong");
        }
    }



}

