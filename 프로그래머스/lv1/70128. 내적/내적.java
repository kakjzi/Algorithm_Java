import java.util.*;

class Solution {
    public int solution(int[] a, int[] b) {
        int size = a.length;
        List<Integer> tmp = new ArrayList<Integer>();
        for(int i = 0; i < size; i++){
            tmp.add(a[i] * b[i]);
        }
        return tmp.stream().mapToInt(i -> i).sum();
    }
}