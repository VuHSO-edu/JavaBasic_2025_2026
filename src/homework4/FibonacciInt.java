package homework4;


public class FibonacciInt {
    public static void main(String[] args) {
        int fnMinus2 = 1; // F(0)
        int fnMinus1 = 1; // F(1)
        System.out.println("F(0) = " + fnMinus2);
        System.out.println("F(1) = " + fnMinus1);

        int index = 2;
        while (true) {
            if (Integer.MAX_VALUE - fnMinus1 < fnMinus2) {
                System.out.println("F(" + index + ") is out of the range of int");
                break;
            }
            int fn = fnMinus1 + fnMinus2;
            System.out.println("F(" + index + ") = " + fn);
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            ++index;
        }
    }
}
