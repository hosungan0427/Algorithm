import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] P1 = {1, 2, 3, 4, 5};
        int[] P2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] P3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (P1[i%5] == answers[i]) {
                cnt1++;
            }
            if (P2[i%8] == answers[i]) {
                cnt2++;
            }
            if (P3[i%10] == answers[i]) {
                cnt3++;
            }
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == cnt1) list.add(1);
        if (max == cnt2) list.add(2);
        if (max == cnt3) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);

        }
        return answer;
    }
}