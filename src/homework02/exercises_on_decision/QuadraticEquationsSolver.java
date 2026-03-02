package homework02.exercises_on_decision;

import java.util.Scanner;

public class QuadraticEquationsSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();
        input.close();

        double delta = b * b - 4 * a * c;

        if (delta > 0.0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (delta == 0.0) {
            double root1 = -b / (2 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
