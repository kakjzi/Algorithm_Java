package Programmers.Level3;

import java.util.Arrays;

public class _20220110 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);

        long start = 1;
        long answer = (long) n * times[times.length - 1]; //명시적으로 타입변환 ***
        long end = answer;

        while (start <= end) {
            long mid = (end + start) / 2;
            long curCompleted = 0;

            for (int time : times) {
                curCompleted += mid / time;
            }

            if (n > curCompleted) {
                //오른쪽 범위 설정
                start = mid + 1;
            } else {
                //왼쪽 범위 설정
                end = mid - 1;
                answer = Math.min(answer, mid);
            }
        }
        return answer;
    }

}


