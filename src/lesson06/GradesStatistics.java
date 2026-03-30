package lesson06;

import java.util.*;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] g = new int[n];

        int sum = 0, min = 100, max = 0;

        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
            sum += g[i];
            if (g[i] < min) min = g[i];
            if (g[i] > max) max = g[i];
        }

        double avg = (double) sum / n;

        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}