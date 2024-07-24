package section3;

import java.util.Scanner;

public class AnyBasetoDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int base = s.nextInt();

        int decimalNumber = getDecimal(num,base);
        System.out.println(decimalNumber);
    }

    private static int getDecimal(int num, int base) {
        int pow = 0;
        int ans = 0;
        while (num > 0){
            int r = num % 10;
            ans = (int) (ans + r * Math.pow(base,pow));
            pow++;
            num /= 10;
        }
        return ans;
    }
}
