package InfJava;

import java.util.Scanner;

class JavaInf_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }

    private static int solution(int day, int k, int[] sales) {
        int max = 0, sum = 0;
        // 첫 k일 동안의 합
        for (int i = 0; i < k; i++) {
            sum += sales[i];
        }
        max = sum;

        for (int i = k; i < day; i++) {
            // K일의 맨 앞 매출을 빼고 새 매출을 더한다
            sum += -sales[i - k] + sales[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}