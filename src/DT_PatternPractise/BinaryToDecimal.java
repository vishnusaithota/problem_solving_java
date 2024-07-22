package DT_PatternPractise;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int base = 10;
        int from = 2;
        int pow = 0;
        int num = 0;
        while (n > 0){
            int quotient = n / base;
            int x = (n % base) * (int)Math.pow(from,pow);
            num = num + x;
            n = n / 10;
            pow++;
        }
        System.out.println(num);
    }
}
