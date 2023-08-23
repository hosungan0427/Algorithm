class Solution {
    public int[] solution(String s) {
        
        String temp ;
        String[]list = s.split("");
        int[] answer = new int[list.length];
        for(int i=0; i<list.length; i++){
            temp=list[i];
            answer[i] = -1;
            for(int j=0; j<i; j++){
                if(list[j].equals(temp)){
                    answer[i]=i-j;
                }
            }
            
        }
        return answer;
    }
}