package InfJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaInf_54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(in.nextLine());

        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(solution(n, c, arr));
    }

    public static int solution(int n, int c, int[] bucket) {
        Arrays.sort(bucket);

        int answer = 0;
        int lt = 1;
        int rt = bucket[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            //마구간 장소 vs 말의 수
            if (count(bucket, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    // 마구간 장소 탐색
    public static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int pos : arr) {
            if (pos - ep >= dist) {
                cnt++;
                ep = pos;
            }
        }
        return cnt;
    }
}

