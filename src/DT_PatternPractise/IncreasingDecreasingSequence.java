package DT_PatternPractise;

import java.util.Scanner;

public class IncreasingDecreasingSequence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int i = 1;
        while( i < n && arr[i] < arr[i-1]){
            i++;
        }

        if (i == 1 || i == n){
            System.out.println("false");
            return;
        }

        while (i < n && arr[i] > arr[i-1]){
            i++;
        }

        if (i == n){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
