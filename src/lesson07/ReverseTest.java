package lesson07;

public class ReverseTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        reverse(numbers);

        printArray(numbers);
    }

    public static void reverse(int[] array) {
        for (int frontIndex = 0, backIndex = array.length - 1;
             frontIndex < backIndex;
             frontIndex++, backIndex--) {

            int temp = array[frontIndex];
            array[frontIndex] = array[backIndex];
            array[backIndex] = temp;
        }
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
