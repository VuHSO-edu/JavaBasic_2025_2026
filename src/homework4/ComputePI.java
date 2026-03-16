package homework4;


public class ComputePI {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 1000000;
        double sum = 0.0;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            }
        }

        double piComputed = 4 * sum;
        System.out.printf("PI computed   = %.10f%n", piComputed);
        System.out.printf("Math.PI       = %.10f%n", Math.PI);
        System.out.printf("Accuracy      = %.6f%%%n", (piComputed / Math.PI) * 100);
    }
}
