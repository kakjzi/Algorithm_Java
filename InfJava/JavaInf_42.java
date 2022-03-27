package InfJava;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JavaInf_42 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        int[] arr = Arrays.stream(input.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        System.out.println(solution(arr[0], arr[1]));
    }

    public static int solution(int total, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= total; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            if (queue.size() == 1) {
                answer = queue.poll();
                break;
            }
            queue.poll();
        }

        return answer;
    }
}
