class Solution {
            long[] answer = {};
            public long[] solution(int x, int n) {
                answer = new long[n];
                for(int i=0; i<n; i++){
                    
                    answer[i]= (long)x+(long)x*i;
                }

                return answer;
            }
        }