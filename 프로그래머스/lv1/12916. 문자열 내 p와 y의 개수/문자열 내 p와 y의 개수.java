class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        return s.chars().filter(c-> c == 'P').count() == s.chars().filter(c-> c == 'Y').count();
    }
}