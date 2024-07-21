import java.util.Scanner;

public class CharInput {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);

        if ( c >= 'a' && c <= 'z')
            System.out.println("LOWER");
        else if (c >= 'A' && c<= 'Z') {
            System.out.println("UPPER");
        }else
            System.out.println("INVALID");
    }
}
