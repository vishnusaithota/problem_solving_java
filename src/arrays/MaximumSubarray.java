package arrays;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
//        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};

        int[] arr = {-1, -2, -3, -4, -5};
        int maxSum = findMaximumSum(arr);
        System.out.println(maxSum);
    }

    private static int findMaximumSum(int[] arr) {
        int max = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i],max + arr[i]);

            if (max > globalMax){
                globalMax = max;
            }
        }
        return globalMax;
    }

}
