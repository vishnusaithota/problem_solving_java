package arrays;

import java.util.Scanner;

public class arrayutils {

    public static int[][] getinputsfor2Darray(){
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
        return  arr;
    }
}
