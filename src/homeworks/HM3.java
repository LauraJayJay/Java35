package homeworks;

import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) {
        /*     Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

       Your application should read one number (int) and print false or true on the screen,
       according to instructions above.*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number");

        int number = scanner.nextInt();

        System.out.println("Is the number near 100?");

        boolean value1 = number >= 90;

        boolean value2 = number <= 110;

        boolean value3 = number == 100;

        System.out.println( (value1 && value2)  &&  !value3 );







    }
}
