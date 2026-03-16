package homework4;


public class FactorialInt {
    public static void main(String[] args) {
        int factorial = 1;
        for (int n = 1; n <= 20; ++n) {
            // Kiểm tra overflow TRƯỚC khi tính
            if (Integer.MAX_VALUE / factorial < n) {
                System.out.println("The factorial of " + n + " is out of range");
                break;
            }
            factorial *= n;
            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}

