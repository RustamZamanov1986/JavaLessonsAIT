package Homework09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("choose an operation, +, -, /, * , 5 exit");
            String operation = scanner.next();
            if (operation.equals("5")) {
                exit = false;
                System.out.println("Program end");
                break;
            }


            boolean keepOn = false;
            if (operation.equals("+")) {
                System.out.println("confirmed");
                keepOn = true;
            } else if (operation.equals("-")) {
                System.out.println("confirmed");
            } else if (operation.equals("/")) {
                System.out.println("confirmed");
            } else if (operation.equals("*")) {
                System.out.println("confirmed");
            } else if (keepOn == false) {
                System.out.println("Something went wrong, try again.");
            }

            System.out.println("Please enter the first number");
            double number1 = scanner.nextDouble();
            System.out.println("please enter the second number");
            double number2 = scanner.nextDouble();
            double sum = 0;

            boolean calculation = false;
            while (operation.equals("+")) {
                System.out.println(sum = number1 + number2);
                calculation = true;
                break;
            }
            while (operation.equals("-")) {
                System.out.println(sum = number1 - number2);
                break;
            }
            while (operation.equals("/")) {
                System.out.println(sum = number1 / number2);
                break;
            }
            while (operation.equals("*")) {
                System.out.println(sum = number1 * number2);
                break;
            }

            System.out.println("Try again? Enter yes or exit");
            String replay = scanner.next();
            if (replay.equals("exit")) {
                exit = false;
                System.out.println("Program Exit");
            } scanner.close();
        }
    }
}