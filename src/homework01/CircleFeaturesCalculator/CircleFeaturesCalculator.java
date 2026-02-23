package homework01.CircleFeaturesCalculator;

import java.util.Scanner;

public class CircleFeaturesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        double perimeter = 2 * Math.PI * radius;
        double area      = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

