package homeworks;

import java.util.Scanner;

public class HW1 {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter your name");
          String name = scanner.nextLine();

          System.out.println("Enter year of birth");
          int year = scanner.nextInt();

          System.out.println("Your name is  " + name + " and you are " + ( 2023 - year)+ " years old");




     }
}
