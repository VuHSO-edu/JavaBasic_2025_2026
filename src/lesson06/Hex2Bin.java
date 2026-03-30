package lesson06;

import java.util.*;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();

        String[] HEX_BITS = {
                "0000","0001","0010","0011",
                "0100","0101","0110","0111",
                "1000","1001","1010","1011",
                "1100","1101","1110","1111"
        };

        for (char c : hex.toCharArray()) {
            int val = Integer.parseInt(String.valueOf(c), 16);
            System.out.print(HEX_BITS[val] + " ");
        }
    }
}
