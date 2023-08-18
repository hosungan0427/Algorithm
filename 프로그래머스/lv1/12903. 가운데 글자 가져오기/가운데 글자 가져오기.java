class Solution {
    public String solution(String s) {
        String answer ;
        char[] arr = s.toCharArray();
        if(s.length()%2==1){
            answer = String.valueOf(arr[s.length()/2]);
        }else {
            answer = arr[s.length() / 2-1] +
                    String.valueOf(arr[s.length()/2]);
        }
        System.out.println();
        return answer;
    }
}