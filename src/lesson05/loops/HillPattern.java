package lesson05.loops;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        System.out.println("(a)");
        for (int i = 0; i < size; i++) {
            for (int j  = 0; j < 2 * size; j++) {
                if ((i + j) >= size && i >= j - size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("(b)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size; j++) {
                if ((i + j) >= size && i <= j - size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
