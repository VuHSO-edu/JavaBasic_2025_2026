package lesson05.string_and_char;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = in.next().toUpperCase();

        System.out.print("The plaintext string is: ");

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);

            if (c >= 'D' && c <= 'Z') {
                System.out.print((char)(c - 3));
            } else if (c == 'A') {
                System.out.print('X');
            } else if (c == 'B') {
                System.out.print('Y');
            } else if (c == 'C') {
                System.out.print('Z');
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
        in.close();
    }
}