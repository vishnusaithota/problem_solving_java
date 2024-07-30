package arrays;

import java.util.Scanner;

public class WavePrintColumnWise {
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


        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]+", ");
                }
            }else {
                for (int j = arr.length-1; j >= 0; j--) {
                    System.out.print(arr[j][i]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
