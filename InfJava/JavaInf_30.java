package InfJava;

import java.util.Scanner;

public class JavaInf_30 {
    public static int solution(int input2, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;
        int length = arr.length;
        for (int rt = 0; rt < length; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > input2) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(input2, arr));
    }


}

