package lesson07;

public class EqualsTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};

        System.out.println(equals(arr1, arr2));
        System.out.println(equals(arr1, arr3));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
