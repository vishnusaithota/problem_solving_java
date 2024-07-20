package Patterns;

import java.util.Scanner;

public class Exercise_12 {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

       int nst = 1;
       int nsp = n-1;
       int row = 1;

       while ( row <= n){

           for (int i = 0; i < nsp; i++) {
               System.out.print("  ");
           }

           for (int i = 1; i <= nst; i++) {
               if (i % 2 == 0)
                   System.out.print("! ");
               else
                   System.out.print("* ");

           }

           nsp--;
           nst+=2;
           row++;
           System.out.println();
       }
    }
}
