package strings;

import java.util.Arrays;
import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        char result = getMaxFrequencyChar2(str);
//        char result = getMaxFrequencyChar(str);
//        System.out.println(result);
    }


    private static char getMaxFrequencyChar(String str) {
        int[] freq = new int[256]; // Assuming ASCII characters

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        // Find the character with the maximum frequency
        int maxFreq = 0;
        char maxChar = str.charAt(0);

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }


}