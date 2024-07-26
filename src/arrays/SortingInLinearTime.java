package arrays;

import java.util.Scanner;

public class SortingInLinearTime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        linerSort(arr);

        for(int x : arr){
            System.out.println(x);
        }
    }

    private static void linerSort(int[] arr) {
        int l = 0, mid = 0, h = arr.length - 1;

        while (mid <= h){

            if (arr[mid] == 0){
                arr = swap(arr,mid,l);
                mid++;
                l++;
            } else if (arr[mid] == 1){
                mid++;
            }
            else {
                arr = swap(arr,mid, h);
                h--;
            }
        }
    }

    private static int[] swap(int[] arr, int mid, int l) {
        int temp = arr[mid];
        arr[mid] = arr[l];
        arr[l] = temp;
        return arr;
    }
}
