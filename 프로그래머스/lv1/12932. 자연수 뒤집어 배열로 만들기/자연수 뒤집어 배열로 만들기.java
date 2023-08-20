class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String num[] = String.valueOf(n).split("");
        answer = new int[num.length];
        for(int i=0; i<num.length; i++){
            answer[i]= Integer.parseInt(num[num.length-1-i]);
        }
        return answer;
    }
}