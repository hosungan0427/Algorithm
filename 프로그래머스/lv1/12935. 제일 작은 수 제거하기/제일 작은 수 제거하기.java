class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        if(arr.length==1){
            answer = new int[]{-1};
            return answer;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
         answer = new int[arr.length-1];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(!(arr[i]==min)){
                answer[j]=arr[i];
                j++;
            }
        }

        return answer;
    }
}