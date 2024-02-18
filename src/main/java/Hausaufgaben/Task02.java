package Hausaufgaben;

import java.util.Scanner;

/*Напишите программу для тестирования знаний.
Программа должна задать три вопроса связанных с программированием.

Ответом на первый вопрос должно быть да/нет,
на второй вопрос один вариант ответа из трех (a, b, c),
на третий вопрос открытый ответ (надо ввести ответ вручную)

Если пользователь правильно ответил хотя бы на два вопроса, вывести сообщение "Вы хорошо знаете программирование!",
в противном случае вывести "Вам нужно учиться больше!".
*/

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Wissenstest");
        System.out.println("Haben Sie schon mal programmiert? Antworten Sie mit ja oder nein");
        String question1 = scanner.next();
        if (question1.equals("ja")) {
            System.out.println("Schön");
            score++;
        } else {
            System.out.println("Wird Zeit dafür.");
        }
        System.out.println("Welche Sprache ist eine Computer Sprache? A: Python, B:German, C: Suaheli");
        String question2 = scanner.next();
        if (question2.equals("A")) {
            System.out.println("Richtig");
            score++;
        } else {
            System.out.println("Leider falsch");
        }
        System.out.println("Wollen Sie mehr über programmieren erfahren?");
        String question3 = scanner.next();
        if (question3.equals("ja")) {
            System.out.println("Besuchen Sie ....");
        } else {
            System.out.println("Vielleicht irgendwann mal.");
        }
        if (score >= 2) {
            System.out.println("Sie haben zwei richtige Antworten");

        }
    }
}
