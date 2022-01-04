import java.util.Scanner;

public class JavaInf_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i=0; i < testCase; i++) {
            System.out.println(solution(in.next()));
        }
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
