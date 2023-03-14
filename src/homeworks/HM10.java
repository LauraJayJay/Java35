package homeworks;

import java.util.Arrays;

public class HM10 {
    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5,6,20,7,8,9,10,11,12};
        //System.out.println("Original array: " + Arrays.toString(myArray));


        System.out.println("Reverse order:");
        for(int i = 0 ; i < myArray.length ; i++){

            int temp =myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(myArray));

    }
}
