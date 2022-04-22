package InfJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaInf_53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(in.nextLine());

        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    private static int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                // 용량보다 더 클때 cnt를 증가하고 sum에 다음 인덱스 삽입
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}

