import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num);
        StringBuilder rvnum = new StringBuilder();
        for(String i : num){
            rvnum.append(i);
        }
        answer = Long.parseLong(rvnum.reverse().toString());

        return answer;
    }
}