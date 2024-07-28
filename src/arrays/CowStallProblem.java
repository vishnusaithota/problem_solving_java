package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CowStallProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stalls = s.nextInt();
        int cows = s.nextInt();
        int[] stall = new int[stalls];
        for (int i = 0; i < stalls; i++) {
            stall[i] = s.nextInt();
        }
        Arrays.sort(stall);

        int ans = getMaxDistance(stall, stalls, cows);
        System.out.println(ans);
    }

    private static int getMaxDistance(int[] stall, int stalls, int cows) {
        int min = 1;
        int max = stall[stalls - 1] - stall[0];
        int result = 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (canFitCows(stall, mid, cows, stalls)) {
                min = mid + 1;
                result = mid;
            } else {
                max = mid - 1;
            }
        }
        return result;
    }

    private static boolean canFitCows(int[] stall, int maxDistance, int cows, int stalls) {
        int cow = 1;
        int pos = stall[0];

        for (int i = 1; i < stalls; i++) {
            if (stall[i] - pos >= maxDistance){
                cow++;
                pos = stall[i];
                if (cow == cows){
                    return true;
                }
            }
        }
        return false;
    }


}
