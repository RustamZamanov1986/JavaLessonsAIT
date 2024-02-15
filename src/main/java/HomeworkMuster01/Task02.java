package HomeworkMuster01;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное"); // even
        } else {
            System.out.println("Нечетное"); // odd
        }
    }
}
 /*
    Проверка Чётных и Нечётных Чисел: Напишите программу, которая
    запрашивает у пользователя целое число и сообщает, является ли это число чётным или нечётным.
     */