package Patterns;

public class Pattern_2 {


//    Pattern_2
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

    public static void main(String[] args) {

        int n = 5;
        int rows= 1;


        while (rows <= n){
            int noOfStars = 1;
            while (noOfStars <= rows){
                System.out.print("* ");
                noOfStars++;
            }
            System.out.println();
            rows++;
        }
    }
}
