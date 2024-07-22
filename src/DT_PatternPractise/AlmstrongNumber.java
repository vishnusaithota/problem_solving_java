package DT_PatternPractise;

import java.util.Scanner;

public class AlmstrongNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        int sum = 0;
        int len = String.valueOf(n).length();

        while (n > 0){
            int r = n % 10;
            sum = sum + (int)Math.pow(r,len);
            n = n / 10;
        }

        if (sum == num){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

