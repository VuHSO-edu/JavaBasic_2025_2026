package lesson05.string_and_char;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String inStr = in.next();

        int decValue = 0;
        boolean isValid = true;

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (c >= '0' && c <= '7') {
                int digitValue = c - '0';
                decValue = decValue * 8 + digitValue;
            } else {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + decValue);
        } else {
            System.out.println("error: invalid octal string \"" + inStr + "\"");
        }
        in.close();
    }
}
