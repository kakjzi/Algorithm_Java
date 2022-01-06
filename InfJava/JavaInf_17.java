import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInf_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }

    //에라토스테네스 체 방식
    public static int solution(int N) {
        int answer = 0;
        int[] arr = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i * i <= N; i += 1) {
            for (int j = i * i; j <= N; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = 2; i <= N; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
    /*public static int solution(int N) {
        int answer = 0;
        int num = 2;

        while (num <= N) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0 && i != num) {
                    break;
                }
                if (num % i == 0 && i == num) {
                    answer++;
                }
            }
            num++;
        }
        return answer;
    }*/
}
