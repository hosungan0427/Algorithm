class Solution {
            public String solution(int num) {
                String answer = "";
                switch (num%2) {
                    case 0:
                        answer = "Even";
                        break;
                    case -1:
                    case 1:
                        answer = "Odd";
                        break;
                }
                return answer;
            }
}