package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n = s.nextInt();
        s.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLine();
        }

        String[] ans = sortSalary(arr, n, num);

        for (String x : ans) {
            System.out.println(x);
        }
    }

    private static String[] sortSalary(String[] arr, int n, int num) {
        return Arrays.stream(arr)
                .filter(s -> Integer.parseInt(s.split(" ")[1]) >= num)
                .sorted((a, b) -> {
                    int salaryA = Integer.parseInt(a.split(" ")[1]);
                    int salaryB = Integer.parseInt(b.split(" ")[1]);
                    if (salaryA != salaryB) {
                        return salaryB - salaryA;
                    }
                    return a.split(" ")[0].compareTo(b.split(" ")[0]);
                })
                .toArray(String[]::new);
    }
}