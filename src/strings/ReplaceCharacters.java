package strings;

import java.util.Scanner;

public class ReplaceCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String s = scanner.next();

        // Maximum length when converting 'a' to 'b' or vice versa
        int maxLengthA = findMaxLength(s, k, 'a');
        int maxLengthB = findMaxLength(s, k, 'b');

        // The answer is the maximum of these two lengths
        System.out.println(Math.max(maxLengthA, maxLengthB));
    }

    private static int findMaxLength(String s, int k, char ch) {
        int maxLength = 0;
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != ch) {
                count++;
            }

            // If we have more than k different characters, shrink the window from the left
            while (count > k) {
                if (s.charAt(left) != ch) {
                    count--;
                }
                left++;
            }

            // Calculate the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
