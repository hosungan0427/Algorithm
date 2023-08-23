import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public String solution(int[] food) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(0);
        for(int i=food.length-1; i>0; i--){
            for(int j=0; j<food[i]/2; j++){
                dq.addFirst(i);
                dq.add(i);
            }
        }
    String answer =    Arrays.toString(dq.toArray()).replace((","),("")).replace(("["),("")).replace(("]"),("")).replace((" "),(""));


        return answer;
    }
}