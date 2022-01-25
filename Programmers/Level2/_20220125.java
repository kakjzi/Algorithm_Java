package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

class _20220125 {
    int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};  // 상 하 좌 우

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            if (check(places[i])) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    boolean check(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (place[r].charAt(c) == 'P') {
                    if (!bfs(place, r, c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean bfs(String[] place, int row, int col) {
        boolean[][] visited = new boolean[5][5];
        Queue<Point> q = new LinkedList<>();
        visited[row][col] = true;
        q.add(new Point(row, col, 0));

        while (!q.isEmpty()) {
            Point curr = q.remove();

            if (curr.dist > 2) {
                continue;
            }
            if (curr.dist != 0 && place[curr.row].charAt(curr.col) == 'P') {
                return false;
            }
            for (int i = 0; i < 4; ++i) {
                int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
                if (nr < 0 || nr > 4 || nc < 0 || nc > 4) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (place[nr].charAt(nc) == 'X') {
                    continue;
                }
                visited[nr][nc] = true;
                q.add(new Point(nr, nc, curr.dist + 1));
            }
        }
        return true;
    }

    static class Point {
        int row, col, dist;

        Point(int r, int c, int d) {
            row = r;
            col = c;
            dist = d;
        }
    }
}
