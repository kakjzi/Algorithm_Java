
class Solution {
    public int solution(int[][] triangle) {
        for(int depth = triangle.length - 2; depth >= 0; depth--){
            for(int idx = 0; idx < triangle[depth].length; idx++){
                triangle[depth][idx] += Math.max(triangle[depth + 1][idx], triangle[depth + 1][idx + 1]);
            }
        }
        return triangle[0][0];
    }
}