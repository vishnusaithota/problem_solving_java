package Patterns;

import java.util.Scanner;

public class GaneshPattern {

//    7
//            *     * * * *
//            *     *
//            *     *
//            * * * * * * *
//                  *     *
//                  *     *
//            * * * *     *

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 1; row <= n/2; row++) {
            System.out.print("* ");
            for (int i = 0; i < n/2 - 1; i++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if (row == 1){
                for (int i = 0; i < n/2; i++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int row = 1; row <= n/2; row++) {
            for (int i = 0; i < n/2; i++) {
                if(row == n/2){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            for (int i = 0; i < n/2 -1; i++) {
                System.out.print("  ");
            }
            System.out.print("* ");

            System.out.println();
        }
    }
}
