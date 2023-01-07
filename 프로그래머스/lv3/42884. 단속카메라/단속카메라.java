import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] routes) {
       Arrays.sort(
                routes, Comparator.comparingInt(a -> a[1])
        );

        int camera = 0;

        int min = Integer.MIN_VALUE;
        for(int[] route : routes) {
            if(min <  route[0] ) { // 열 돌기
                min = route[1];
                ++camera;
            }
        }
        return camera;
    }
}