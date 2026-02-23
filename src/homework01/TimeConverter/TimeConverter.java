package homework01.TimeConverter;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int numSeconds = input.nextInt();
        input.close();

        int seconds = numSeconds % 60;
        int minute  = (numSeconds / 60) % 60;
        int hour    = numSeconds / 3600;

        System.out.printf("%02d:%02d:%02d%n", hour, minute, seconds);
    }
}
