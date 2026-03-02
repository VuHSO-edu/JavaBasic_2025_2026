package homework02.exercises_on_decision;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input on mark: ");

        int mark = input.nextInt();

        System.out.println("The mark is: " + mark);

        if (mark >= 55) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
        System.out.println("Program finished.");
    }
}
