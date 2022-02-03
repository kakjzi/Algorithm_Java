package InfJava;

import java.util.HashMap;
import java.util.Scanner;

public class JavaInf_32 {

    public static String solution(String input1, String input2) {

        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();

        String[] split1 = input1.split("");
        String[] split2 = input2.split("");
        for (String s : split1) {
            hashMap1.put(s, hashMap1.getOrDefault(s, 0) + 1);
        }
        for (String s : split2) {
            hashMap2.put(s, hashMap2.getOrDefault(s, 0) + 1);
        }

        for (String s : hashMap1.keySet()) {
            if (!hashMap1.get(s).equals(hashMap2.get(s))) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        System.out.println(solution(input1, input2));
    }
}

/*
문제요구사항
    입력: 알파벳집합 각각 줄마다 1개씩 주어짐
    처리: 대소문자 구분하며 재배열시 상대편 단어가 될 수있으면 yes, 아니면 no
    출력: yes, no

조건나열
    대소문자 구분
    단어의 길이는 100을 넘기지 않는다.

시간복잡도
    O(100) => O(n)

풀이
    1. 첫번째 줄과 두번째 줄 각각 Map 에 담기
    2. Key 를 서로 비교, 없으면 No 출력
    3. Key 가 있을 경우 value 가 같은지 비교, 다르면 No 출력
 */

