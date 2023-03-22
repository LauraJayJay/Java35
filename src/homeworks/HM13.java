package homeworks;

import java.util.Arrays;

public class HM13 {
    public static void main(String[] args) {
        int[] arrayNumbers = {12, 34, 656, 5, 8565, 45353};

        System.out.println(Arrays.toString(arrayNumbers));

        System.out.println(max(arrayNumbers));
        System.out.println(min(arrayNumbers));

    }

    //Max
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Min
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
