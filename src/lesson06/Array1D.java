package lesson06;

import java.util.*;

public class Array1D {

    // 1. Nhập mảng
    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // In mảng
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // 2. In số âm
    public static void printNegative(int[] arr) {
        for (int x : arr)
            if (x < 0) System.out.print(x + " ");
        System.out.println();
    }

    // 3. Tổng
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    // 4. max, min
    public static int max(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    // 5. số lớn thứ 2
    public static int secondMax(int[] arr) {
        int max = max(arr), second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x != max && x > second) second = x;
        }
        return second;
    }

    // 6. đếm chẵn lẻ
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    // 7. copy mảng
    public static int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // 8. insert
    public static int[] insert(int[] arr, int value, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) newArr[i] = value;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    // 9. delete
    public static int[] delete(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // 10. frequency
    public static int frequency(int[] arr, int value) {
        int count = 0;
        for (int x : arr) if (x == value) count++;
        return count;
    }

    // 11. reverse
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    // 12. tách chẵn lẻ
    public static void splitEvenOdd(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int x : arr) {
            if (x % 2 == 0) even.add(x);
            else odd.add(x);
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    // 13. search
    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value) return i;
        return -1;
    }

    // 14. sort
    public static void sortAsc(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortDesc(int[] arr) {
        Arrays.sort(arr);
        reverse(arr);
    }

    // 15. left rotate
    public static void leftRotate(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = first;
    }

    // 16. right rotate
    public static void rightRotate(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = last;
    }
}
