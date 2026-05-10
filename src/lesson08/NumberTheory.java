package lesson08;

import java.util.Scanner;

public class NumberTheory {

    // Helper: Tính tổng các ước số thực sự (proper divisors)
    private static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    // 3.1 Perfect and Deficient Numbers
    public static boolean isPerfect(int aPosInt) {
        return sumOfProperDivisors(aPosInt) == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        return sumOfProperDivisors(aPosInt) < aPosInt;
    }

    // 3.2 Prime Numbers
    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) return false;
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) return false;
        }
        return true;
    }

    // 3.3 Prime Factors (Tích các thừa số nguyên tố)
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    // 3.4 Greatest Common Divisor (GCD - Iterative Euclid)
    public static int gcd(int a, int b) {
        // Đảm bảo a và b dương
        a = Math.abs(a);
        b = Math.abs(b);

        // Swap nếu a < b để đảm bảo a >= b
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound for Perfect Numbers: ");
        int bound = in.nextInt();

        System.out.println("These numbers are perfect:");
        int perfectCount = 0;
        for (int i = 1; i <= bound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                perfectCount++;
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n",
                perfectCount, (double) perfectCount / bound * 100);

        in.close();
    }
}
