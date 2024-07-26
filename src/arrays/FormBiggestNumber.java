package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FormBiggestNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0){
            int size = s.nextInt();
            s.nextLine();
            String[] arr = s.nextLine().split(" ");
            System.out.println(formLargest(arr));
            t--;
        }
    }

//    private static String formLargestNumber(String[] arr) {
//        Arrays.sort(arr,(a, b) -> (b+a).compareTo(a+b));
//        return String.join("",arr);
//    }

    private static String formLargest(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int numa = Integer.parseInt(arr[j] + arr[j + 1]);
                int numb = Integer.parseInt(arr[j + 1] + arr[j]);


                if (numa < numb) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        if (arr[0].equals("0"))
            return "0";
        return String.join("", arr);
    }
}
