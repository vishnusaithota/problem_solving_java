package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int h = n - 1;
            int sum = target - arr[i];
            while ( l < h){
                if (arr[l] + arr[h] == sum){
                    System.out.println(arr[i]+", "+arr[l]+" and "+arr[h]);
                    l++;
                    h--;
                } else if (arr[l] + arr[h] > sum) {
                    h--;
                }else {
                    l++;
                }
            }
        }
    }
}
