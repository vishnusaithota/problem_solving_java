import java.util.Scanner;

public class FtoCelcius {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minF = s.nextInt();
        int maxF = s.nextInt();
        int step = s.nextInt();
        for (int i = minF; i <= maxF; i+=step){
           int c = (int) ((5.0f/9) * (i - 32));
            System.out.println(i+ " "+ c);
        }
    }
}
