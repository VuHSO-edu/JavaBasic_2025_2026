package lesson05.string_and_char;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();

        System.out.print("Enter the string: ");
        String inStr = in.next();

        int decValue = 0;
        boolean isValid = true;
        String lowerStr = inStr.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            int digitValue = 0;
            if (c >= '0' && c <= '9') {
                digitValue = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                digitValue = c - 'a' + 10;
            } else {
                isValid = false;
                break;
            }
            if (digitValue >= radix) {
                isValid = false;
                break;
            }
            decValue = decValue * radix + digitValue;
        }
        if (isValid) {
            System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + decValue);
        } else {
            System.out.println("error: invalid string \"" + inStr + "\" for radix " + radix);
        }
        in.close();
    }
}
