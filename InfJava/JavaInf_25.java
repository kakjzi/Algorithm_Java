package InfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class JavaInf_25 {
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

    static Integer[] solution(Integer[] arr1, Integer[] arr2) {
        return Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray(Integer[]::new);
    }
}

/*
문제요구사항
    입력: 각각의 배열의 크기와 배열의 원소들이 오름차순으로 주어진다
    처리: 두 배열을 합쳐 오름차순으로 정렬하여라
    출력: 합친 배열 출력
    
조건나열
    1 <= N, M <= 100
    배열의 원소는 오름차순으로 주어진다.

시간복잡도
    O(100)

풀이
    1. 배열을 합친다.
    2. 정렬한다.
    3. 출력한다.

 */