package Patterns;

import java.util.Scanner;

//7
//        1******
//        12*****
//        123****
//        1234***
//        12345**
//        123456*
//        1234567

public class Pattern17 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int nst = 1, nsp = n-1;

        for (int row = 0; row < n; row++) {

            for (int i = 1; i <= nst; i++) {
                System.out.print(i);
            }

            for (int i = 0; i < nsp; i++) {
                System.out.print("*");
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
