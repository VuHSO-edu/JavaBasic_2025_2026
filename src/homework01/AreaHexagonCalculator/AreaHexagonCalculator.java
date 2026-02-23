package homework01.AreaHexagonCalculator;

import java.util.Scanner;

public class AreaHexagonCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double side = input.nextDouble();
        input.close();

        System.out.println("The area of the hexagon is: " + hexagonArea(side));
    }

    public static double hexagonArea(double side) {
        return (6 * side * side) / (4 * Math.tan(Math.PI / 6));
    }
}

