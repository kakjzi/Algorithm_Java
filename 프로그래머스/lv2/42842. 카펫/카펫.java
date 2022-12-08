class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
   
        int area = brown + yellow;
        
        // 열이 행보다 더 크거나 같다.
        // brown + yellow = row * col
        // area = row * col
        
        for(int i = 1; i <= area; i++){
            int row = i;
            int col = area / row;
            
            if(row > col){
                continue;
            }
            
            if((row - 2) * (col - 2) == yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
            
        }
        return answer;
    }
}