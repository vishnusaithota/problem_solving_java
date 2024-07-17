import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag =  true;

        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}
