
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class JavaInf_19 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] inputScore = br.readLine().split(" ");
        int[] score = Stream.of(inputScore).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(count, score));
    }
    public static int solution(int N ,int[] score) {

        int cnt = 0;
        int answer = 0;
        for (int i = 0; i<N; i++) {
            if (score[i] == 1) {
                cnt += score[i];
                answer += cnt;
                continue;
            }
            cnt = 0;
        }

        return answer;
    }
}