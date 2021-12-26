import java.util.Scanner;

public class JavaInf_2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }

    public static String solution(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            sb.append(Character.isUpperCase(c)? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return sb.toString();
    }
}

