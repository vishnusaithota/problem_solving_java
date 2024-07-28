package arrays;

import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            max = Math.max(x, max);
            min = Math.min(min, x);
            arr[i] = x;
        }

        int[] order = new int[max - min + 1];


        for (int j : arr) {
            order[j-min]++;
        }
        int pos = 0;
        for (int i = 0; i < order.length; i++) {
            while(order[i] > 0){
                arr[pos] = i+ min;
                pos++;
                order[i]--;
            }

        }

        for (int j : arr) {
            System.out.print(j+ " ");
        }
    }
}
