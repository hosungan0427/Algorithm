import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);       //먼저 정렬 -> n번째 단어가 같을 경우 사전 순서대로 정렬하므로 먼저 정렬
        String[] answer = new String[strings.length];

        for(int i =0 ; i < strings.length; i++){
            answer[i] = strings[i].substring(n,n+1); // answer 배열에 string의 n번째 글자를 넣음
        }
        Arrays.sort((answer));  //n번째 글자 기준 정렬

        List<String> list = new ArrayList<>(Arrays.asList(strings));   //list는 문자를 안자르고 정렬한 리스트
        for(int i =0; i<answer.length; i++){
            for(int j=0; j<list.size(); j++){
                if(answer[i].equals(list.get(j).substring(n,n+1))){ //answer의 0번째 인덱스 부터 list의 n번째 값와 동일한 값을 찾기
                    answer[i] = list.get(j);    //자른 값이 같은 list를 answer에 넣음
                    list.remove(list.get(j));   // if문에서 lite의 n자리 문자만 비교하므로 넣어준 list를 제거해야 동일한 list 값이 들어가지 않음
                    break;
                }
            }
        }
        return answer;
    }
}