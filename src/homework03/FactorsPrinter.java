package homework03;

import java.util.Scanner;

public class FactorsPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = in.nextInt();

        System.out.println("Number of factors are: " + countFactors(number));
        in.close();
    }

    public static int countFactors(int number) {
        if (number <= 0) {
            return 0;
        }

        int counter = 0;

        for (int divisor = 1; divisor <= (int) Math.sqrt(number); divisor++) {
            if (number % divisor == 0 && divisor * divisor != number) {
                counter += 2;
            } else if (divisor * divisor == number) {
                counter++;
            }
        }

        return counter;
    }
}
