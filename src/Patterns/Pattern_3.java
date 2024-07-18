package Patterns;

import java.util.Scanner;

public class Pattern_3 {

//    Pattern
//
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" enter no of rows : ");
        int numberOfRows = s.nextInt();

        for (int i = numberOfRows; i >0; i--){
            for (int j = i; j> 0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
