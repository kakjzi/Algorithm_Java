import java.util.Arrays;

class Solution {
      public int solution(int[] array) {
        String tmp = Arrays.toString(array);

        return (int) tmp.chars()
                  .filter(i -> i == '7')
                  .count();
    }
}