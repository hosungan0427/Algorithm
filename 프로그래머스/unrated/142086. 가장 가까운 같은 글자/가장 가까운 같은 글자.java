// s를 split를 이용해 잘라 한글자씩 배열로 만들었다.
// 만든 list를 하나씩 temp에 넣고 list의 다른 값들을 비교하여 넣어 temp와 list가 동일한 값이 있으면 그 차만큼을 answer배열에 넣어주었다. 
// 뒤의 문자를 비교하면 안되므로 비교하는 범위는 list에서 검색하는 인덱스보다 적어야 될것이다.
// 문자열에서 한번만 쓰였을 경우 if문이 성립하지 않기 때문에 answer에 주어진 값 -1값을 넣어줬다.
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