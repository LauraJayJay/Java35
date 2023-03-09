package tasks;

import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int input = scanner.nextInt();

        if (input < 0) {
            System.out.println("Invalid input");
        } else if (input > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        } else if (input % 400 == 0 && input % 100 != 0) {
             System.out.println("Leap year");
         } else {
             System.out.println("Not a Leap");
        }
    }
}
