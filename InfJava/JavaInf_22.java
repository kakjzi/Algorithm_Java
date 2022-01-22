package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class JavaInf_22 {
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());
        int[][] matrix = new int[size + 2][size + 2];

        for (int i = 1; i < size + 1; i++) {
            String[] str = br.readLine().split(" ");
            int[] rows = Stream.of(str)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(rows, 0, matrix[i], 1, size);
        }
        System.out.println(solution(matrix));
    }

    public static int solution(int[][] arr) {
        int answer = 0;

        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                //
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}