package InfJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JavaInf_39 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        StringTokenizer st = null;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; st.hasMoreTokens(); j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; st.hasMoreTokens(); i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(board, n, moves, m));

    }

    public static int solution(int[][] board, int n, int[] moves, int m) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < m; i++) { // 뽑기는 M 만큼 함.
            for (int j = 0; j < n; j++) { //
                int pos = board[j][moves[i] - 1];
                board[j][moves[i] - 1] = 0;
                if (pos != 0) {
                    if (!stack.isEmpty() && stack.peek() == pos) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(pos);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}


/*
문제 요구 사항
    입력:  N 과 N*N 배열,  M, Move 배열
    처리: M과 move 를 보고  N*N에서 인형을 뽑자 같은 숫자는 사라짐
    출력: 사라진 인형의 총 개수를 출력하자

조건 나열
    5<= N <=30
    0<= 배열의 원소 <= 100 0은 빈칸
    1<= M(Move의 배열의 길이) <=1,000
    M의 배열 원소 값은 <= N

시간 복잡도
O(1,000 + 30 * 30) = O(n^2)?

풀이
    1. 각 배열들을 초기화
    2.
    3. 뽑을 때마다 해당 인덱스 dict-value 에서 pop 해주고 바구니 배열에 담아준다
    3.1 뽑은 숫자가 0이면 무시
    4. 그 과정에서 move 배열 길이 만큼 for 문을 돌면서
        처음에는 그냥 넣고 넣으려는 숫자와 바구니의 마지막 인덱스가
        같으면 바구니 마지막 인덱스 삭제 & count ++
        다르면 계속 쌓아줌
    5. 끝나면 count 도출


 */