package tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any year:");

        year = scanner.nextInt();

        determingLeapYear(year);
        System.out.println(determingLeapYearString(year));
    }

    public static void determingLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " this is a leap year");
        } else {
            System.out.println(year + " this is not a leap year");
        }
    }
    public static String determingLeapYearString (int year){
        String answer;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            answer = "Leap year";
        } else{
            answer = "Not leap year";
        }
        return answer;

    }
}
