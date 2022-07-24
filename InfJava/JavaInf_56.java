package InfJava;

import java.util.Scanner;

public class JavaInf_56 {

    static String answer = "NO";
    static boolean flag = false;
    static int total = 0;
    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }

        dfs(0, 0);
        System.out.println(answer);
    }

    static void dfs(int L, int sum) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(L + 1, sum + arr[L]);
            dfs(L + 1, sum);
        }
    }

}

/*
 N 개의 원소 자연수 집합 -> 2개의 부분집합으로 나눌 예정
 부분집합의 합이 같으면 YES 다르면 NO
 두 부분집합은 서로소 관계입니다. ( 중복 되지 않음)
 1 <= N <= 10

 */