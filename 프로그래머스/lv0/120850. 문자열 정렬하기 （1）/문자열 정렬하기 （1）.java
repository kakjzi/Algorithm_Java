import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String[] tmp = my_string.replaceAll("[^0-9]*", "").split("");
        Arrays.sort(tmp);
        
        return Stream.of(tmp).mapToInt(Integer::parseInt).toArray();
    }
}