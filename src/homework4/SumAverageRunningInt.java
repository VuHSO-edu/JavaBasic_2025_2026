package homework4;


public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        double average;

        // for-loop
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }

        // Ép kiểu double để tránh int/int = int
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }
}


