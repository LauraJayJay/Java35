package homeworks;

import java.util.Scanner;

public class HM7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of array:");

        int input = scanner.nextInt();
        System.out.println("Enter the the elements of array one by one");

        for( int i = 0; i < input; i++ ){
            System.out.println("Please enter the element number:" + (i+1));
            int element = scanner.nextInt();

        }

        System.out.println("Sourse array: ");

    }
}
