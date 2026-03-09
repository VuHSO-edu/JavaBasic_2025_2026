package homework03;

import java.util.Scanner;

public class IntegerConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number (string): ");
        String stringNumber = in.nextLine();

        int result = Integer.parseInt(stringNumber);

        System.out.printf("The integer value is: %d%n", result);
        in.close();
    }
}

