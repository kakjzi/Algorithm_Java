package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInf_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i : solution(N)) {
            System.out.print(i + " ");
        }

      /*  if (N <= 45 && N >= 3) {
            for (int i = 1; i <= N; i++) {
                System.out.print(solution(i) + " ");
            }
        }*/
    }

    //메모제이션
    public static int[] solution(int i) {
        int[] answer = new int[i];
        answer[0] = 1;
        answer[1] = 1;
        for (int j = 2; j < i; j++) {
            answer[j] = answer[j - 2] + answer[j - 1];
        }
        return answer;
    }
    //재귀 함수
   /* public static int solution(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return solution(i - 1) + solution(i - 2);
        }
    }*/
}
