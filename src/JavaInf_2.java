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


    //97 ~ 122 : 소문자
    //65 ~ 90 : 대문자

/*    public static String InfSolution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) answer.append((char) (x - 32));
            else answer.append((char) (x + 32));
        }
        return answer.toString();
    }*/
}

