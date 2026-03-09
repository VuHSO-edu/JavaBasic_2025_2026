package homework03;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        System.out.println("The given number is a prime number: " + isPrime(number));
        System.out.println("Position of the said prime number: " + getPrimePosition(number));

        in.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getPrimePosition(int number) {
        if (!isPrime(number)) {
            return 0;
        }

        int count = 0;
        for (int value = 2; value <= number; value++) {
            if (isPrime(value)) {
                count++;
            }
        }

        return count;
    }
}

