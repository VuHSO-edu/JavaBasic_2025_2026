package homework4;

public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        long factorial = 1; // Fix: dùng long thay vì int
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
