package Homework09;
import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            System.out.println("Добро пожаловать в игру 'Угадай число'!");

            while (true) {
                System.out.print("Введите число от 1 до 100: ");
                try {
                    int guess = scanner.nextInt();
                    attempts++;

                    switch (Integer.compare(guess, secretNumber)) {
                        case -1:
                            System.out.println("Загаданное число больше.");
                            break;
                        case 1:
                            System.out.println("Загаданное число меньше.");
                            break;
                        default:
                            System.out.printf("Поздравляем! Вы угадали число %d за %d попыток!%n", secretNumber, attempts);
                            break;
                    }

                    if (guess == secretNumber)
                        break;
                } catch (Exception e) {
                    System.out.println("Пожалуйста, введите целое число.");
                    scanner.nextLine(); // Очищаем буфер ввода
                }
            }

            System.out.print("Хотите сыграть еще раз? (да/нет): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("да");
        } while (playAgain);

        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }
}

