package InfJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaInf_34 {

    public static int solution(String s, String t) {
        int answer = 0;

        Map<Character, Integer> anagramMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            anagramMap.put(ch, anagramMap.getOrDefault(ch, 0) + 1);
        }

        // 초기화
        Map<Character, Integer> rMap = new HashMap<>();
        for (int i = 0; i < t.length() - 1; i++) {
            char key = s.charAt(i);
            rMap.put(key, rMap.getOrDefault(key, 0) + 1);
        }

        // 탐색
        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            char key = s.charAt(rt);
            rMap.put(key, rMap.getOrDefault(key, 0) + 1);

            if (anagramMap.equals(rMap)) {
                answer++;
            }

            key = s.charAt(lt);
            rMap.put(key, rMap.get(key) - 1);
            if (rMap.get(key) == 0) {
                rMap.remove(key);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String t = in.nextLine();

        System.out.println(solution(s, t));
    }
}