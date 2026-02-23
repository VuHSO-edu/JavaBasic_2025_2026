package homework01.CheckAsciiTable;

import java.util.Scanner;

public class CheckAsciiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character: ");
        char inputChar = sc.next().charAt(0);
        sc.close();

        int asciiValue = (int) inputChar;
        System.out.println("The ASCII value of " + inputChar + " is: " + asciiValue);
    }
}
