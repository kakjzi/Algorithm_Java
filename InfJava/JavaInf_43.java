package InfJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JavaInf_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        System.out.println(solution(input1, input2));
    }

    public static String solution(String role, String plan) {
        Queue<String> queue = new LinkedList<>();
        int expectSeq = -1, realSeq = 0;

        for (char i : role.toCharArray()) {
            queue.offer(String.valueOf(i));
        }

        while (!queue.isEmpty()) {
            realSeq = plan.indexOf(queue.poll());
            if (realSeq > expectSeq) {
                expectSeq = realSeq;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
