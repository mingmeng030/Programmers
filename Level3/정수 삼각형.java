class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int DP[][]=new int[triangle.length][triangle.length];
        DP[0][0]=triangle[0][0];
        
        for(int i=1; i<triangle.length; i++){ //[i][0]과 [i][i] 값 초기화
            DP[i][0]=DP[i-1][0]+triangle[i][0];
            DP[i][i]=DP[i-1][i-1]+triangle[i][i];
        }
        
        for(int i=2; i<triangle.length; i++){
            for(int j=1; j<i; j++)
                DP[i][j]=Math.max(DP[i-1][j-1],DP[i-1][j])+triangle[i][j];
        }
        
        for(int i=0; i<DP.length; i++)
            answer=Math.max(answer,DP[DP.length-1][i]);
        
        return answer;
    }
}