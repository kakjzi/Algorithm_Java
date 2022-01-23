package InfJava;

import java.util.Scanner;

public class JavaInf_23 {

    public static int solution(int n, int[][] arr) {
        int answer = 1; // 반장
        int max = Integer.MIN_VALUE; // 같은 반이었던 학생 수 최대값

        for (int i = n - 1; i >= 0; i--) { // 학생 번호
            int[][] friend = new int[n][5];
            int cnt = 0;
            for (int j = 0; j < 5; j++) { // 학년
                int classNum = arr[i][j]; // 반
                for (int k = 0; k < n; k++) { // 학생 번호
                    if (k != i) {
                        if (arr[k][j] == classNum) friend[k][j] = 1;
                    }
                }
            }
            for (int q = 0; q < n; q++) {
                for (int p = 0; p < 5; p++) {
                    if (friend[q][p] == 1) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt >= max) {
                max = cnt;
                answer = i + 1; // 반장이 되는 학생 번호
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

}