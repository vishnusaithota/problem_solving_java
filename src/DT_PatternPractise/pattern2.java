package DT_PatternPractise;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s. nextInt();

        for (int row = 1; row <= n; row++){
            if (row == 1){
                System.out.print("1");
            }else {
                System.out.print(row - 1);
                for (int i = 0; i < row-2; i++) {
                    System.out.print("0");
                }
                System.out.print(row - 1);
            }
            System.out.println();
        }
    }
}
