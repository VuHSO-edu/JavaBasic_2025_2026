package lesson07;
import java.util.Scanner;

public class GradesHistogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bins = new int[10];

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();

            if (grade == 100) {
                bins[9]++;
            } else {
                bins[grade / 10]++;
            }
        }
        System.out.println("\nHorizontal Histogram");

        for (int i = 0; i < bins.length; i++) {
            if (i == 9) {
                System.out.print(" 90-100: ");
            } else {
                System.out.printf("%2d-%2d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("\nVertical Histogram");

        int maxCount = bins[0];

        for (int count : bins) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int row = maxCount; row > 0; row--) {
            for (int col = 0; col < bins.length; col++) {
                if (bins[col] >= row) {
                    System.out.print("   *   ");
                } else {
                    System.out.print("       ");
                }
            }

            System.out.println();
        }
        for (int i = 0; i < bins.length; i++) {
            if (i == 9) {
                System.out.print("90-100 ");
            } else {
                System.out.printf("%2d-%2d  ", i * 10, i * 10 + 9);
            }
        }
    }
}
