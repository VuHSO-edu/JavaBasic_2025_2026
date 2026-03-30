package lesson06;

import java.util.*;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < arr[i]; j++)
                System.out.print("*");
            System.out.println("(" + arr[i] + ")");
        }
    }
}
