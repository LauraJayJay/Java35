package homeworks;

import java.util.Scanner;

public class HM7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of array:");


        int arraySize = 0;
        if (scanner.hasNextInt()) {
            arraySize = scanner.nextInt();
        }

        // Initialize the array's
        // size using user input
        int[] arr = new int[arraySize];


        // Take user elements for the array
        System.out.println("Enter the elements of the array one by one: ");

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter the element number:" + (i + 1));
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            }
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arraySize; i++) {
            // prints the elements of an array
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        int sum = 0;
        int j;
        for (j = 0; j < arr.length; j++)
            sum += arr[j];
        System.out.println("Sum of given array is " + sum );



    }

}
