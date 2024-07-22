package DT_PatternPractise;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit = s.nextInt();
        String number = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if( Integer.parseInt(String.valueOf(number.charAt(i))) == digit)
                count++;
        }

        System.out.println(count);
    }
}
