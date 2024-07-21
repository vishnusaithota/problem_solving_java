package Patterns;

import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {

//        5
//            5 4 3 2 1 0 1 2 3 4 5
//              4 3 2 1 0 1 2 3 4
//                3 2 1 0 1 2 3
//                  2 1 0 1 2
//                    1 0 1
//                      0
//                    1 0 1
//                  2 1 0 1 2
//                3 2 1 0 1 2 3
//              4 3 2 1 0 1 2 3 4
//            5 4 3 2 1 0 1 2 3 4 5


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int rows = 2 * n + 1;
        int nsp = 0;
        int nst = n;

        for (int row = 1; row <= rows; row++) {

            if (row == n+1){
                nsp = n;
                nst = 0;
            }
//

            for (int i = 0; i < nsp; i++) {
                System.out.print("  ");

            }

            for (int i = nst; i >= 0; i--) {
                System.out.print(i+" ");
            }

            for (int i = 1; i <= nst; i++) {
                System.out.print(i+" ");
            }


            if (row < n){
                nst--;
                nsp++;
            } else {
                nst++;
                nsp--;
            }

            System.out.println();
        }
    }
}
