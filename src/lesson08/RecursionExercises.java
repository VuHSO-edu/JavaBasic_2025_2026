package lesson08;

public class RecursionExercises {

    // 1.1 Factorial (Recursive)
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive call
    }

    // 1.2 Fibonacci (Recursive)
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case 1
        } else if (n == 1) {
            return 1; // Base case 2
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    // 1.3 Length of a Running Number Sequence (Recursive)
    // Hàm phụ để đếm số lượng chữ số của một số n
    private static int numOfDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int len(int n) {
        if (n == 1) {
            return 1; // Base case: S(1) = 1 có độ dài là 1
        }
        return len(n - 1) + numOfDigits(n); // Recursive call
    }

    // 1.4 GCD (Recursive)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case
        }
        return gcd(b, a % b); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 5: " + fibonacci(5));
        System.out.println("Length of S(12): " + len(12));
        System.out.println("GCD of 15 and 5: " + gcd(15, 5));
    }
}
