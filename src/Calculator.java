import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n1, n2;

        while (true){
            char ch = s.next().charAt(0);
            if ( ch == '+' || ch == '-' ||
                    ch == '/' || ch == '*' || ch == '%'){
                n1 = s.nextInt();
                n2 = s.nextInt();

                switch (ch) {
                    case '*' :
                        System.out.println(n1 * n2);
                        break;
                    case '/' :
                        System.out.println((double) n1 / n2);
                        break;
                    case '+' :
                        System.out.println(n1 + n2);
                        break;
                    case '-' :
                        System.out.println(n1 - n2);
                        break;
                    case '%' :
                        System.out.println(n1 % n2);
                        break;
                }
            } else if (ch == 'X' || ch == 'x') {
                break;
            }else {
                System.out.println("Invalid operation. Try again.");
            }


        }

    }
}
