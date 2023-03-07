package homeworks;

public class HM6 {
    public static void main(String[] args) {
        /*        Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.*/

       char symbol = 'A';

       do{
           System.out.println(symbol);
           symbol++;

        } while (symbol < '[');

       for (char i = 'A'; i <= 'Z'; i++){
           System.out.println(i);
       }
    }
}
