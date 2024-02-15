package Lesson08;

        /*
Задание 4: Пользователь вводит число. Посчитать суммму всех его цифр.
Например, для числа одна тысяча двести тридцать четыре (1234) результат будет 10
Подсказка: разряды
 */

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (; num > 0; num /= 10)
            sum += num % 10;
        System.out.println(sum);
    }
}
