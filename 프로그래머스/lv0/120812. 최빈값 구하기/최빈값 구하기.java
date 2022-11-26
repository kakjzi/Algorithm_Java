import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int j : array) {
            tmp.putIfAbsent(j, 1);
            tmp.computeIfPresent(j, (k, v) -> ++v);
        }
        int maxKeyCnt = 0;

        int maxValueInMap=(Collections.max(tmp.values()));  // This will return max value in the HashMap
        for (Entry<Integer, Integer> entry : tmp.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                maxKeyCnt++;
                answer = entry.getKey();
            }
        }
        if (maxKeyCnt > 1) {
            return -1;
        }
        return answer;
    }
}