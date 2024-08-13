package strings;

import java.util.Scanner;

public class CamelCasing {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < 97){
                sb.append("\n");
            }
            sb.append(str.charAt(i));

        }

        System.out.println(sb);

    }
}
