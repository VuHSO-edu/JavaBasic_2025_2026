package lesson07;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SENTINEL = -1;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = scanner.nextInt();

        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }

            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scanner.nextInt();
        }

        System.out.println("The magic sum is: " + sum);

        scanner.close();
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            int digit = number % 10;

            if (digit == 8) {
                return true;
            }

            number /= 10;
        }

        return false;
    }
}
