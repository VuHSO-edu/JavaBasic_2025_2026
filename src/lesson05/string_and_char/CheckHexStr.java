package lesson05.string_and_char;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = in.next();

        boolean isHex = true;

        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);

            if (!((inChar >= '0' && inChar <= '9')
                    || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                isHex = false;
                break;
            }
        }

        if (isHex) {
            System.out.println("\"" + inStr + "\" is a hex string");
        } else {
            System.out.println("\"" + inStr + "\" is NOT a hex string");
        }
        in.close();
    }
}
