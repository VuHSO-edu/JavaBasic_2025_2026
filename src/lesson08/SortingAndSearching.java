package lesson08;

import java.util.Arrays;

public class SortingAndSearching {

    // 2.1 Linear Search
    public static boolean linearSearch(int[] array, int key) {
        for (int item : array) {
            if (item == key) return true;
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    // 2.2 Recursive Binary Search
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx >= toIdx - 1) {
            // Terminating condition
            return array[fromIdx] == key;
        }
        int middleIdx = (fromIdx + toIdx) / 2;
        if (key == array[middleIdx]) {
            return true;
        } else if (key < array[middleIdx]) {
            return binarySearch(array, key, fromIdx, middleIdx);
        } else {
            return binarySearch(array, key, middleIdx + 1, toIdx);
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    // 2.3 Selection Sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    // 2.4 Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (array[i - 1] > array[i]) {
                    // Swap
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
    }

    // 2.5 Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Binary search for 6: " + binarySearch(arr, 6));
    }
}
