package lesson05.string_and_char;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String inStr = in.nextLine().toLowerCase();

        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        boolean isPalindrome = true;

        while (fIdx < bIdx) {
            char fChar = inStr.charAt(fIdx);
            char bChar = inStr.charAt(bIdx);

            if (!Character.isLetter(fChar)) {
                fIdx++;
            }
            else if (!Character.isLetter(bChar)) {
                bIdx--;
            }
            else {
                if (fChar != bChar) {
                    isPalindrome = false;
                    break;
                }
                fIdx++;
                bIdx--;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + inStr + "\" is a palindrome");
        } else {
            System.out.println("\"" + inStr + "\" is not a palindrome");
        }
        in.close();
    }
}
