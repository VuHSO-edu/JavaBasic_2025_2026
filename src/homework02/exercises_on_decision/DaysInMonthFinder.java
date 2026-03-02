package homework02.exercises_on_decision;

import java.util.Scanner;

public class DaysInMonthFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        input.close();

        int numberOfDaysInMonth = 0;
        String nameOfMonth = "Unknown";

        switch (month) {
            case 1:  nameOfMonth = "January";   numberOfDaysInMonth = 31; break;
            case 2:
                nameOfMonth = "February";
                numberOfDaysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            case 3:  nameOfMonth = "March";     numberOfDaysInMonth = 31; break;
            case 4:  nameOfMonth = "April";     numberOfDaysInMonth = 30; break;
            case 5:  nameOfMonth = "May";       numberOfDaysInMonth = 31; break;
            case 6:  nameOfMonth = "June";      numberOfDaysInMonth = 30; break;
            case 7:  nameOfMonth = "July";      numberOfDaysInMonth = 31; break;
            case 8:  nameOfMonth = "August";    numberOfDaysInMonth = 31; break;
            case 9:  nameOfMonth = "September"; numberOfDaysInMonth = 30; break;
            case 10: nameOfMonth = "October";   numberOfDaysInMonth = 31; break;
            case 11: nameOfMonth = "November";  numberOfDaysInMonth = 30; break;
            case 12: nameOfMonth = "December";  numberOfDaysInMonth = 31; break;
            default: nameOfMonth = "Invalid month";
        }

        System.out.println(nameOfMonth + " " + year + " has " + numberOfDaysInMonth + " days");
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
