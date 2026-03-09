package homework03;

import java.util.Scanner;

public class UserInputSum {
    public static void main(String[] args) {
        double number;
        double sum = 0.0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number < 0.0) {
                break;
            }

            sum += number;
        }

        input.close();
        System.out.println("Sum = " + sum);
    }
}
