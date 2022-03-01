package InfJava;

import java.util.Scanner;
import java.util.Stack;

public class JavaInf_37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.println(solution(n));
    }

    public static String solution(String n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char s : n.toCharArray()) {
            if (s == ('(') || Character.isAlphabetic(s)) {
                stack.push(s);
            } else {
                while (stack.pop() != '(') {
                }
            }
        }

        for (Character character : stack) {
            sb.append(character);
        }
        answer = String.valueOf(sb);

        return answer;
    }
}
