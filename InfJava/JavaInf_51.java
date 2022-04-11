package InfJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaInf_51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pointSize = in.nextInt();

        ArrayList<Point> pointList = new ArrayList<Point>();

        for (int i = 0; i < pointSize; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            pointList.add(new Point(x, y));
        }

        Collections.sort(pointList);

        for (Point point : pointList) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point implements Comparable<Point> {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }
}

/*
Map 은 기본적으로 Key 중복이 되지 않는다.

기존 풀이
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        int[][] posXY = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.nextLine());
            posXY[i][0] = Integer.parseInt(st.nextToken());
            posXY[i][1] = Integer.parseInt(st.nextToken());
        }

        solution(posXY).forEach((key, value) -> System.out.println(key + value));
    }

    // IDEA: 원래 배열과 정렬한 배열을 비교하면서 다른 인덱스(+1) 추가
    public static Map<Integer, Integer> solution(int[][] posXY) {
        Map<Integer, Integer> answer = new TreeMap<>();

        for (int[] i : posXY) {
            answer.put(i[0], i[1]);
        }
        if(answer.forEach((key,value) -> if(key == ));)
        return answer;
    }
 */