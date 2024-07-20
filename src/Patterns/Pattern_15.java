package Patterns;

import java.util.Scanner;

public class Pattern_15 {

//    pattern_6 in PDF

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1, nst = 5, nsp = 0;

        while (row <= n){

            for (int i = 1; i <= nsp; i++){
                System.out.print("  ");
            }

            for (int i = 1; i <= nst; i++){
                System.out.print("* ");
            }

            nsp+=2;
            nst--;
            row++;
            System.out.println();
        }
    }
}
