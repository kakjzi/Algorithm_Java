class Solution {
    public int solution(String[] babbling) {
         int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] repeatWords = {"ayaaya", "yeye", "woowoo", "mama"};


        for (String str : babbling) {
            for (String repeatWord : repeatWords) {
                str = str.replace(repeatWord, "X");
            }
            for (String word : words) {
                str = str.replace(word, "O");
            }

            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (!str.subSequence(i, i + 1).equals("O")) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        return answer;
    }
}