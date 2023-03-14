package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulatExpression {
    public static void main(String[] args) {
        //Example1

        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("ab");

        System.out.println(matcher.matches());
        System.out.println(matcher.find()); //finds at least if one contains the value

        //Example2

        //Any 3 symbols that would be any lower case letter or number from 5 to 9
        System.out.println(Pattern.matches("[a-z5-9]{3}","abc")); // abc can be anything from a-z and 1-9

        //2 Uppercase letters followed by at least 2 lower case and then by 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}","UZui345"));

        //7 any letters or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,7}","jD4590ft")); //from 2 to 7 symbols

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your cars plate number");
        String plateNumber = scanner.nextLine();

        //2 Upper case letter followed by one "-" and then 2  to 4 numbers

       if(Pattern.matches("[A-Z]{2}-[0-9]{2,4}",plateNumber)){
           System.out.println("Number is valid");
       }else{
           System.out.println("Number not valid");
       }





    }
}
