import java.lang.reflect.Array;
import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        if ( N <= 0){
            System.out.println("-1");
            return;
        }

        if (N % 2 == 0) {
            int m = N / 2;
            int n = 1;
            int a = m * m - n * n;
            int b = N;
            int c = m * m + n * n;
            printInIncreasingOrder(a,c);
        } else {
            // Check if N is odd
            int m = (N + 1) / 2;
            int n = (N - 1) / 2;
            int a = N;
            int b = 2 * m * n;
            int c = m * m + n * n;
            printInIncreasingOrder(b,c);
        }
    }

    public static void printInIncreasingOrder(int a, int b) {
        int[] pair = {a, b};
        java.util.Arrays.sort(pair);
        System.out.println(pair[0] + " " + pair[1]);
    }
}