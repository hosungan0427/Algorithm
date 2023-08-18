class Solution{
    public int solution(long num){
        System.out.println(num);
        int cnt =0;
        int answer=0;
            while (!(num == 1)) {
                cnt++;
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                } answer=cnt;
                System.out.println(cnt);
                if (cnt == 500) {
                    answer = -1;
                    break;
                }
            }
        return answer;
        }


    }

