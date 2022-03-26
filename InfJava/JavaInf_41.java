package InfJava;

import java.util.Scanner;
import java.util.Stack;

public class JavaInf_41 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
                continue;
            }

            stack.pop();

            if (str.charAt(i - 1) == '(') {
                answer += stack.size();
                continue;
            }

            answer++;
        }
        return answer;
    }
}
