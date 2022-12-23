class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        // 등차수열 이용
        answer = (max - min + 1) * (min + max) / 2;
        return answer;
    }
}