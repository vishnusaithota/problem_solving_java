package arrays;

import java.util.Scanner;

public class FirstLastOccurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int q = s.nextInt();
        while (q > 0){
            int num = s.nextInt();
            int first = findOccurance(arr, num, true);
            int last = findOccurance(arr, num, false);
            System.out.println(first+" "+last);
            q--;
        }

    }

    private static int findOccurance(int[] arr, int num, boolean flag){
        int low = 0;
        int high = arr.length - 1;
        int pos = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == num){
                pos = mid;
                if (flag){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else if (arr[mid] < num){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return pos;
    }
}
