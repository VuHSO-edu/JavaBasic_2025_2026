package homework03;

import java.util.Scanner;

public class NumbersInAIntervalPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();

        System.out.print("Input third number: ");
        int thirdNumber = in.nextInt();

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        int counter = 0;

        System.out.println("The numbers are divisible by " + thirdNumber + ":");
        for (int number = start; number <= end; number++) {
            if (number % thirdNumber == 0) {
                System.out.print(number + " ");
                counter++;
            }
        }

        System.out.printf("%nThere are %d numbers divisible by %d.%n", counter, thirdNumber);
        in.close();
    }
}

