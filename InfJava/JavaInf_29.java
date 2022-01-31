package InfJava;

import java.util.Scanner;

public class JavaInf_29 {
    public static void solution(int n) {
        int result = 0;
        int lt = 0;
        int nTmp = n / 2 + 1;
        int sum = 0;
        int[] array = new int[nTmp];
        for (int i = 0; i < nTmp; i++) {
            array[i] = i + 1;
        }
        for (int rt = 0; rt < nTmp; rt++) {
            sum += array[rt];
            if (sum == n) {
                result++;
            }
            while (sum >= n) {
                sum -= array[lt++];
                if (sum == n) {
                    result++;
                }
            }
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solution(n);
    }
}

