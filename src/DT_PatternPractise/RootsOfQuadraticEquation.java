package DT_PatternPractise;

import java.util.Arrays;
import java.util.Scanner;

public class RootsOfQuadraticEquation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("Real and Distinct");
            int root1 = (int) Math.floor((-b + Math.sqrt(discriminant)) / (2 * a));
            int root2 = (int) Math.floor((-b - Math.sqrt(discriminant)) / (2 * a));
            if (root1 < root2) {
                System.out.println(root1 + " " + root2);
            } else {
                System.out.println(root2 + " " + root1);
            }
        } else if (discriminant == 0) {
            System.out.println("Real and Equal");
            int root = (int) Math.floor(-b / (2 * a));
            System.out.println(root + " " + root);
        } else {
            System.out.println("Imaginary");
        }
    }
}