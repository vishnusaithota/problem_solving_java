package Patterns;

import java.util.Scanner;

public class Pattern_7 {

//    9
//            * * * *   * * * *
//            * * *       * * *
//            * *           * *
//            *               *
//
//            *               *
//            * *           * *
//            * * *       * * *
//            * * * *   * * * *



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = n/2;
        int nsp = 1;
        while (row <= n){
            for (int i = 1; i <= nst; i++)
                System.out.print("* ");
            for (int i = 1; i <= nsp; i++)
                System.out.print("  ");
            for (int i = 1; i <= nst; i++)
                System.out.print("* ");

            if (row < n/2 + 1){
                nst--;
                nsp+=2;
            }else {
                nst++;
                nsp-=2;
            }
            System.out.println();
            row++;
        }
    }
}
