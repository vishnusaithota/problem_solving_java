package Patterns;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {

//        5
//                    1
//                  1 1 1
//                1 1 1 1 1
//              1 1 1 1 1 1 1
//            1 1 1 1 1 1 1 1 1


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1, nsp = n-1;
        for (int i = 1; i <= n; i++){

            for (int csp = 1; csp <= nsp; csp++){
                System.out.print("  ");
            }

            for (int cst = 1; cst <= nst; cst++){
                System.out.print("1 ");
            }

            nsp--;
            nst+=2;
            System.out.println();
        }

    }

}
