package Programmers.Level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _20220204 {
    public static void main(String[] args) {

        int[] solution = solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        System.out.print("[");
        for (int i = 0; i < solution.length; i++) {
            if (i == solution.length - 1) {
                System.out.print(solution[i]);
                break;
            }
            System.out.print(solution[i] + ", ");
        }
        System.out.print("]");

    }

    public static int[] solution(String s) {
        int[] answer;
        String replaceStr = s.replaceAll("\\{\\{|}}", "");
        String[] tuples = Arrays.stream(replaceStr.split("},\\{"))
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        // 2
        // 2,1
        // 2,1,3 ...

        Set<Integer> set = new LinkedHashSet<>();

        for (String tuple : tuples) {
            int[] array = Arrays.stream(tuple.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i : array) {
                if (!set.contains(i)) {
                    set.add(i);
                    break;
                }
            }
        }
        answer = set.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
