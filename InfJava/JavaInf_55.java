package InfJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JavaInf_55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int S = in.nextInt();
        int E = in.nextInt();

        System.out.println(bfs(S, E));
    }

    /**
     * @param S : 현수 위치
     * @param E : 송아지 위치
     * @return : 점프 최소 횟수
     */
    public static int bfs(int S, int E) {
        int[] distance = {-1, 1, 5};  // 현수가 한번 점프로 움직일 수 있는 거리
        boolean[] visited = new boolean[10001];
        int depth = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(S);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int n = q.poll();  // 현재 현수 위치

                for (int j : distance) {
                    int movePos = n + j; // 1, -1, 5 옵션으로 송아지 위치 도달하는지

                    if (movePos == E) {
                        return depth + 1;
                    }

                    // 1<= movePos <=10,000
                    if (movePos >= 1 && movePos <= 10000 && !visited[movePos]) {
                        visited[movePos] = true;
                        q.offer(movePos);
                    }
                }
            }
            depth++;
        }
        return -1;
    }
}