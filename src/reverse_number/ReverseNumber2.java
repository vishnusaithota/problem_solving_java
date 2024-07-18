package reverse_number;

public class ReverseNumber2 {

    public static void main(String[] args){
        int num = 123678;

        String rev = new StringBuilder(Integer.toString(num)).reverse().toString();
        System.out.println(rev);
        int revnum = Integer.parseInt(rev);
        System.out.println(revnum);
    }


}
