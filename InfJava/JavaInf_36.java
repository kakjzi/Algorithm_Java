package InfJava;

import java.util.Scanner;
import java.util.Stack;

public class JavaInf_36 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String[] bracket = n.split("");

        System.out.println(solution(bracket));
    }

    public static String solution(String[] bracket) {
        Stack<String> st = new Stack<>();

        for (String str : bracket) {

            if (st.isEmpty() && str.equals(")")) {
                return "NO";
            }

            if (!st.isEmpty() && !str.equals(st.peek())) {
                st.pop();
                continue;
            }
            st.push(str);
        }
        return st.isEmpty() ? "YES" : "NO";
    }
}