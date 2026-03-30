package lesson06;

import java.util.*;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Integer.toHexString(n).toUpperCase());
    }
}
