class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char[] ch = t.toCharArray();
        Long intp = Long.parseLong(p);
        long[] num = new long[t.length()-p.length()+1];
        for(int i=0; i<num.length; i++){
            StringBuilder sb = new StringBuilder();
            for( int j=i; j<i+p.length(); j++){
               sb.append(ch[j]);
            }
            num[i] = Long.parseLong(sb.toString());
            if(num[i]<=intp){
                answer++;
            }

        }

        return answer;
    }
}