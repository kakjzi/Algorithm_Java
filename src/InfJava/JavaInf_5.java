package InfJava;

import java.util.Scanner;

public class JavaInf_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }

    public static String solution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt]))  lt++;
            else if (!Character.isAlphabetic(chars[rt])) rt--;
            else{
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }
}
