package InfJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaInf_52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(in.nextLine());

        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, arr));
    }

    static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);

        int left = 0; // 처음 인덱스
        int right = n - 1; // 끝 인덱스

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == m) { // m과 일치하는 인덱스 출력하기
                return mid + 1;
            } else if (arr[mid] > m) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

/**
 * 시간초과
 * Scanner in = new Scanner(System.in);
 * int[] input1 = Arrays.stream(in.nextLine().split(" "))
 * .mapToInt(Integer::parseInt)
 * .toArray();
 * <p>
 * List<Integer> input2 = Stream.of(in.nextLine().split(" "))
 * .mapToInt(Integer::parseInt)
 * .limit(input1[0])
 * .sorted()
 * .boxed()
 * .collect(Collectors.toList());
 * <p>
 * for (int i : input2) {
 * if (input1[1] == i) {
 * System.out.println(input2.indexOf(i) + 1);
 * }
 * }
 */
