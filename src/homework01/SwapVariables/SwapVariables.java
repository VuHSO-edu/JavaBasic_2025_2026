package homework01.SwapVariables;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number x: ");
        int x = input.nextInt();
        System.out.print("Input the number y: ");
        int y = input.nextInt();
        input.close();

        System.out.println("Before swapping: x, y = " + x + ", " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: x, y = " + x + ", " + y);
    }
}
