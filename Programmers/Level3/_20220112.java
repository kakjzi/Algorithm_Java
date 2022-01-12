package Programmers.Level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _20220112 {
    public static void main(String[] args) {
        _20220112 m = new _20220112();
        int n = 6;
        int[][] vertex = {
                {3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}
        };
        m.solution(n, vertex);
    }

    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        //create graph template
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        int vertex1;
        int vertex2;
        for (int i = 0; i < edge.length; i++) {
            vertex1 = edge[i][0];
            vertex2 = edge[i][1];

            // connect node ,(노드가 서로 연결되어있는지 확인 편함)
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }
        return bfs(n, graph);
    }

    public int bfs(int n, ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];
        int cnt = 0;
        int startNode = 1;
        Queue<Integer> q = new LinkedList<>();

        q.offer(startNode);
        visited[startNode] = true;

        int nextNode;
        int maxDist = 0;
        while (!q.isEmpty()) {
            int curNode = q.poll();

            for (int i = 0; i < graph.get(curNode).size(); i++) {
                nextNode = graph.get(curNode).get(i);

                if (!visited[nextNode]) {
                    distance[nextNode] = distance[curNode] + 1;
                    q.offer(nextNode);
                    visited[nextNode] = true;
                    maxDist = Math.max(maxDist, distance[nextNode]);
                }
            }
        }

        for (int d : distance) {
            if (maxDist == d) {
                cnt++;
            }
        }
        return cnt;
    }

}

