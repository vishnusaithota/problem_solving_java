package Patterns;

import java.util.Scanner;

public class Pattern_9 {

    public static void main(String[] args) {

//        9
//                *                               *
//                * *                           * *
//                * * *                       * * *
//                * * * *                   * * * *
//                * * * * *               * * * * *
//                * * * * * *           * * * * * *
//                * * * * * * *       * * * * * * *
//                * * * * * * * *   * * * * * * * *
//                * * * * * * * * * * * * * * * * *

//        special case for last row

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = 1;
        int nsp = n * 2 - 3;

        while (row <= n){

            for( int i = 1; i <= nst; i++) {
                System.out.print("* ");
            }

            for( int i = 1; i <= nsp; i++) {
                System.out.print("  ");
            }

            if (row == n){
                nst--;
            }

            for( int i = 1; i <= nst; i++) {
                System.out.print("* ");
            }

            nst++;
            nsp-=2;
            row++;
            System.out.println();
        }

    }
}
