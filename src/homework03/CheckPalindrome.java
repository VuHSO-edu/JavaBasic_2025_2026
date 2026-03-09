package homework03;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a positive integer: ");
        int number = in.nextInt();

        System.out.printf("Is %d a palindrome number?%n", number);
        System.out.println(isPalindrome(number));

        in.close();
    }

    public static int reverseNumber(int number) {
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
}

