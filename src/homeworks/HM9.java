package homeworks;

import java.util.Scanner;

public class HM9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of tree: ");
        int h = input.nextInt();
        //levels
        for(int i = 1 ;i <= h ; i++) {
            //spaces
            for(int j = h-i ; j > 0 ; j--) {
                System.out.print(" ");
            }
            //stars
            for(int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0;i < h-1;i++) {
            System.out.print(" ");
            }
        System.out.print("#");

        }






    }

