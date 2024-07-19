package Patterns;

import java.util.Scanner;

public class Pattern_12 {

//    4
//                        1
//                    2	3	4
//                5	6	7	8	9
//            10	11	12	13	14	15	16

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number = 1;
        int nsp = n-1;
        int nst = 1;

        for (int row = 1; row <= n; row++){

            for (int i = 1; i <= nsp; i++){
                System.out.print("\t");
            }

            for (int i = 1; i <= nst; i++){
                System.out.print(number+"\t");
                number++;
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
