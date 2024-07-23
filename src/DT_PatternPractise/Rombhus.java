package DT_PatternPractise;

import java.util.Scanner;

//5
//            *****
//           *   *
//          *   *
//         *   *
//        *****


public class Rombhus {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nsp = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int i = 0; i <= nsp; i++) {
                System.out.print(" ");
            }
            if (row == 1 || row == n) {
                for (int i = 0; i < n; i++) {
                    System.out.print("*");

                }
                System.out.println();
                nsp--;
                continue;
            } else {
                System.out.print("*");
                for (int i = 0; i < n - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                nsp--;
                System.out.println();
            }
        }
    }}

