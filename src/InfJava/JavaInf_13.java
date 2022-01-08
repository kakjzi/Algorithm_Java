package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JavaInf_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        // Arrays.stream(str).mapToInt(i -> Integer.parseInt(i)).toArray();
        int[] ints = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, ints));
    }

    /**
     * 자신 바로 앞 수보다 큰수만 출력하는 프로그램
     * 접근방식
     * 첫번째는 그대로 출력하고 그 다음 인덱스(a) 비교
     * 보다 크면 저장
     * 보다 작으면 a 는 비교 대상으로 변경, a 다음 인덱스로 비교 반복
     */
    public static String solution(int n, int[] ints) {
        StringBuilder sb = new StringBuilder();

        sb.append(ints[0]).append(" ");
        for (int i = 1; i < ints.length; i++) {
            if (ints[i - 1] < ints[i]) {
                sb.append(ints[i]).append(" ");
            }
        }
        return String.valueOf(sb);
    }
}
