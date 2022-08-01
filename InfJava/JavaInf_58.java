package InfJava;

import java.util.Scanner;

public class JavaInf_58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt(); //문제의 개수
        int limit = in.nextInt(); //제한 시간
        int[] dy = new int[limit + 1];

        for (int i = 0; i < cnt; i++) {
            int s = in.nextInt();
            int t = in.nextInt();

            for (int j = limit; j >= t; j--) {
                dy[j] = Math.max(dy[j], dy[j - t] + s);
            }
        }

        System.out.println(dy[limit]);
    }
}


/**
 * 제한시간 M 안에 N 개의 문제 중 최대 점수 얻기
 * 점수와 걸린시간으로 2번쨰줄부터 N개 만큼 주어짐
 */