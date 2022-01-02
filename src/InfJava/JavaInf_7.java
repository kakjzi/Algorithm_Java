package InfJava;

import java.util.Scanner;

public class JavaInf_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if(solution(input)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static Boolean solution(String str) {
        String lowStr = str.toLowerCase();
        String[] splitStr = lowStr.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = splitStr.length; i > 0; i--){
            sb.append(splitStr[i-1]);
        }
        return sb.toString().equals(lowStr);
    }
}
