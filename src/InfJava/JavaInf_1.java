package InfJava;

import java.util.Scanner;

public class JavaInf_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        JavaInf_1 t = new JavaInf_1();
        System.out.println(t.solution(input1, input2));
    }

    public int solution(String str, char ch) {
        int answer = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                answer ++;
            }
        }
        return answer;
    }
}