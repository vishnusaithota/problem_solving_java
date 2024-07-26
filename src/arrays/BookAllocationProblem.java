package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocationProblem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0){
            s.nextLine();
           String mn = s.nextLine();
           int n = Integer.parseInt(mn.split(" ")[0]);
           int m = Integer.parseInt(mn.split(" ")[1]);
           int[] arr = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            findMinOfMaxPages(arr,n,m);
            t--;
        }



    }

    private static  void findMinOfMaxPages(int[] arr,int n, int m){
        int sum = 0;
        int max = 0;

        for (int x : arr){
            max = Math.max(max, x);
            sum = sum + x;
        }

        int low = max;
        int high = sum;
        int result = high;

        while (low <= high){
            int mid = (low + high) /2;
            if(isPossible(arr,n,m,mid)){
                high = mid - 1;
                result = mid;
            }else {
                low = mid + 1;
            }
        }
        System.out.println(result);
    }

    private static boolean isPossible(int[] arr, int noOfBooks, int noOfStudents, int mid) {
        int students = 1;
        int sum = 0;

        for (int j = 0; j < noOfBooks; j++) {
            if(sum + arr[j] > mid){
                sum = arr[j];
                students++;
                if(students > noOfStudents){
                    return false;
                }
            } else {
                sum = sum + arr[j];
            }
        }
        return true;
    }
}
