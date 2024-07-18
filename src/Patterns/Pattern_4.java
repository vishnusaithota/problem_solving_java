package Patterns;

import java.util.Scanner;

public class Pattern_4 {

    public static void main(String[] args){

//        Pattern_4
//                  *
//                * *
//              * * *
//            * * * *
//          * * * * *
//        * * * * * *
//      * * * * * * *
//    * * * * * * * *
//  * * * * * * * * *
//* * * * * * * * * *


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1, noOfSpaces = n - 1, noOfStars = 1;

        while (row <= n) {
            int csp = 1;
            while (csp <= noOfSpaces) {
                System.out.print("  ");
                csp++;
            }
            int stars = 1;
            while (stars <= noOfStars ){
                System.out.print("* ");
                stars++;
            }
            System.out.print("\n");
            row++;
            noOfStars++;
            noOfSpaces--;
        }
    }
}
