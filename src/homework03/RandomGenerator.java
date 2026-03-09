package homework03;

import java.util.Scanner;

public class RandomGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the starting number of the range: ");
        int startingNumber = in.nextInt();

        System.out.print("Input the ending number of the range: ");
        int endingNumber = in.nextInt();

        if (startingNumber > endingNumber) {
            int temp = startingNumber;
            startingNumber = endingNumber;
            endingNumber = temp;
        }

        int randomNumber = startingNumber + (int) (Math.random() * (endingNumber - startingNumber + 1));

        System.out.println("Generated number: " + randomNumber);
        in.close();
    }
}
