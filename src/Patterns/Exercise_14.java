package Patterns;

import java.util.Scanner;

public class Exercise_14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1, nsp = n-1;

        for ( int i = 1; i <= 2*n-1; i++){

            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print("* ");
            }

            if (i < n){
                nsp--;
                nst++;
            }else {
                nsp++;
                nst--;
            }
            System.out.println();
        }
    }
}
