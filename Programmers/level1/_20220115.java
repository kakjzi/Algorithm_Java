package Programmers.Level1;

import java.util.*;

public class _20220115 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<String> userId = new ArrayList<>(Arrays.asList(id_list));
        Map<String, ArrayList<String>> reported = new HashMap<String, ArrayList<String>>();
        Set<String> set = new HashSet<String>(Arrays.asList(report));

        for (String s : set) {
            //reported.put(s,)
            String[] s1 = s.split(" ");
            ArrayList<String> strings = new ArrayList<String>();
            if (reported.containsKey(s1[1])) {
                strings = reported.get(s1[1]);
                strings.add(s1[0]);
            } else {
                strings.add(s1[0]);
            }
            reported.put(s1[1], strings);
        }

        reported.forEach((key, value) -> {
            if (value.size() >= k) {
                for (String s : value) {
                    int count = userId.indexOf(s);
                    answer[count] += 1;
                }
            }

            System.out.println(key + " : " + value);
        });

        return answer;
    }

}