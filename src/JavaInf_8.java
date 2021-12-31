import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaInf_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().trim().toLowerCase();
        if(solution(input)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static Boolean solution(String str) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, str.length())
                .filter(i -> Character.isAlphabetic(str.charAt(i)))
                .forEach(i -> sb.append(str.charAt(i)));

        String tempStr = sb.toString();
        String reverseStr = sb.reverse().toString();
        return reverseStr.equals(tempStr);
    }
}
