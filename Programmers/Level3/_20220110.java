package Programmers.Level3;

import java.util.Arrays;

public class _20220110 {
    public static long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;

        Arrays.sort(times);

        long start = times[0];  // 1분 부터
        //최대시간 = 가장오래걸리는시간 * 인원수
        long end = (long) times[times.length - 1] * (long) n;

        long mid;
        long sum = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            sum = 0;
            for (int time : times) {
                sum += mid / time;
            }

            if (sum >= n) {
                answer = Math.min(answer, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }
}

