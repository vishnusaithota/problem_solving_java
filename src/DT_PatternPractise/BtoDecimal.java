package DT_PatternPractise;

import java.util.Scanner;

public class BtoDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        StringBuilder str = new StringBuilder();

        while(t > 0) {
            int n = s.nextInt();
            int num = getBinary(n);
            str.append(num).append("\n");

            t--;
        }
        System.out.println(str);
    }

    private static int getBinary(int n) {
        int num = 0;
        int base = 2;
        int pow = 0;
        while (n > 0){
            int x = (n % base) * (int)Math.pow(base,pow);
            num = num + x;
            n = n / 10;
            pow++;
        }

        return num;
    }
}
