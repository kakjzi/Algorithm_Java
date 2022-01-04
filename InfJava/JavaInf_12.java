import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInf_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(solution(n,str));
    }

    /**
     * 접근방식
     * # -> 1 ,   * ->0 ,항상 대문자 ,7자씩 끊어서
     * 이진수-> 10진수 -> 아스키코드로 문자만들어 반환
     */
    public static String solution(int n, String str){
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i< n; i++){
            //# -> 1 ,* ->0 ,7자씩 끊어서
            String tempStr = str.substring(0,7).replace('#', '1').replace('*', '0');

            //이진수-> 10진수 -> 아스키코드로 문자 반환
            int num = Integer.parseInt(tempStr, 2);
            answer.append((char) num);

            str = str.substring(7);
        }

        return answer.toString();
    }
}
