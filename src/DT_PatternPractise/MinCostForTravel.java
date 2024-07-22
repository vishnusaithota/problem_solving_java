package DT_PatternPractise;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostForTravel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = Integer.parseInt(s.nextLine());

        while (testCases > 0) {
//            int[] cost = getCost(s);
            int [] cost = getCostUsingStreams(s);
            int[] noOfRandC = getCostUsingStreams(s);
            int n = noOfRandC[0];
            int m = noOfRandC[1];
            int[] timeOfRUse = getCostUsingStreams(s);
            int[] timeOfCabUse = getCostUsingStreams(s);

            int minCostofR = getMinCostOfR(cost,n,timeOfRUse);
            int minCostOfCab = getMinCostOfCab(cost, m, timeOfCabUse);

            int totalMinCost = Math.min(minCostOfCab+minCostofR,cost[3]);

            System.out.println(totalMinCost);

            testCases--;
        }
    }

    private static int getMinCostOfR(int[] cost, int n, int[] timeOfRUse) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            int mincostofi = Math.min(timeOfRUse[i] * cost[0],cost[1]);
            total = total + mincostofi;
        }
        return Math.min(total, cost[2]);
    }

    private static int getMinCostOfCab(int[] cost, int m, int[] timeOfCabUse) {
        int total = 0;
        for (int i = 0; i < m; i++) {
            int mincostofi = Math.min(timeOfCabUse[i] * cost[0],cost[1]);
            total = total + mincostofi;
        }
        return Math.min(total, cost[2]);
    }

    private static int[] getCostUsingStreams(Scanner s) {
        String c = s.nextLine();
        return Arrays.stream(c.split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static int[] getCost(Scanner s) {
        String c = s.nextLine();
        String[] split = c.split(" ");
        int[] cost = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            cost[i] = Integer.parseInt(split[i]);
        }

        return cost;
    }


}
