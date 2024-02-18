package Hausaufgaben;

import java.util.Scanner;

//Напишите программу, которая запросит ввести ваш возраст, и напишет, кем вы являетесь:
// ребенком, подростком,
//взрослым либо стариком.

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("you are " +  age + " years old");
        if (age ==0 || age <=12){
            System.out.println("You are a Child");
        } else if (age >12 && age <21) {
            System.out.println("You are teenager");
        } else if (age >= 21 && age <=60){
            System.out.println("You are an adult");
        }else System.out.println("you are old");
    }
}
