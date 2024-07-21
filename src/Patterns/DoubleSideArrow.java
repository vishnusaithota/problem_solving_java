package Patterns;

import java.util.Scanner;

public class DoubleSideArrow {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1, nsp = n - 1;
        int nsp2 = 1, nst2=2;
        int num;

        for ( int i = 1; i <= n; i++){

            if ( i <= n/2){
                num = i;
            } else {
                num = n - i +1;
            }

            for ( int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }

            for ( int j = 1; j <= nst; j++){
                System.out.print(num+" ");
                num--;
            }

            if ( i > 1 && i < n){
                for (int j = 1; j <= nsp2; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= nst2; j++) {
                    System.out.print(j+" ");
                }
                if ( i <= n/2 ){
                    nsp2+=2;
                    nst2++;
                }else {
                    nsp2-=2;
                    nst2--;
                }

            }

            if ( i <= n/2 ){
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
