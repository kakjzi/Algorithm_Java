package InfJava;

import java.util.Scanner;
import java.util.Stack;

public class JavaInf_40 {
    public static void solution(String str) {
        int result = 0;
        int a = 0, b = 0, z = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (isOperator(x)) {
                b = stack.pop();
                a = stack.pop();
                z = postFix(a, b, x);
                stack.push(z);
            } else {
                stack.push(Character.getNumericValue(x));
            }
        }
        result = stack.pop();
        System.out.println(result);
    }

    public static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
            return true;
        }
        return false;
    }

    public static int postFix(int a, int b, char oper) {
        if (oper == '+') {
            return a + b;
        } else if (oper == '-') {
            return a - b;
        } else if (oper == '*') {
            return a * b;
        } else if (oper == '/') {
            return a / b;
        } else {
            return a % b;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        solution(str);
    }

}


/*
* 전위 표기법 - 연산자를 먼저 표시하고 연산에 필요한 피연산자를 나중에 표시하는 방법
* 후위 표기법 - 피연산자를 먼저 표시하고 연산자를 나중에 표시하는 방법
* 중위 표기법 - 연산자를 두 피연산자 사이에 표기하는 방법으로 가장 일반적으로 사용되는 표현 방법
 */