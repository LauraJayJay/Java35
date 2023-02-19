package homeworks;

import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {
        // Using scanner read speed in mp/h
// Calculate and output speed in km/h
// Example with input 122.7 mp/h
// Output --> 122.7 mp/h in km/h would be equal to 197.46651

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the speed in miles");

        float miles = scanner.nextFloat() ;
        System.out.println( ((miles) * 1.609344) + " km/h");

    }
}
