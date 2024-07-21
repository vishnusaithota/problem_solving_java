package DT_PatternPractise;

import java.util.Scanner;

//6
//        1
//        1	1
//        1	2	1
//        1	3	3	1
//        1	4	6	4	1
//        1	5	10	10	5	1

public class Pascals_Triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int i = 0; i <= row; i++) {
                if ( i == 0 || i == row)
                    arr[row][i] = 1;
                else {
                    arr[row][i] = arr[row-1][i-1] + arr[row-1][i];
                }
                System.out.print(arr[row][i]+"\t");
            }
            System.out.println();
        }
    }
}
