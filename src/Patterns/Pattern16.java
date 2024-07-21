package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

//        5
//            1 2 3 4 5
//            1 2 3 4 *
//            1 2 3 * * *
//            1 2 * * * * *
//            1 * * * * * * *

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int nst = n, nsp = -1;
        for (int i = 0; i < n; i ++){

            for(int j = 1 ; j<= nst; j++)
                System.out.print(j+" ");

            for(int j = 1 ; j<= nsp; j++)
                    System.out.print("* ");


            nst--;
            nsp+=2;
            System.out.println();
        }
    }
}
