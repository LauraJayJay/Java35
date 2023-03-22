package homeworks;

import java.util.Scanner;

public class HM14 {
    public static void main(String[] args) {

        double discount,amount,markedprice,sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter marked price ");

        markedprice = scanner.nextDouble();

        System.out.println("enter discount percentage ");

        discount=scanner.nextDouble();

        sum = 100-discount;

        amount = ((sum * markedprice)/100);

        System.out.println("amount after discount= " + amount);
    }

    }
