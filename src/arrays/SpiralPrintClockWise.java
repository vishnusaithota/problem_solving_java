package arrays;

import java.util.Scanner;

public class SpiralPrintClockWise {
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

        printSpiral(arr,M,N);
    }

    private static void printSpiral(int[][] arr, int m, int n) {
        int left = 0;
        int right = arr[0].length - 1;
        int top = 0;
        int bottom = arr.length - 1;

        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left ; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }

            if (left <= right){
                for (int i = bottom; i >= top ; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }

        }

    }
}
