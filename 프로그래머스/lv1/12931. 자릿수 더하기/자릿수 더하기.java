import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String tmp = String.valueOf(n);
        String[] tmp1 = tmp.split("");
        for(String i : tmp1){
            answer += Integer.parseInt(i);
        }
        

        return answer;
    }
}