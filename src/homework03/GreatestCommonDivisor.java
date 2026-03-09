package homework03;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = in.nextInt();

        System.out.print("Input second number: ");
        int number2 = in.nextInt();

        System.out.println("Greatest common divisor of the two numbers is: " + euclid(number1, number2));
        in.close();
    }

    public static int euclid(int number1, int number2) {
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        if (number1 == 0) return number2;
        if (number2 == 0) return number1;

        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }

        return number1;
    }
}

