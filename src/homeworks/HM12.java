package homeworks;

import java.util.Scanner;

public class HM12 {
    public static void main(String[] args) {

        String x, y = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        x = scanner.nextLine();

        int m = x.length();

        for(int i = m - 1; i >= 0; i--) {
            y = y + x.charAt(i);
        } if (x.equalsIgnoreCase(y)) {
            System.out.println("The name is palindrome.");
        } else {
            System. out.println("The name is not a palindrome.");
        }


    }
}
