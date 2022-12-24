import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> strList = new ArrayList();
        
        for(Integer num : numbers){
            strList.add(String.valueOf(num));
        }
        
        //EX) 30, 3 -> '3' + '30'  와 '30' + '3' 비교 
        Collections.sort(strList, (a, b) -> (b + a).compareTo(a + b));
       
        if(strList.get(0).startsWith("0")) return "0";
        
        for(String s : strList){
            answer += s;
        }
        return answer;
    }
}