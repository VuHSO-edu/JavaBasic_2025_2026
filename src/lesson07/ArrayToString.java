package lesson07;

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {10};
        int[] arr3 = {1, 2, 3, 4};

        System.out.println(arrayToString(arr1));
        System.out.println(arrayToString(arr2));
        System.out.println(arrayToString(arr3));
    }

    public static String arrayToString(int[] array) {
        String result = "[";

        for (int i = 0; i < array.length; i++) {
            result += array[i];

            if (i < array.length - 1) {
                result += ", ";
            }
        }

        result += "]";
        return result;
    }
}
