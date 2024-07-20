package Patterns;

import java.util.Scanner;

public class Pattern_14 {

//    5
//            1
//            2 * 2
//            3 * 3 * 3
//            4 * 4 * 4 * 4
//            5 * 5 * 5 * 5 * 5
//            4 * 4 * 4 * 4
//            3 * 3 * 3
//            2 * 2
//            1

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst = 1;
        int number = 1;

        for (int row = 1; row <= n * 2 - 1; row++){


            for (int i = 1; i <= nst; i++){
                if (i % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(number+" ");
            }

            if( row < n){
                nst+=2;
                number++;
            }else {
                nst-=2;
                number--;
            }
            System.out.println();
        }
    }
}
