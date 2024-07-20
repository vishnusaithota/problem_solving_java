package Patterns;

import java.util.Scanner;

public class Pattern_13 {

//    5
//                            1
//                        1	2	1
//                    1	2	3	2	1
//                1	2	3	4	3	2	1
//            1	2	3	4	5	4	3	2	1

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int nsp = n-1;
        int nst = 1;

        for (int row = 1; row <= n; row++){

            for (int i = 1; i <= nsp; i++){
                System.out.print("\t");
            }
            int number = 1;
            for (int i = 1; i <= nst; i++){
                System.out.print(number+"\t");
                if (i < row)
                    number++;
                else
                    number--;
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
