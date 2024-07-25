package arrays;

public class WavePrint {
    public static void main(String[] args) {

        int[][] arr = { {1, 2, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12, 13},
                {14, 15, 16, 17}};


        int cols = arr[0].length-1;
        int row = arr.length;

        for (int i = 0; i < row; i++) {

            if ((i + 1) % 2 == 0){
                for (int j = cols; j >= 0; j--) {
                    System.out.print(arr[i][j]+ " ");
                }
            } else {
                for (int j = 0; j <= cols; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }

//        int top = 0;
//        int bottom = arr.length - 1;
//        int left = 0;
//        int right = arr[0].length - 1;
//
//        while (top <= bottom && left <= right){
//
//            for (int i = 0; i <= right; i++) {
//                System.out.print(arr[top][i]+" ");
//            }
//            top++;
//
//
//
//            if (top <= bottom){
//                for (int i = right; i >= left; i--){
//                    System.out.print(arr[top][i]+" ");
//                }
//                top++;
//            }
//        }
    }
}
