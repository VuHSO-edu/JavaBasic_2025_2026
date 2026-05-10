package lesson07;

public class SwapTest {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        boolean result = swap(arr1, arr2);

        System.out.println("Swap successful: " + result);

        printArray(arr1);
        printArray(arr2);
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
