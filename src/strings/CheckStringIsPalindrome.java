package strings;

import java.util.Scanner;

public class CheckStringIsPalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString().equals(str));

    }
}
