package strings;

import java.util.Scanner;

public class StringCompressions {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1)){
                count++;
            } else {
                sb.append(str.charAt(i-1));
                if ( count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        sb.append(str.charAt(str.length()-1));
        if (count > 1){
            sb.append(count);
        }

        System.out.println(sb);
    }
}
