package Programmers.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _202203017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    public static String solution(String new_id) {
        StringBuilder answer = new StringBuilder();
        answer = new StringBuilder(new_id.toLowerCase()
                .replaceAll("[^-_.\\w]", ""));
        answer = new StringBuilder(answer.toString().replaceAll("[.]{2,}", "."));
        answer = new StringBuilder(answer.toString().replaceAll("^[.]|[.]$", ""));

        if (answer.toString().equals("")) {
            answer.append("a");
        }
        if (answer.length() >= 16) {
            answer = new StringBuilder(answer.substring(0, 15));
            answer = new StringBuilder(answer.toString().replaceAll("[.]$", ""));
        }
        if (answer.length() <= 2) {
            while (answer.length() <= 3) {
                answer.append(answer.charAt(answer.length() - 1));
            }
        }

        return String.valueOf(answer);
    }
}