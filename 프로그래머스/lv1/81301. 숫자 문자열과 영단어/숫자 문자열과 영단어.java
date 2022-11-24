class Solution {
    public int solution(String s) {
         int answer = 0;
        String[] criterion = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };

        for (int i = 0; i < criterion.length; i++) {
            s = s.replace(criterion[i], String.valueOf(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}