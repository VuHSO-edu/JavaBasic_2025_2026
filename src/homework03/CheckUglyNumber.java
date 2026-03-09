package homework03;

import java.util.Scanner;

public class CheckUglyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an integer number: ");
        int number = in.nextInt();

        if (isUglyNumber(number)) {
            System.out.println("It is an ugly number.");
        } else {
            System.out.println("It is not an ugly number.");
        }

        in.close();
    }

    public static boolean isUglyNumber(int number) {
        if (number <= 0) {
            return false;
        }

        while (number != 1) {
            if (number % 5 == 0) {
                number /= 5;
            } else if (number % 3 == 0) {
                number /= 3;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                return false;
            }
        }

        return true;
    }
}

