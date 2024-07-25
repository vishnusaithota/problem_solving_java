package arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int num) {

        int low = 0, high = arr.length -1;


        while ( low <= high){
            int mid = (low + high) / 2;
            if (num > arr[mid]) {
                low++;
            } else if (num < arr[mid]) {
                high--;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
