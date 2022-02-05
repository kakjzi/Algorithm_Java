package Programmers.Level3;

import java.util.ArrayDeque;


public class _20220204 {
    public static String solution(String sentence) {
        try {
            StringBuilder answer = new StringBuilder();

            ArrayDeque<Character> input = new ArrayDeque<>();
            int[] use = new int[26];
            for (int i = 0; i < sentence.length(); i++) {
                input.add(sentence.charAt(i));
                if (Character.isLowerCase(sentence.charAt(i))) {
                    use[sentence.charAt(i) - 'a']++;
                }
            }

            while (!input.isEmpty()) {
                char firstInput = input.poll();
                ArrayDeque<Character> word = new ArrayDeque<>();

                if (Character.isLowerCase(firstInput)) { //시작값이 소문자
                    if (use[firstInput - 'a'] != 2) return "invalid";
                    if (Character.isLowerCase(input.peek())) return "invalid";
                    word.add(input.poll());
                    char thirdInput = input.poll();

                    if (Character.isLowerCase(thirdInput) && thirdInput != firstInput) { //단어 안에 또 소문자가 있는 경우
                        for (int i = 1; i < use[thirdInput - 'a']; i++) {
                            if (Character.isLowerCase(input.peek())) return "invalid";
                            word.add(input.poll());
                            if (input.poll() != thirdInput) return "invalid";
                        }

                        if (Character.isLowerCase(input.peek())) return "invalid";
                        word.add(input.poll());
                        if (input.poll() != firstInput) return "invalid";
                    } else if (thirdInput != firstInput) { //앞뒤에만 있는 경우
                        word.add(thirdInput);

                        while (input.peek() != firstInput) {
                            if (Character.isLowerCase(input.peek())) return "invalid";
                            word.add(input.poll());
                        }
                        input.poll();
                    }
                } else { //시작값이 대문자
                    word.add(firstInput);
                    if (input.isEmpty()) {
                        return answer.toString() + word.poll();
                    }
                    char secondInput = input.poll();
                    if (Character.isLowerCase(secondInput)) {
                        if (use[secondInput - 'a'] == 2) {
                            input.addFirst(secondInput);
                        } else {
                            for (int i = 1; i < use[secondInput - 'a']; i++) {
                                if (Character.isLowerCase(input.peek())) return "invalid";
                                word.add(input.poll());
                                if (input.poll() != secondInput) return "invalid";
                            }
                            if (Character.isLowerCase(input.peek())) return "invalid";
                            word.add(input.poll());
                        }
                    } else {
                        word.add(secondInput);
                        if (input.isEmpty()) {
                            return answer.toString() + word.poll() + word.poll();
                        }
                        while (Character.isUpperCase(input.peek())) {
                            word.add(input.poll());
                            if (input.isEmpty())
                                break;
                        }
                        if (!input.isEmpty()) {
                            if (use[input.peek() - 'a'] != 2) {
                                input.addFirst(word.pollLast());
                            }
                        }
                    }
                }
                while (!word.isEmpty()) {
                    answer.append(word.poll());
                }
                if (!input.isEmpty())
                    answer.append(" ");
            }
            return answer.toString();
        } catch (Exception e) {
            return "invalid";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("HaEaLaLaObWORLDbSpIpGpOpNpGJqOqAdGcWcFcDdeGfWfLeoBBoAAAAxAxAxAA"));
        System.out.println(solution("AxAxAxA"));
        System.out.println(solution("zHaEzyLbLyqOcWqxOdRxgLeDg"));
        System.out.println(solution("HELLOWORLD"));
        System.out.println(solution("HaELbLOcWOdRLeD"));
        System.out.println(solution("aASBCABabCbSDASD"));
        System.out.println(solution("AAAaBaAbBBBBbCcBdBdBdBcCeBfBeGgGGjGjGRvRvRvRvRvR"));
        System.out.println(solution("aABBBAa"));
        System.out.println(solution("aAbBbBbBbAa"));
        System.out.println(solution("aAbBbBbBbAacAdBdCc"));
        System.out.println("-------");

        System.out.println(solution("aABCabb")); // inv
        System.out.println(solution("AxAxAxAx")); // inv
        System.out.println(solution("aAbBbBbBbAacAdBdCdc")); // inv
        System.out.println(solution("aAbBbBbBbAabABCb")); // inv
        System.out.println(solution("aAbBbBbBbAaaABCa")); // inv
        System.out.println(solution("aABCabb")); // inv
        System.out.println(solution("aCaCa")); // inv
        System.out.println(solution("aABCabABCbcABC")); // inv
        System.out.println(solution("aAdBdCabAfBfCbaAeBeCa")); // inv
        System.out.println(solution("asHELLOas")); // inv
        System.out.println(solution("aAeBeCeabABCbcABCc")); // inv
        System.out.println("----inv---");

        System.out.println(solution("aAeBeCabABCbcABCc"));
        System.out.println(solution("AAAaBaAbBBBBb"));
        System.out.println(solution("aAdBdCabAfBfCbcAeBeCc"));
        System.out.println(solution("SpIpGpOpNpGJqOqA"));
        System.out.println(solution("HELLObWORLDb"));
        System.out.println(solution("aGbWbFbDakGnWnLk"));
        System.out.println(solution("dAzBzCd"));
        System.out.println(solution("AaBcCc"));
        System.out.println(solution("aHELLOa"));
        System.out.println(solution("aHELLOabWORLDb"));
        System.out.println(solution("HaEaLaLaO"));
        System.out.println(solution("bHaEaLaLaOb"));
        System.out.println(solution("HaEaLaLaObWORLDb"));
        System.out.println(solution("AaAaAaBaBaBaCCbCbC"));
    }
}
/*
문제요구사항
    입력: 문자열 변수 sentence 로 주어짐(영문 대소문자로 이루어져 있다)
    처리: 규칙1과 규칙2를 통해서 변환, 만들 수 없는 문자열일 경우 "invalid" 리턴.
    출력: 광고 문구의 규칙 전 원래 문구를 리턴

조건
    규칙 1.특정 단어를 선택하여 글자 사이마다 같은 기호를 넣기
    규칙 2. 특정 단어를 선택하여 단어 앞뒤에 같은 기호를 넣기
    규칙 3. 같은 규칙 두번 적용 x
    규칙 4. 한번 쓰인 소문자는 재사용 x

    sentence 길이 <= 1,000
 */
