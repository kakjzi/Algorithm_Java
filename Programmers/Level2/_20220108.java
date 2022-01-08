package Programmers.Level2;

public class _20220108 {

    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int result, int idx) {
        //재귀 호출 종료조건
        if (numbers.length == idx) {
            if (target == result) {
                return 1;
            }
            return 0;
        }

        int curPlus = result + numbers[idx];
        int curMinus = result - numbers[idx];
        int answer = 0;

        answer += dfs(numbers, target, curPlus, idx + 1);
        answer += dfs(numbers, target, curMinus, idx + 1);

        return answer;
    }
}


