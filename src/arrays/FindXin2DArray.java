package arrays;

import java.util.Scanner;

public class FindXin2DArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Create the matrix
        int[][] arr = new int[N][M];

        // Read the matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int num = scanner.nextInt();

        System.out.println(findNum(arr,num));

    }

    private static int findNum(int[][] arr, int num) {
        int rows = arr.length;
        int cols = arr[0].length;


        for (int i = 0; i < rows; i++) {
            if (num <= arr[i][cols - 1]) {
                if (num == arr[i][cols - 1]) return 1;
                else return binarySerch(arr[i], num);
            }
        }
        return 0;
    }

    private static int binarySerch(int[] ints, int num) {
        int l = 0;
        int h = ints.length-1;

        while ( l <= h){
            int mid = l + (h - l)/2;
            if (num == ints[mid]){
                return  1;
            } else if (num > ints[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return  0;
    }
}
