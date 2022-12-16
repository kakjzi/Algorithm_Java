import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> tmp = new ArrayList<>();
        
        for(int i = 2; i < n; i++){
            if(n % i == 1) {
                tmp.add(i);
            }
        }
        
        Collections.sort(tmp);
        return tmp.get(0);
    }
}