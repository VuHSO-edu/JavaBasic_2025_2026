package homework4;

import java.util.Scanner;


public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        Scanner scanner = new Scanner(System.in);
        int numberIn;
        boolean isValid;
        int sum = 0;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = scanner.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }

        double average = (double) sum / NUM_STUDENTS;
        System.out.printf("The average is: %.2f%n", average);
    }
}

