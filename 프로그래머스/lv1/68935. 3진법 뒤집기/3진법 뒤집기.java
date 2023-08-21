class Solution {
    public int solution(int n) {
        int answer = 0;
        String num =Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(num);
        String a =String.valueOf(sb.reverse());
        answer = Integer.parseInt(a,3);

        return answer;
    }
}