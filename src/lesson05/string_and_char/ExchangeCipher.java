package lesson05.string_and_char;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next().toUpperCase();

        System.out.print("The ciphertext string is: ");

        for (int i = 0; i < inStr.length(); i++) {
            char plainChar = inStr.charAt(i);

            if (plainChar >= 'A' && plainChar <= 'Z') {
                char cipherChar = (char)('A' + 'Z' - plainChar);
                System.out.print(cipherChar);
            } else {
                System.out.print(plainChar);
            }
        }
        System.out.println();
        in.close();
    }
}