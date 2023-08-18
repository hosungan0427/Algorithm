import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        String[] num= phone_number.split("");
        for(int i=0; i<num.length-4; i++){
            num[i] = "*";
        }
        String answer = String.join("",num);
        return answer;
    }
}