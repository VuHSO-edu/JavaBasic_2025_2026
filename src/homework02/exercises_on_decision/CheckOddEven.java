package homework02.exercises_on_decision;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        System.out.println("Program finished.");
    }
}
