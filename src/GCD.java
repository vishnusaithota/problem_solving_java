import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" enter n1 : ");
        int dividend = s.nextInt();
        System.out.print(" enter n2 : ");
        int divisor = s.nextInt();

//        int dividend = Math.max(num1, num2);
//        int divisor = Math.min(num1,num2);

        while (dividend % divisor != 0){
            int reminder = dividend % divisor;
            dividend = divisor;
            divisor = reminder;
        }

        System.out.println("The GCD is " + divisor);
        System.out.println(40 % 12);
        System.out.println(12% 40);
    }
}
