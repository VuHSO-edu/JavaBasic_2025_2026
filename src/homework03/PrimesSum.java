package homework03;

import java.util.Scanner;

public class PrimesSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number (n <= 10000) to compute the sum: ");
        int n = in.nextInt();

        System.out.println("Sum of first " + n + " prime numbers: " + sumFirstNPrimes(n));
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

    public static long sumFirstNPrimes(int n) {
        long sum = 0;
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        return sum;
    }
}

