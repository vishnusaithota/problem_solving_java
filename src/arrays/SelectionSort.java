package arrays;

public class SelectionSort {

    public static int[] SelectionPort(int[] arr){

        int len = arr.length;

        for (int counter = 0; counter < arr.length -1; counter++){
            int min = counter;
            for (int i = counter + 1; i < arr.length; i++){
                if (arr[min] > arr[i]){
                    min = i;
                }

            }
            int temp = arr[counter];
            arr[counter] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
