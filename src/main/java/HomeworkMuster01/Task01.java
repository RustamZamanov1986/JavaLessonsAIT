package HomeworkMuster01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слогаемое: ");
        double number1 = scanner.nextDouble();
        System.out.println("Введите второе слогаемое: ");
        double number2 = scanner.nextDouble();
        double sum = number1 + number2;

        System.out.println("Сумма = " + sum);
    }
}

 /*
    Калькулятор Суммы: Напишите программу, которая запрашивает у пользователя два числа и выводит их сумму.
     */