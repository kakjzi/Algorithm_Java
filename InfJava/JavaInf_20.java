
import java.io.*;
import java.util.stream.Stream;

class JavaInf_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str= br.readLine().split(" ");

        int[] ints = Stream.of(str)
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : solution(ints)) {
            System.out.print(i + " ");
        }
    }
    public static int[] solution(int[] arr) {
        int max = arr.length;
        int[] rankArr = new int[max];

        for (int i = 0; i < max; i++) {
            int rank = 1;

            for (int j = 0; j < max; j++) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            rankArr[i]=rank;
        }

        return rankArr;
    }
}

/*
문제 요구사항
    입력: N명, 국어 점수
    처리: N명의 국어점수 입력시 입력된 순서로 등수를 출력
    출력: 등수
조건나열
    동일 점수시 모두 같은 등수 그 뒤 점수의 등수는 그만큼 뒤로 밀림.
    3 <= N <= 100
시간복잡도
    하나씩 등수를 따져봐야함. O(n^2) => O(10,000)
풀이
    1.N과 점수들을 입력받기
    2.등수는 각 array 인덱스마다 for문을 돌면서 판별
 */