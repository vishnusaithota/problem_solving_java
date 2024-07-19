package Patterns;

import java.util.Scanner;

public class Pattern_11 {

//    5
//            1
//          2 2 2
//        3 3 3 3 3
//      4 4 4 4 4 4 4
//    5 5 5 5 5 5 5 5 5


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int number = 1;
        int nsp = n-1;
        int nst = 1;

        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("  ");
                csp++;
            }

            int cst = 1;
            while(cst <= nst){
                System.out.print(number+" ");
                cst++;
            }
            nsp--;
            nst+=2;
            number++;
            row++;
            System.out.println();
        }
    }
}
