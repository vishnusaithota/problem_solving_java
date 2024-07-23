package DT_PatternPractise;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String[] ans = new String[N];

        for (int i = 0; i < N; i++) {
            int carNumber = s.nextInt();
            if (isAllowed(carNumber)) {
                ans[i] = "Yes";
            } else {
                ans[i] = "No";
            }
        }

        for (String result : ans) {
            System.out.println(result);
        }

        s.close();
    }

    private static boolean isAllowed(int carNumber) {
        int sumEven = 0;
        int sumOdd = 0;

        while (carNumber > 0) {
            int digit = carNumber % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            carNumber /= 10;
        }

        return (sumEven % 4 == 0) || (sumOdd % 3 == 0);
    }
}