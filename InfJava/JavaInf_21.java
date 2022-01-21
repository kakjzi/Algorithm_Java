package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class JavaInf_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            String[] str = br.readLine().split(" ");
            int[] rows = Stream.of(str)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.arraycopy(rows, 0, matrix[i], 0, matrix.length);
        }
        System.out.println(solution(matrix));
    }

    public static int solution(int[][] arr) {

        int answer = 0;
        int sum1, sum2;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < arr.length; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - 1 - i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}

