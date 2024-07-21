package DT_PatternPractise;

import java.util.Scanner;

public class Print_Series {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int count = 0;
        int i = 1;

        while( count < n1){
            int num = 3 * i + 2;
            if (num % n2 != 0){
                System.out.println(num);
                count++;
            }
            i++;
        }
}
}
