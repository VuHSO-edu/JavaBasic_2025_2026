package lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    public static int[] grades;

    public static void main(String[] args) {
        readGrades();

        System.out.print("The grades are: ");
        print(grades);

        System.out.printf("The average is: %.2f%n", average(grades));
        System.out.printf("The median is: %.2f%n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f%n", standardDeviation(grades));
    }

    public static void readGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        grades = new int[numberOfStudents];

        for (int i = 0; i < grades.length; i++) {
            int grade;

            do {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grade = scanner.nextInt();
            } while (grade < 0 || grade > 100);

            grades[i] = grade;
        }
    }

    public static void print(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static double average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int middle = sortedArray.length / 2;

        if (sortedArray.length % 2 == 1) {
            return sortedArray[middle];
        }

        return (sortedArray[middle - 1] + sortedArray[middle]) / 2.0;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static double standardDeviation(int[] array) {
        double mean = average(array);
        double sum = 0;

        for (int value : array) {
            sum += value * value;
        }

        return Math.sqrt((sum / array.length) - (mean * mean));
    }
}
