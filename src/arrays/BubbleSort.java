package arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        int len = arr.length-1;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag){
                return arr;
            }
        }

        return arr;
    }
}
