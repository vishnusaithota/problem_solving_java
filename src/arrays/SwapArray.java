package arrays;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5};
        int[] arr2 = {3, 4, 7};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] temp = null;
        temp = arr1;
        arr1= arr2;
        arr2 = temp;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
