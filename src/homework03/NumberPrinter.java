package homework03;

public class NumberPrinter {
    public static void main(String[] args) {
        System.out.println("Divided by 3:");
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nDivided by 5:");
        for (int number = 1; number <= 100; number++) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nDivided by 3 & 5:");
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
