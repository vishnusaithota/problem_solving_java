package DT_PatternPractise;

import java.util.Scanner;

public class HollowDiamond {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int nst = n/2;
        int nsp = -1;

//        for (int i = 0; i < n; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();

        for (int row = 1; row <= n; row++) {

            for (int j = 0; j <= nst; j++) {
                if (row == 1 && j == nst)
                    break;
                System.out.print("* ");
            }
            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }

            if ( row == n){
                nst--;
            }
            for (int j = 0; j <= nst; j++) {
                System.out.print("* ");
            }

            if ( row <= n/2){
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
