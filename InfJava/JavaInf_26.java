package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class JavaInf_26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] firstArray = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        Integer[] secondArray = new Integer[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(st.nextToken());
        }

        for (Integer i : solution(firstArray, secondArray)) {
            System.out.print(i + " ");
        }


    }

    static List<Integer> solution(Integer[] arr1, Integer[] arr2) {
        Integer[] result = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray(Integer[]::new);

        Integer temp = 0;
        List<Integer> answer = new ArrayList<>();

        for (Integer integer : result) {
            if (temp.equals(integer)) {
                answer.add(integer);
            }
            temp = integer;
        }
        return answer;
    }
}