package lesson06;

import java.util.*;

public class Matrix {

    public static int[][] input(int r, int c) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = sc.nextInt();
            }
        return a;
    }

    public static void print(int[][] a) {
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    // cộng
    public static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    // nhân ma trận
    public static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    // đường chéo chính
    public static int mainDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i][i];
        return sum;
    }

    // transpose
    public static int[][] transpose(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = a[i][j];
        return t;
    }

    // symmetric
    public static boolean isSymmetric(int[][] a) {
        return Arrays.deepEquals(a, transpose(a));
    }
}
