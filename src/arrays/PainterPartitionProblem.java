package arrays;

import java.util.Scanner;

public class PainterPartitionProblem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfPainters = s.nextInt();
        int noOfBoards = s.nextInt();
        int[] boards = new int[noOfBoards];
        for (int i = 0; i <noOfBoards; i++) {
            boards[i] = s.nextInt();
        }

        int ans = minTimeToPaintAllBoards(boards,noOfPainters);
        System.out.println(ans);
    }

    private static int minTimeToPaintAllBoards(int[] boards, int noOfPainters) {
        int max = 0;
        int total = 0;
        int result = 0;

        for( int x : boards){
            max = Math.max(max, x);
            total += x;
        }

        while (max <= total){
            int mid = max + (total-max)/2;
            if(isFeasable(boards,mid,noOfPainters)){
                result = mid;
                total = mid - 1;
            }else {
                max = mid + 1;
            }
        }

        return result;
    }

    private static boolean isFeasable(int[] boards, int maxHours, int noOfPainters) {
//        int len = boards.length;
        int painter = 1;
        int maxWork = 0;

        for (int i = 0; i < boards.length; i++) {
            int x = maxWork + boards[i];

            if(x > maxHours){
                maxWork = boards[i];
                painter++;
                if( painter > noOfPainters){
                    return  false;
                }
            }else {
                maxWork = maxWork + boards[i];
            }

        }
        return true;
    }


}
