package Programmers.Level2;

import java.util.Stack;

public class _20220112 {
    public int solution(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char i : ch) {
            if (!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
                continue;
            }
            stack.push(i);
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
