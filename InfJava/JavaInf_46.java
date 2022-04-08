package InfJava;

import java.util.Arrays;
import java.util.Scanner;

public class JavaInf_46 {
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
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
/*
버블 정렬은 옆에 있는 데이터와 비교하여 더 작은 값을 앞으로 보내는 정렬입니다.
시간 복잡도는 O(N*N) 입니다.
 */