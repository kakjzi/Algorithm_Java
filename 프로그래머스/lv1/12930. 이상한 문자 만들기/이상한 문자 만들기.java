class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String tmp : array) {
            cnt = tmp.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? tmp.toLowerCase() : tmp.toUpperCase(); 
        }
      return answer;
    }
}