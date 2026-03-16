package homework4;


public class TrigonometricSeries {

    // sin(x) = x - x^3/3! + x^5/5! - ...
    public static double sin(double x, int numTerms) {
        double sum = 0.0;
        double term = x; // số hạng đầu tiên
        for (int i = 1; i <= numTerms; ++i) {
            sum += term;
            // số hạng tiếp: nhân với -x^2 / ((2i)(2i+1))
            term *= -x * x / ((2 * i) * (2 * i + 1));
        }
        return sum;
    }

    // cos(x) = 1 - x^2/2! + x^4/4! - ...
    public static double cos(double x, int numTerms) {
        double sum = 0.0;
        double term = 1.0; // số hạng đầu tiên
        for (int i = 1; i <= numTerms; ++i) {
            sum += term;
            // số hạng tiếp: nhân với -x^2 / ((2i-1)(2i))
            term *= -x * x / ((2 * i - 1) * (2 * i));
        }
        return sum;
    }

    public static void main(String[] args) {
        int numTerms = 10;
        double[] testAngles = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2};

        System.out.printf("%-8s %-14s %-14s %-14s %-14s%n",
                "x", "sin(series)", "Math.sin", "cos(series)", "Math.cos");
        for (double x : testAngles) {
            System.out.printf("%-8.4f %-14.10f %-14.10f %-14.10f %-14.10f%n",
                    x, sin(x, numTerms), Math.sin(x), cos(x, numTerms), Math.cos(x));
        }
    }
}
