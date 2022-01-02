import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaInf_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }

    public static String solution(String str) {
     /*   char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (!sb.toString().contains(String.valueOf(aChar))) sb.append(aChar);
        }
        return sb.toString();*/

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, str.length())
                .filter(i -> sb.indexOf(String.valueOf(str.charAt(i))) == -1)
                .forEach(i -> sb.append(str.charAt(i)));
        return String.valueOf(sb);
    }
}
