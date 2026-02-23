package homework01.AreaPolygonCalculator;

import java.util.Scanner;

public class AreaPolygonCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int numSides = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        input.close();

        System.out.println("The area is: " + polygonArea(numSides, side));
    }

    public static double polygonArea(int numSides, double side) {
        return (numSides * side * side) / (4 * Math.tan(Math.PI / numSides));
    }
}

