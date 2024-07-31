package arrays;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        arr = insertionSort(arr,n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] insertionSort(int[] arr, int n) {
        int counter = 1;

        for (counter = 1; counter < arr.length; counter++){
            int val = arr[counter];
            int j = counter - 1;
            while (j>= 0 && arr[j] > val){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        return  arr;
    }
}
