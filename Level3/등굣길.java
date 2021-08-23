class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int DP[][]=new int[n+1][m+1];
        DP[1][1]=1; 
        
        for(int i=0; i<puddles.length; i++)
            DP[puddles[i][1]][puddles[i][0]]=-1;
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(DP[i][j]==-1) continue;
                if(i-1>0 && DP[i-1][j] != -1) DP[i][j] += DP[i-1][j]%1000000007;
        		if(j-1>0 && DP[i][j-1] != -1) DP[i][j] += DP[i][j-1]%1000000007;
            }
        }
        return DP[n][m]%1000000007;
    }
}