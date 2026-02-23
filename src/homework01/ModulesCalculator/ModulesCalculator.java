package homework01.ModulesCalculator;

import java.util.Scanner;

public class ModulesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = input.nextInt();
        input.close();

        int divided = firstNumber / secondNumber;
        int result  = firstNumber - (divided * secondNumber);
        System.out.println(firstNumber + " module " + secondNumber + " give " + result);
    }
}
