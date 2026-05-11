package midexam;

import java.util.Random;
import java.util.Scanner;

/**
 * @author VuHSO
 * @created 5/11/2026 10:34 AM
 */
public class ArrayAndSortingAlgorithm {
    public static void main(String[] args) {
        Random random = new Random();
        int dataSize = random.nextInt(10) + 11;
        System.out.println("Data size: " + dataSize);

        int[] data = inputData(dataSize);
        System.out.print("Data:" );
        printData(data);

        System.out.println();
        selectionSort(data);
        System.out.print("Decreasing data using SelectionSort: ");
        printData(data);
        System.out.println();

        int number = random.nextInt(100) + 1;
        int index = binarySearch(data, number);

        if (index != -1) {
            System.out.println("Number " + number + " exists in the data data (at position " + index + ").");
        } else {
            System.out.println("Number " + number + " does not exist in the data data (at position " + index + ").");
        }
    }

    public static int[] inputData(int dataSize) {
        int[] array = new int[dataSize];
        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            array[i] = random.nextInt(100)+1;
        }
        return array;
    }

    public static void printData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = data[maxIdx];
            data[maxIdx] = data[i];
            data[i] = temp;
        }
    }

    public static int binarySearch(int[] decreasingData, int key) {
        int left = 0;
        int right = decreasingData.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (decreasingData[mid] == key) {
                return mid;
            }
            if (decreasingData[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}