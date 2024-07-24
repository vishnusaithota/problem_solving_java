package section3;

import java.util.Scanner;

public class DecimaltoAnyBase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int base = s.nextInt();

        int decimalNumber = getNum(num,base);
        System.out.println(decimalNumber);
    }

    private static int getNum(int num, int base) {
        int pow = 0;
        int ans = 0;
        while (num > 0){
            int r = num % base;
            ans = (int) (ans + r * Math.pow(10,pow));
            pow++;
            num /= base;
        }
        return ans;
    }
}
