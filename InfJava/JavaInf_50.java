package InfJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaInf_50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(in.nextLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        for (int j : solution(N, nums)) {
            System.out.print(j + " ");
        }

    }

    // IDEA: 원래 배열과 정렬한 배열을 비교하면서 다른 인덱스(+1) 추가
    public static ArrayList<Integer> solution(int N, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = nums.clone();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (tmp[i] != nums[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}