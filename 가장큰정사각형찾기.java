package programmers_2월;
import java.util.*;
public class 가장큰정사각형찾기{
    int [][] result= new int[1001][1001];

    public int solution(int [][]board){
    	int answer=0;
    	int row=board.length;
    	int col=board[0].length;
    	for(int i=1; i<=row; ++i) {
    		for(int j=1; j<=col; ++j) {
    			if(board[i-1][j-1]!=0) {
    				result[i][j]=Math.min(result[i-1][j],
    						Math.min(result[i][j-1],result[i-1][j-1]))+1;
    				answer=Math.max(answer,result[i][j]);
    			}
    		}
    	}
        return answer*answer;
    }
}
