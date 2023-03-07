package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HM8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter positive number:");
        int arraySize = scanner.nextInt();

        int storageArray[] = new int [arraySize];

        System.out.println("Please enter the grades of array one by one:");

        for(int i = 0; i < storageArray.length; i++){
            System.out.println("Please enter grade number: " + (i+1));
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];


        }


        System.out.println("Average grade " +  (float) sum / storageArray.length);
        System.out.println("There was passed " + arraySize + " values");

    }
}
