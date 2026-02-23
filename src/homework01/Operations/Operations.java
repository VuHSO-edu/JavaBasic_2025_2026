package homework01.Operations;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        int sum      = number1 + number2;
        int minus    = number1 - number2;
        int multiply = number1 * number2;
        int divide   = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("%d + %d = %d%n", number1, number2, sum);
        System.out.printf("%d - %d = %d%n", number1, number2, minus);
        System.out.printf("%d x %d = %d%n", number1, number2, multiply);
        System.out.printf("%d / %d = %d%n", number1, number2, divide);
        System.out.printf("%d mod %d = %d%n", number1, number2, remainder);
    }
}
