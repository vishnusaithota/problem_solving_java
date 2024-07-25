package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ops {

    public static void main(String[] args) {

//        int[] arr = getInputs();
        int[] arr = {1, 2, 4, 4, 7, 3, 11};
//        Arrays.sort(arr);
//        printArray(arr);
//        printArray(arr);
//        System.out.println(getMax(arr));
//        System.out.println(linearSearch(arr, 2));
//        System.out.println(BinarySearch.binarySearch(arr, 7));
//        System.out.println(BinarySearch.binarySearch(arr, 2));
//        System.out.println(BinarySearch.binarySearch(arr, 12));
//        System.out.println(BinarySearch.binarySearch(arr, 10));

        printArray(BubbleSort.bubbleSort(arr));

    }

    public static int[] getInputs(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr){
        for (int x : arr){
            System.out.println(x);
        }
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            max = Math.max(j, max);
        }
        return max;
    }

    public static int linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return  -1;
    }
}
