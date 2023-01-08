import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
     public static ArrayList<Integer> parent;
    
     public int getParent(int node){
        if(parent.get(node) == node) {
            return node;
        }
        return getParent(parent.get(node));
    }
    
    public int solution(int n, int[][] routes) {
         int answer = 0;

        parent = new ArrayList<>();

        for(int i=0; i< n; i++){
            parent.add(i);
        }
        Arrays.sort(routes, Comparator.comparingInt(o -> o[2]));

        for (int[] route : routes) {
            int node1 = getParent(route[0]);
            int node2 = getParent(route[1]);
            int cost = route[2];

            if(node1 == node2) continue;
            answer += cost;
            if(node1 < node2){
                parent.set(node2, node1);
            }else{
                parent.set(node1, node2);
            }


        }
        return answer;
    }
}