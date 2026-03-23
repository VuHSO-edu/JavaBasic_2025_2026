package lesson05.string_and_char;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next().toLowerCase();

        int vowelsCount = 0;
        int digitsCount = 0;
        int len = inStr.length();

        for (int i = 0; i < len; i++) {
            char c = inStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
            else if (Character.isDigit(c)) {
                digitsCount++;
            }
        }

        double vowelsPct = (double) vowelsCount / len * 100;
        double digitsPct = (double) digitsCount / len * 100;

        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelsCount, vowelsPct);
        System.out.printf("Number of digits: %d (%.2f%%)\n", digitsCount, digitsPct);

        in.close();
    }
}
