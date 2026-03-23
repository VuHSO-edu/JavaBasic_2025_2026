package lesson05.string_and_char;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next().toUpperCase();

        System.out.print("The ciphertext string is: ");

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);

            if (c >= 'A' && c <= 'W') {
                System.out.print((char)(c + 3));
            }
            else if (c == 'X') {
                System.out.print('A');
            } else if (c == 'Y') {
                System.out.print('B');
            } else if (c == 'Z') {
                System.out.print('C');
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
        in.close();
    }
}
