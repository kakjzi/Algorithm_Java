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