import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> hs = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                hs.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[hs.size()];
        int i = 0;
        
        for(int num : hs){
            answer[i++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}