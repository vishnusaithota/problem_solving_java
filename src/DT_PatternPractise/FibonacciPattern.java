package DT_PatternPractise;

import java.util.Scanner;

//4
//        0
//        1 1
//        2 3 5
//        8 13 21 34

public class FibonacciPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }
}
