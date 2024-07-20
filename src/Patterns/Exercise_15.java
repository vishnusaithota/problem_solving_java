package Patterns;

import java.util.Scanner;

public class Exercise_15 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n, nsp = 0;

        for ( int i = 1; i <= 2*n-1; i++){

            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print("*\t");
            }

            if (i < n){
                nsp+=2;
                nst--;
            }else {
                nsp-=2;
                nst++;
            }
            System.out.println();
        }
    }
}
