package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();

        findTwoSum(arr, n, target);
    }

    private static void findTwoSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int l = 0;
        int hi = n-1;

        while (l < hi){
            if (arr[l] + arr[hi] == target){
                System.out.print(arr[l]+" "+arr[hi]);
                hi--;
                l++;
            }else if (arr[l] + arr[hi] > target){
                hi--;
            } else {
                l++;
            }
        }
    }
}
