import java.util.Arrays;

class Solution {
      public int solution(int[] array) {
        return (int) Arrays.toString(array)
                  .chars()
                  .filter(i -> i == '7')
                  .count();
    }
}
