package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class JavaInf_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //학생 수
        int m = Integer.parseInt(st.nextToken()); //시험 수
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; st.hasMoreTokens(); j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, m, arr));
    }

    static int solution(int studentCount, int testCount, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= studentCount; i++) {  //멘토일 경우 루프
            for (int j = 1; j <= studentCount; j++) { // 멘티가 되는 경우 루프
                if (i == j) {
                    continue; //자기 자신 제외
                }
                int count = 0;
                int mentor = 0;
                int mentee = 0;

                //탐색 시작
                for (int k = 0; k < testCount; k++) {
                    for (int g = 0; g < studentCount; g++) {
                        if (arr[k][g] == i) {
                            mentor = g;
                        }
                        if (arr[k][g] == j) {
                            mentee = g;
                        }
                    }
                    if (mentor < mentee) {
                        count++;
                    }

                }
                if (count == testCount) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
