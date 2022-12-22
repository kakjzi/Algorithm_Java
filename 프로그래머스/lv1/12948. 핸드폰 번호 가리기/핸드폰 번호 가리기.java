import java.util.*;

class Solution {
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=[0-9]{4})", "*");
    }
}