package lesson05.loops;

import java.util.Scanner;

public class CheckerPattern {

    public static void main(String[] args) {
        Scanner scnanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scnanner.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
}
