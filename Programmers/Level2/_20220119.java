
import java.util.*;

class _20220119 {
    int pos; //u의 length

    public String solution(String p) {
        if (p.isEmpty()) {
            return p;
        }
        boolean correct = isRight(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos, p.length());

        if (correct) { //올바른 문자열 ?
            return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";

        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') {
                answer += ")";
            }else {
                answer += "(";
            }
        }
        return answer;
    }


    public boolean isRight(String str){
        boolean ret = true;
        int left = 0 ,right = 0;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
                stack.push('(');
            }else{
                right++;
                if (stack.isEmpty()) {
                    ret = false;
                }else {
                    stack.pop();
                }
                if (left == right) {
                    pos = i + 1;
                    return ret;
                }
            }
        }
        return true;
    }
}