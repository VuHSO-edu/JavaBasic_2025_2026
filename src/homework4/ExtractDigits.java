package homework4;


public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        System.out.print("Digits in reverse order: ");
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }

    }
}
