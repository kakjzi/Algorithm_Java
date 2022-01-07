import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaInf_18 {
    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        StringTokenizer st = new StringTokenizer(sc.readLine());

        StringBuilder sb = new StringBuilder();
        String s = null;

        for (int i = 0; i < n; i++) {
            s = String.valueOf(sb.append(st.nextToken()).reverse());
            System.out.print(solution(n, s));
            sb.setLength(0);
        }
    }

    public static String solution(int n, String strNum) {
        int num = Integer.parseInt(strNum);
        String answer = "";
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) { // 자기 자신과 1
            answer += num + " ";
        }

        return answer;
    }

}

