package homework03;

import java.util.Scanner;

public class PositiveNumbersSum {
    public static void main(String[] args) {
        double number;
        double sum = 0.0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            if (counter == 5) {
                break;
            }

            System.out.print("Enter number " + (counter + 1) + ": ");
            number = input.nextDouble();

            if (number <= 0.0) {
                continue;
            }

            counter++;
            sum += number;
        }

        input.close();
        System.out.println("Sum = " + sum);
    }
}

