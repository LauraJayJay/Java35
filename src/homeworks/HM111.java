package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HM111 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        Pattern pattern = Pattern.compile("[0-9]{5}-[0-9]{6}");
          //Asking for input and calling matches method
        while (again == 'y') {

            System.out.println("Enter personal number:");
            String personalNumber = scanner.nextLine().trim();

            Matcher matcher = pattern.matcher(personalNumber);
            boolean matches = matcher.matches();

            //Determining is input valid or not

            if (matches) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check your personal number again? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        }








    }
}
