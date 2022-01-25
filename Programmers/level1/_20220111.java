package Programmers.Level1;

public class _20220111 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int zeroCnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
                continue;
            }
            for (int win_num : win_nums) {
                if (win_num == lotto) {
                    cnt++;
                    break;
                }
            }
        }
        return new int[]{7 - Math.max(cnt + zeroCnt, 1), 7 - Math.max(cnt, 1)};
    }
}
