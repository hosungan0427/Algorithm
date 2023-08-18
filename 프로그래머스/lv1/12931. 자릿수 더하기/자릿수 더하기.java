import java.util.*;

class Solution {
            public int solution(int n) {
                int answer = 0;
                while(n>0){
                    int remainde=n%10;
                    n/=10;
                    answer+=remainde;
                }
                // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
                System.out.println("Hello Java");

                return answer;
            }
        }