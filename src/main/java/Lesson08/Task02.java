package Lesson08;
//Пользователь вводит число, напечатать табличку умножения для этого числа
//Например, если введено 4, нужно напечатать:

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int sum = number * i;
            System.out.println(sum);
        }

    }
}


