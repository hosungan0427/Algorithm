import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for(int i =0; i<score.length; i++ ) {
            if(k>i){
            priorityQueueLowest.add(score[i]);
            answer[i] = priorityQueueLowest.peek();
            } else if (priorityQueueLowest.peek() < score[i]) {
                priorityQueueLowest.poll();
                priorityQueueLowest.add(score[i]);
            }
            answer[i] = priorityQueueLowest.peek();

            }
        return answer;
    }
}