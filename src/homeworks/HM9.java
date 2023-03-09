package homeworks;

import java.util.Scanner;

public class HM9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of tree: ");
        int h = input.nextInt();

        for(int i = 1 ;i <= h ; i++) {
            for(int j = h-i ; j > 0 ; j--) {
                System.out.print("_");
            }
            for(int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1;i <= h - 2;i++) {
            System.out.print(" ");
            }
            for(int k = 2;k > 0;k--) {
                System.out.print("| ");
            }
        }






    }

