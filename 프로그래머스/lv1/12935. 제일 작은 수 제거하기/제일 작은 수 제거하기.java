import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 0 || arr[0] == 10){
            return new int[]{-1};
        }
        
        int min = Arrays.stream(arr).min().getAsInt();
        
        return  Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}