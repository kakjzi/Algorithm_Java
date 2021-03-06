package InfJava;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaInf_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next()));
    }

    public static int solution(String str) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, str.length())
                .filter(i -> !Character.isAlphabetic(str.charAt(i)))
                .forEach(i -> sb.append(str.charAt(i)));

        return Integer.parseInt(sb.toString());
    }
}
