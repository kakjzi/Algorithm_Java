class Solution {
    public String solution(String s, int n) {
         String answer = "";

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (' ' == chars[i]){
                continue;
            }

            if(Character.isLowerCase(chars[i])) {
                chars[i] = (char) ((chars[i] - 'a' + n) % 26 + 'a');
            }else if(Character.isUpperCase(chars[i])){
                chars[i] = (char) ((chars[i] - 'A' + n) % 26 + 'A');
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }
}