package Patterns;

import java.util.Scanner;

public class Exercise_7 {

//    5
//            * * * * *
//            *       *
//            *       *
//            *       *
//            * * * * *



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for ( int i = 1; i <= n; i++){
            System.out.print("* ");
        }
        System.out.println();

        for ( int i = 1; i <= n-2; i++){
            System.out.print("* ");
            for (int j = 1; j <= n-2; j++)
                System.out.print("  ");
            System.out.println("* ");
        }


        for ( int i = 1; i <= n; i++){
            System.out.print("* ");
        }
    }
}
