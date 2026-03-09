package homework03;

import java.util.Scanner;

public class CheckPerfectSquareNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a positive integer: ");
        int number = in.nextInt();

        System.out.println("Is the said number perfect square? " + isPerfectSquareNumber(number));
        in.close();
    }

    public static boolean isPerfectSquareNumber(int number) {
        if (number < 0) {
            return false;
        }

        int lastDigit = number % 10;
        if (lastDigit == 2 || lastDigit == 3 || lastDigit == 7 || lastDigit == 8) {
            return false;
        }

        for (int value = 0; value <= Math.sqrt(number) + 1; value++) {
            if (value * value == number) {
                return true;
            }
        }

        return false;
    }
}

