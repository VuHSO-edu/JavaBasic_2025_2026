package lesson05.string_and_char;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binStr = in.next();

        int decValue = 0;
        boolean isValid = true;

        for (int i = 0; i < binStr.length(); i++) {
            char c = binStr.charAt(i);
            if (c == '0' || c == '1') {
                decValue = (decValue * 2) + (c - '0');
            } else {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("The equivalent decimal number for binary \"" + binStr + "\" is: " + decValue);
        } else {
            System.out.println("error: invalid binary string \"" + binStr + "\"");
        }
        in.close();
    }
}
