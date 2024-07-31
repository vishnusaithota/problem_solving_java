package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }
        int[] ans = findSum(arr1, arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i != ans.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(", END");
            }
        }

    }

    private static int[] findSum(int[] arr1, int[] arr2) {
        int[] ans = new int[Math.max(arr1.length, arr2.length) + 1];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int k = ans.length - 1;

        while (i >= 0 || j >= 0){
            int sum = carry;

            if (i >= 0){
                sum = sum + arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            carry = sum / 10;
            ans[k] = sum % 10;
            k--;
        }

        ans[k] = carry;

        if (ans[0] == 0) {
            return Arrays.copyOfRange(ans, 1, ans.length);
        }

        return ans;

    }


}
