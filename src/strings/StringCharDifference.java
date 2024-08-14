package strings;

import java.util.Scanner;

public class StringCharDifference {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length()-1; i++) {
            int dif = str.charAt(i+1) - str.charAt(i);
            sb.append(str.charAt(i));
            sb.append(dif);
        }

        sb.append(str.charAt(str.length()-1));

        System.out.println(sb);
    }
}
