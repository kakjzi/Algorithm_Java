package InfJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class JavaInf_49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(in.nextLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solution(nums));
    }

    public static String solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int oldSize = nums.length;
        int newSize = set.size();

        if (oldSize == newSize) {
            return "U";
        }
        return "D";
    }
}