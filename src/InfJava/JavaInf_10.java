package InfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaInf_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char t = in.next().charAt(0);

        int[] arr = solution(str, t);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 접근방법
     * 좌측에 있는 문자 t vs 우측에 있는 문자 t , 둘 중 작은 값이 최소 거리
     */
    public static int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int tDistance = 100;
        //좌측
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t){
                tDistance = 0;
            }else{
                tDistance++;
            }
            answer[i] = tDistance;
        }

        //우측
        tDistance = 100;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                tDistance = 0;
            }else{
                tDistance++;
            }
            answer[i]= Math.min(answer[i],tDistance);
        }

       return answer;
    }
}
