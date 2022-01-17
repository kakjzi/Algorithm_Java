package Programmers.Level2;

import java.util.*;

public class _20220117 {

    List<Map<String, Integer>> FoodMaps = new ArrayList<>();
    int[] maxCnt = new int[11];

    void comb(char[] str, int pos, StringBuilder candi) {
        //재귀 종료조건
        if (pos >= str.length) {
            int len = candi.length();
            if (len >= 2) {
                int cnt = FoodMaps.get(len).getOrDefault(candi.toString(), 0) + 1;
                FoodMaps.get(len).put(candi.toString(), cnt);
                maxCnt[len] = Math.max(maxCnt[len], cnt);
            }
            return;
        }

        comb(str, pos + 1, candi.append(str[pos])); //선택할 경우

        candi.setLength(candi.length() - 1);//선택안할 경우
        comb(str, pos + 1, candi);

    }

    public String[] solution(String[] orders, int[] course) {
        for (int i = 0; i < 11; ++i) {
            FoodMaps.add(new HashMap<String, Integer>());
        }

        for (String order : orders) {
            char[] arr = order.toCharArray();
            Arrays.sort(arr);
            comb(arr, 0, new StringBuilder());
        }

        List<String> list = new ArrayList<>();
        for (int len : course) {
            for (Map.Entry<String, Integer> entry : FoodMaps.get(len).entrySet()) {
                if (entry.getValue() >= 2 && entry.getValue() == maxCnt[len]) {
                    list.add(entry.getKey());
                }
            }
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
