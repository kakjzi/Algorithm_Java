package InfJava;

import java.util.HashMap;
import java.util.Scanner;

public class JavaInf_31 {

    public static void solution(int n, String vote) {
        int result = 0;
        String answer = "";
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        // 배열로 후보 만들기
        Character[] array = new Character[]{'A', 'B', 'C', 'D', 'E'};
        // 각 후보들을 해쉬맵에 넣어 0으로 초기화
        for (int i = 0; i < array.length; i++) {
            count.put(array[i], 0);
        } // 각 후보들이 나올경우 1씩 더하여 해쉬맵에 저장
        for (char x : vote.toCharArray()) {
            count.put(x, count.get(x) + 1);
        } // 해쉬맵에서 가장 큰 숫자를 가진 키를 출력
        for (int i = 0; i < count.size(); i++) {
            if (count.get(array[i]) > result) {
                answer = array[i].toString();
            }
        }
        System.out.print(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String vote = in.next();
        solution(n, vote);
    }
}


