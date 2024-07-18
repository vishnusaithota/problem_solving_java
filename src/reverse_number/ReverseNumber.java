package reverse_number;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem = 0, reverse = 0;

        while (n > 0){
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        System.out.println(reverse);
    }
}
