package DT_PatternPractise;

import java.util.Scanner;
//
//4
//              1
//            2 3 2
//          3 4 5 4 3
//        4 5 6 7 6 5 4

public class PatternTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nsp = n-1;
        int nst = 1;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }
            int num2 = num;
            for (int j = 0; j < nst; j++) {

                System.out.print(num2+" ");
                if ( j < nst/2)
                    num2++;
                else
                    num2--;
            }
            nst+=2;
            num++;
            nsp--;
            System.out.println();
        }
    }
}
