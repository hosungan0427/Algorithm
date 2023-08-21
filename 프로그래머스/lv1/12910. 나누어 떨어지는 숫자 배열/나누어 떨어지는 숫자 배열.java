import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer>list = new ArrayList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                list.add(j);
            }

        }
        Collections.sort(list);
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
        }
    }