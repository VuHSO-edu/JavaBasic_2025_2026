package homework4;


public class Fibonacci {
    public static void main(String[] args) {
        int nMax = 20;
        int fnMinus2 = 1; // F(1)
        int fnMinus1 = 1; // F(2)
        int fn;
        int sum = fnMinus2 + fnMinus1;
        int n = 3;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus2 + " " + fnMinus1 + " ");

        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            ++n;
        }

        double average = (double) sum / nMax;
        System.out.println("\nThe average is " + average);
    }
}

