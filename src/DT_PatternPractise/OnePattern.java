package DT_PatternPractise;

import java.util.Scanner;

//6
//        1
//        1 1
//        1 1 1
//        1 0 0 1
//        1 1 1 1 1
//        1 0 0 0 0 1

public class OnePattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 1; row <= n; row++) {
            if (row % 2 != 0){
                for (int i = 0; i < row; i++) {
                    System.out.print("1 ");
                    continue;
                }
            }else {
                System.out.print("1 ");
                for (int i = 0; i < row-2; i++) {
                    System.out.print("0 ");
                }
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
