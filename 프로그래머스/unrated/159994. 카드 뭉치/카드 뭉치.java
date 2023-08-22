import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        List<String> card1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2 = new ArrayList<>(Arrays.asList(cards2));
        List<String> del_goal = new ArrayList<>(Arrays.asList(goal));
        for(int i =0 ; i<goal.length; i++){
            if (card1.size()>0){
                if(del_goal.get(0).equals(card1.get(0))) {
                card1.remove(0);
                del_goal.remove(0);
                }
            }
            if(card2.size()>0){
                if (del_goal.get(0).equals(card2.get(0))) {
                    card2.remove(0);
                    del_goal.remove(0);
                }
            }
            if(del_goal.size()==0){
                return "Yes";
            }
        }return "No";
    }
}