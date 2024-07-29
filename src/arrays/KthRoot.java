package arrays;

import java.util.Scanner;

public class KthRoot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            long n = s.nextLong();
            long k = s.nextLong();

            long ans = findKthRoot(n, k);
            System.out.println(ans);
            t--;
        }
    }

    private static long findKthRoot(long n, long k) {
        long high = n;
        long low = 1;
        long result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isValidPower(mid, k, n) ){
                result =  mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return  result;
    }

    private static boolean isValidPower(long mid, long k, long n) {
        long result = 1;
        for (int i = 0; i < k; i++) {
            if (result > n/mid){
                return  false;
            }
            result = result * mid;

        }
        return true;
    }
}
