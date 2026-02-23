package homework01.SortNumbers;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number x: ");
        int x = input.nextInt();
        System.out.print("Input the number y: ");
        int y = input.nextInt();
        System.out.print("Input the number z: ");
        int z = input.nextInt();
        input.close();

        int maxNumber = Math.max(x, Math.max(y, z));
        int minNumber = Math.min(x, Math.min(y, z));
        int midNumber = (x + y + z) - (maxNumber + minNumber);

        System.out.println("Numbers in increasing order: " + minNumber + " " + midNumber + " " + maxNumber);
    }
}

