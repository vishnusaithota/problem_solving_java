package DT_PatternPractise;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        while(s.hasNext()){
            int n = s.nextInt();
            sum = sum + n;
            if (sum < 0){
                break;
            }
            builder.append(n).append("\n");
        }
        System.out.println(builder.toString());
    }
}
