package homeworks;

import java.util.Scanner;

public class HM12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name");

        String input = scanner.nextLine().toLowerCase().trim().replaceAll(" ","");
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.printf("Your input %s is a polidrome \n", input);
        } else{
            System.out.printf("Your input %s is not a polidrome \n", input);
        }





    }
}
