import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> bucket = new Stack<>();

        for (int col : moves){
            int colIndex = col - 1;
            for (int rowIndex = 0; rowIndex < board.length; rowIndex++){
                if (board[rowIndex][colIndex] != 0){
                    if (bucket.isEmpty() || bucket.peek() !=
                            board[rowIndex][colIndex]){
                        bucket.add(board[rowIndex][colIndex]);
                    }else{
                        bucket.pop();
                        answer += 2;
                    }
                    board[rowIndex][colIndex] = 0;
                    break;
                }
            }

        }

        return answer;
    }
}