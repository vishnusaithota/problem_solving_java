import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = s.nextInt();

        int sum = 0;

        while (num > 0) {
            sum += num;
            num--;
        }

        System.out.println("The sum is " + sum);
    }
}
