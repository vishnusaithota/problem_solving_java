package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArraySumCircularArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0){
            int size = s.nextInt();
            s.nextLine();
            int[] arr = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int maxSum = getMaxSum(arr);
            int minSum = getMaxSum(Arrays.stream(arr).map(x -> x * -1).toArray()) * -1;
            int totalSum = Arrays.stream(arr).reduce(0, Integer::sum);

            int maxCircularSum = Math.max(maxSum, totalSum - minSum);
            System.out.println(maxCircularSum);
            t--;
        }
    }

    private static int getMaxSum(int[] arr) {
        int max = arr[0], globalMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max + arr[i]);
            if (max > globalMax)
                globalMax = max;
        }

        return globalMax;
    }
}
