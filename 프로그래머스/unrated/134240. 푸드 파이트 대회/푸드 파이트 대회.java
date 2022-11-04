class Solution {
    public String solution(int[] food) {
           String answer = "";
        StringBuilder right = new StringBuilder();
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
           if ((food[i]/2 > 0)){
               for (int j = 0; j < food[i]/2; j++) {
                   right.append(i);
                   left.append(i);
               }
           }
        }

        answer = left + "0";
        answer += right.reverse().toString();
        
        return answer;
    }
}