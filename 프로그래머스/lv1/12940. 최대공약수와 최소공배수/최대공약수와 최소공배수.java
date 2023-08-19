class Solution {
    public int[] solution(int n, int m) {
        int LCM;
        int original_n=n;
        int original_m=m;
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;

        }
        LCM= original_m*original_n / n;

        return  new int[]{n, LCM};
    }
}