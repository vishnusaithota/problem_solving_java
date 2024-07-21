public class FtoCelcius {

    public static void main(String[] args) {

        for (int i = 20; i <= 300; i+=20){
           int c = (int) ((5.0f/9) * (i - 32));
            System.out.println(i+ " "+ c);
        }
    }
}
