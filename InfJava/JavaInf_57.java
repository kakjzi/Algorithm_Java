package InfJava;

import java.util.Scanner;

public class JavaInf_57 {
    static int limitWeight = 0;
    static int[] badookArr;

    static int badookCount;

    static int answer = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        limitWeight = in.nextInt();
        badookCount = in.nextInt();

        badookArr = new int[badookCount];

        for (int i = 0; i < badookCount; i++) {
            badookArr[i] = in.nextInt();
        }
        dfs(0, 0);

        System.out.println(answer);
    }

    static void dfs(int L, int sum) {
        if (sum > limitWeight) { // 조건을 넘지 말아야함
            return;
        }

        if (sum > answer) { // 가장 무겁
            answer = sum;
        }

        if (L == badookCount) { //
            return;
        }

        dfs(L + 1, sum + badookArr[L]);
        dfs(L + 1, sum);
    }
}


/**
 * c 킬로그램을 넘지 않으면서 가장 무겁게 태우고싶다.
 * N 마리 각 w의 무게가 주어질때 가장 무겁게 태울수 잇는 프로그램 작성
 */