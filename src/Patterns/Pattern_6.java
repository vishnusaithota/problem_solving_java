package Patterns;

import java.util.Scanner;

public class Pattern_6 {

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
//            * * * * * * *
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        int row = 1;
//        int nst =  n-1;
//
//        while (row <= n-1) {
//            int cst = 1;
//            while (cst <= nst){
//                System.out.print("* ");
//                cst++;
//            }
//            System.out.println();
//            nst--;
//            row++;
//        }

    }
}
