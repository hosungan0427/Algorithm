class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxrow = 0;
        int maxcolumn = 0;
        for(int i =0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp=sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1]= temp;
            }
            if(sizes[i][0]>maxrow){
                maxrow=sizes[i][0];
            }
            if(sizes[i][1]>maxcolumn){
                maxcolumn=sizes[i][1];
            }
        }
        return maxrow * maxcolumn;
    }
}