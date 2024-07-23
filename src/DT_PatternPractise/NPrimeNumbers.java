package DT_PatternPractise;

import java.util.Scanner;

public class NPrimeNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        int[] ans = new int[testCases];
        int indx = 0;


        while ( testCases > 0 ){
            int n = s.nextInt();
            int count = 0;
            int num = 2;

            while (count < n) {
                if(isPrime(num)){
                    count++;
                }
                num++;
            }
            ans[indx] = num - 1;
            indx++;
            testCases--;
        }

        for (int x : ans){
            System.out.println(x);
        }

    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
