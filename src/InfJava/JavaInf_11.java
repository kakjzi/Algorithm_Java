package InfJava;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaInf_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

    /**
     * 접근방법
     * 현재 인덱스위치와 다음 인덱스 위치 문자가 같은지 확인후 Count ++ or 그냥 문자열 출력
     * 모든 문자 한번씩 찍어내야함.
     */

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        int cnt = 1;

        str = str + " ";  //마지막까지 추적.

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                cnt++;
            else {
                answer.append(str.charAt(i));
                if (cnt > 1) {
                    answer.append(String.valueOf(cnt));
                }
                cnt = 1;
            }
        }
        /**
         * Tip
         * toString() 보다 String.valueOf 를 지향하자
         * NPE 방지
         */
        return String.valueOf(answer);
    }
}
