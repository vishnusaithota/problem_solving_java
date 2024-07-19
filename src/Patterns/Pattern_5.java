package Patterns;

import java.util.Scanner;

public class Pattern_5 {

    public static void main(String[] args) {


//        * * * * *
//          * * * *
//            * * *
//              * *
//                *


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp =  0;
        int nos = n;

        for (int row = 1; row <= n; row++){

            for(int csp = 1; csp <= nsp; csp++){
                System.out.print("  ");
            }

            for(int css = 1; css<= nos; css++)
                System.out.print("* ");

            nsp++;
            nos--;
            System.out.println();
        }
    }
}
