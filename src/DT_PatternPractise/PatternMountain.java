package DT_PatternPractise;

import java.util.Scanner;

public class PatternMountain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int nsp = n + 1;
        int nst = 1;

        for (int row = 0; row < n; row++) {

            for (int i = 1; i <= nst; i++) {
                System.out.print(i+" ");
            }

            for (int i = 0; i < nsp; i++) {
                System.out.print("  ");
            }

            if (  row == n - 1){
                nst--;
            }

            for (int i = nst; i > 0; i--) {
                System.out.print(i+" ");
            }

            nst++;
            nsp-=2;
            System.out.println();
        }
    }
}
