package InfJava;

import java.util.Scanner;

public class JavaInf_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(solution(n, m, a));
    }

    public static int solution(int n, int m, int[] a) {
        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += a[rt];

            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= a[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;

    }
}
