package arrays;

import java.util.Scanner;

public class FindLowerAndUpperBound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 12, 17, 22};
        int lBound = getLowerBound(arr, 5);
        int uBound = getUpperBound(arr, 5);
        System.out.println(lBound);
        System.out.println(uBound);
    }

    private static int getUpperBound(int[] arr, int num) {
        int l = 0;
        int h = arr.length-1;
        int pos = -1;

        while ( l <= h){
            int mid = (l + h) / 2;

            if (arr[mid] == num){
                pos = mid;
                l = mid + 1;
            } else if (num > arr[mid]) {
                l = mid + 1;
            }else {
                h = mid - 1;
            }
        }
        return  pos;
    }

    public static int getLowerBound(int[] arr, int num){
        int l = 0;
        int h = arr.length-1;
        int pos = -1;

        while ( l <= h){
            int mid = (l + h) / 2;

            if (arr[mid] == num){
                pos = mid;
                h = mid -1;
            } else if (arr[mid] > num) {
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return  pos;
    }
}
