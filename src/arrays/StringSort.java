package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // Sort using a lambda function with custom comparison
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.startsWith(s2) || s2.startsWith(s1)) {
                return s2.length() - s1.length(); // longer first if one is prefix of the other
            }
            return s1.compareTo(s2); // lexicographical order otherwise
        });

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
