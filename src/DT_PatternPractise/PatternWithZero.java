package DT_PatternPractise;

import java.util.Scanner;

//6
//        1
//        2	2
//        3	0	3
//        4	0	0	4
//        5	0	0	0	5
//        6	0	0	0	0	6


public class PatternWithZero {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int nsz = -1;
        int num = 1;

        for (int row = 1; row <= n; row++) {
            if (row == 1){
                System.out.print(num+"\t");
                System.out.println();
                nsz++;
                num++;
                continue;
            }
                System.out.print(num+"\t");
                for (int i = 0; i < nsz; i++) {
                    System.out.print("0\t");
                }
                System.out.print(num+"\t");

            num++;
            nsz++;
            System.out.println();
        }
    }
}
