package lesson07;

public class CopyOfTest {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        int[] copy1 = copyOf(original);
        int[] copy2 = copyOf(original, 3);
        int[] copy3 = copyOf(original, 7);

        printArray(copy1);
        printArray(copy2);
        printArray(copy3);
    }

    public static int[] copyOf(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength && i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
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
