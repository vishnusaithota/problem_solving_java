package arrays;

import java.util.Scanner;

public class CalCulateDiscount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int X = s.nextInt();
        int Y = s.nextInt();

        int totalCouponsRequired = M * X;

        if (totalCouponsRequired <= M){
            System.out.println(N);
        } else {
            int additionalCoupons  = totalCouponsRequired - M;

        }
    }
}
