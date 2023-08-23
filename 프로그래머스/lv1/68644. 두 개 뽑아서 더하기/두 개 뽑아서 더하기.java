import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        int temp =0;
        Arrays.sort(numbers);
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j =i+1; j<numbers.length; j++){
                temp=numbers[i]+numbers[j];
                if(!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
            
        
        return answer;
    }
}