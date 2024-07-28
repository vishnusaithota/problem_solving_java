package arrays;

import java.util.Scanner;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();

        int pos = binarySearchInRotatedArray(arr, num);
        System.out.println(pos);
    }

    private static int binarySearchInRotatedArray(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ( arr[mid] == num){
                return mid;
            }
            if (arr[low] <= arr[mid]){
                if ( num >= arr[low] && num < arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else {
                if ( num > arr[mid] && num <= arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
