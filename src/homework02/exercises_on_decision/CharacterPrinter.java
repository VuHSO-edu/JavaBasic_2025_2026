package homework02.exercises_on_decision;

import java.util.Scanner;

public class CharacterPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String inputString = in.next();
        in.close();

        if (inputString.length() <= 0 || inputString.length() > 1) {
            System.out.println("Error. Not a single character.");
            return;
        }

        char inputChar = inputString.charAt(0);

        if (!isUppercase(inputChar) && !isLowercase(inputChar)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
            return;
        }

        if (isVowel(inputChar)) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }

    public static boolean isUppercase(char ch) {
        return ch >= 65 && ch <= 90; // 'A' = 65, 'Z' = 90
    }

    public static boolean isLowercase(char ch) {
        return ch >= 97 && ch <= 122; // 'a' = 97, 'z' = 122
    }

    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                return true;
            default:
                return false;
        }
    }
}

