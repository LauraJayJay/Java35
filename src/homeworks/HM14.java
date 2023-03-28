package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HM14 {
    public static void main(String[] args) {

        float discount,result,markedPrice,sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marked price ");

        markedPrice = scanner.nextFloat();

        System.out.println("Enter discount percentage ");

        discount=scanner.nextFloat();

        sum = 100-discount;

        DecimalFormat df = new DecimalFormat("0.00");

        result = ((sum * markedPrice) / 100);

        System.out.printf("Amount after discount = %.2f \n", result);

        System.out.println("Amount after discount = " + df.format (result));
    }

    }
