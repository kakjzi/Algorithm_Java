import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correctAnswer = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % 5]) {
                correctAnswer[0]++;
            }

            if (answers[i] == supo2[i % 8]) {
                correctAnswer[1]++;
            }

            if (answers[i] == supo3[i % 10]) {
                correctAnswer[2]++;
            }
        }

        int max = Math.max(Math.max(correctAnswer[0],
                        correctAnswer[1]),
                correctAnswer[2]);

        List<Integer> supo = new ArrayList<>();

        for (int i = 0; i < correctAnswer.length; i++) {
            if (correctAnswer[i] == max) {
                supo.add(i + 1);
            }
        }

        answer = new int[supo.size()];

        for (int i = 0; i < supo.size(); i++) {
            answer[i] = supo.get(i);
        }

        return answer;
    }
}