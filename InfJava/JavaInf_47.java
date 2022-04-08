package InfJava;

import java.util.Arrays;
import java.util.Scanner;

public class JavaInf_47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = Integer.parseInt(in.nextLine());
        int[] input2 = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i : solution(input1, input2)) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int N, int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int target = nums[i]; // 다음 인덱스
            int j = i - 1;

            while (j >= 0 && target < nums[j]) { // 현재 인덱스가 타켓보다 더 큰지
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = target;
        }
        return nums;
    }
}

/*
삽입 정렬은 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법이다.
시간 복잡도는 O(N*N) 입니다.
 */