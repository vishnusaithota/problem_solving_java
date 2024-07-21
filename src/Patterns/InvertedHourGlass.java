package Patterns;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class InvertedHourGlass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int nsp = 2 * n - 1;

        for (int row = 1; row <= (2 * n + 1); row++) {
            int num = n;

            for (int i = 1; i <= nst; i++) {
                System.out.print(num+" ");
                num--;
            }

            for (int i = 1; i <= nsp; i++) {
                System.out.print("  ");
            }

            if (row == n+1){
                num++;
            }

            for (int i = 1; i <= nst; i++) {
                if( row == n+1 && i == nst)
                    break;
                num++;
                System.out.print(num+" ");

            }

            if ( row <= n){
                nsp-=2;
                nst++;
            } else {
                nsp+=2;
                nst--;
            }
            System.out.println();
        }
    }
}
