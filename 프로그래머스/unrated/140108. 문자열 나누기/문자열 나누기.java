import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        List<String> arr = new ArrayList<>();
        int x = 0;
        int y = 0;
        
        while (s.length() > 0) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(0) == s.charAt(i)){
                    x += 1;
                }else{
                    y += 1;
                }
                if (x == y) {
                    count = i + 1;
                    break;
                }
            }
            arr.add(s.substring(0, count));
            s = s.substring(count, s.length());
            if(count == 0) break;
    }
    return arr.size();
    }
}