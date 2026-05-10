package lesson07;

public class ContainsTest {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 20, 25};

        System.out.println(contains(numbers, 8));
        System.out.println(contains(numbers, 10));
    }

    public static boolean contains(int[] array, int key) {
        for (int value : array) {
            if (value == key) {
                return true;
            }
        }

        return false;
    }
}
