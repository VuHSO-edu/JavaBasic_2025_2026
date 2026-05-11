package midexam;

import java.util.Random;
import java.util.Scanner;

/**
 * @author VuHSO
 * @created 5/11/2026 10:30 AM
 */
public class StringAndCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String inputText = inputText(scanner);
        System.out.println("Input text: " + inputText);
        int[] freq = countFrequency(inputText);
        System.out.print("Cac chu cai va chu so trong inputText: ");
        boolean isFirst = true;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print((char) i + ": " + freq[i]);
                isFirst = false;
            }
        }
        System.out.println();
        String properCaseText = toProperCase(inputText);
        System.out.println("Proper Case of inputText string: " + properCaseText);
        Random rand = new Random();
        int key = rand.nextInt(3) + 3;

        String caesar = caesarCode(inputText, key);
        System.out.println("Original Message " + inputText + ", key = " + key + ", Caesar Code: " + caesar);

    }

    public static String inputText(Scanner scanner) {
        return scanner.nextLine();
    }

    public static int[] countFrequency(String text) {
        int[] freq = new int[128];
        String upperText = text.toUpperCase();

        for (int i = 0; i < upperText.length(); i++) {
            char c = upperText.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                freq[c]++;
            }
        }
        return freq;
    }

    public static String toProperCase(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : text.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                capitalizeNext = true;
                result.append(c);
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();

    }

    public static String caesarCode(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) ('A' + (c - 'A' + key) % 26));
            } else if (c >= 'a' && c <= 'z') {
                result.append((char) ('a' + (c - 'a' + key) % 26));
            } else if (c >= '0' && c <= '9') {
                result.append((char) ('0' + (c - '0' + key) % 10));
            } else {
                result.append(c);
            }
        }
        return result.toString();

    }
}