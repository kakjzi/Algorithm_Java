package InfJava;

import java.util.Scanner;

public class JavaInf_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        solution(n, m, array);
    }

    public static void solution(int n, int m, int[] array) {
        int result = 0;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += array[rt];
            if (sum == m) {
                result++;
                sum = sum - array[lt];
                lt++;
            }
            while (sum >= m) {
                sum = sum - array[lt++];
                if (sum == m) {
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}

