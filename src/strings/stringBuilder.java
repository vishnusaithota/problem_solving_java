package strings;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("a");
        System.out.println(sb);
        sb.insert(3,"X");
        System.out.println(sb);
        sb.setCharAt(3,'Y');
        System.out.println(sb);
        sb.insert(sb.length(),"YDL");
        System.out.println(sb);
    }
}
