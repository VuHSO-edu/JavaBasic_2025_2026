package homework03;

import java.util.Scanner;

public class NumberCombinationFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number (n): ");
        int number = in.nextInt();

        findCombinations(number);
        in.close();
    }

    public static void findCombinations(int number) {
        int counter = 0;

        System.out.println("Combinations of a, b, c:");
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    if (a + b + c == number) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                        counter++;
                    }
                }
            }
        }

        System.out.println("Number of combinations of a, b and c: " + counter);
    }
}

