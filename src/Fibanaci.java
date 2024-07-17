import java.util.Scanner;

public class Fibanaci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0,b = 1;
        int temp = 0;

        if (n == 1) {
            System.out.println(a);
        }
        int i = 0;
        while (i < n) {
            System.out.print(a+" ");
            temp = a + b;
            a = b;
            b = temp;

            i++;
        }


    }
}
