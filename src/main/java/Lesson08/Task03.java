package Lesson08;

import java.util.Scanner;

// Пользователь вводит число, посчитать сумму всех натуральных чисел, которые идут до него включительно.
public class Task03 {
    public static  void main(String[] args) {
        System.out.print("Geben Sie eine Zahl ein: ");
        Scanner scanner=new Scanner(System.in);
        int zahl = scanner.nextInt();

        // Summe berechnen
        int summe = 0;
        for (int i = 1; i <= zahl; i++) {
            summe += i;
        }

        // Ausgabe der Summe
        System.out.println("Die Summe aller natürlichen Zahlen bis " + zahl + " ist: " + summe);

        scanner.close();
    }
}

