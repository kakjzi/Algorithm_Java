import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaInf_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] infoA = new int[N];
        int[] infoB = new int[N];

        StringTokenizer tokenA = new StringTokenizer(br.readLine());
        StringTokenizer tokenB = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            infoA[i] = Integer.parseInt(tokenA.nextToken());
            infoB[i] = Integer.parseInt(tokenB.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (infoA[i] == infoB[i]) { // 두 값이 같으면 비김
                System.out.println("D");
            } else {
                if (infoA[i] == 1 && infoB[i] == 3) { // A가 가위 내고 이기는경우
                    System.out.println("A");
                } else if (infoA[i] == 2 && infoB[i] == 1) { // A가 바위 내고 이기는경우
                    System.out.println("A");
                } else if (infoA[i] == 3 && infoB[i] == 2) { // C가 보자기 내고 이기는경우
                    System.out.println("A");
                } else { // 나머지는 B가 이기는경우
                    System.out.println("B");
                }
            }
        }
    }
}
