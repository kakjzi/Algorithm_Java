package Programmers.level1;

import java.util.*;

public class _20220115 {
    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String, ArrayList<String>> reported = new HashMap<String, ArrayList<String>>();
        Set<String> set = new HashSet<String>(Arrays.asList(report));

        for (String s : set) {
            //reported.put(s,)
            String[] s1 = s.split(" ");
            ArrayList<String> strings = new ArrayList<String>();
            if (reported.containsKey(s1[1])) {
                strings = reported.get(s1[1]);
                strings.add(s1[0]);
            } else {
                strings.add(s1[0]);
            }
            reported.put(s1[1], strings);
        }

        reported.forEach((key, value) -> {
            if (value.size() >= k) {
                for (String s : id_list) {
                    answer[s] = 
                }
            }
            System.out.println(key + " : " + value);
        });
        return answer;
    }

}


/*
문제 요구사항
이용자 ID 배열과 신고당한 이용자 ID 배열과 정지 기준이 되는 신고횟수 K 가 주어질때
각 유저별로 처리결과 메일을 반환해라

조건
각 유저는 한번에 한명만 신고가능
K번 이상 신고된 유저는 정지,
 모든 내용을 다 취합하고 난 뒤 마지막에 해당 유저를 신고한 모든 유저에게 정지사실을 메일로 알려줌

2<= id_list <=1000
1 <= 이름 <=10 ,소문자로만 중복없음
1<=report <=200000
자기자신 신고 x
이용자와 신고id는 스페이스하나로 구분

시간복잡도


풀이
구현
 */