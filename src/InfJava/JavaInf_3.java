package InfJava;

import java.util.Scanner;

public class JavaInf_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    //next() 공백 전
    //nextLine() Enter 전
    public static String solution(String str) {
        String[] array = str.split(" ");
        String answer = "";
        for (String s : array) {
            answer = (s.length() > answer.length()) ? s : answer;
        }
        return answer;
    }
}
