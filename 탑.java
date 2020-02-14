package programmers_2¿ù;
public class Å¾ {
	    public static int[] solution(int[] heights) {
	        int[] answer = new int[heights.length];
	        for(int i=heights.length-1; i>=0; i--){
	            if(i==0) {
	                answer[i]=0;
	                break;
	            }
	            for(int j=i-1; j>=0; j--){
	                if(j==0&&heights[j]<=heights[i]) answer[i]=0;
	                else if(heights[j]>heights[i]){
	                    answer[i]=j+1;
	                    break;
	                }
	                else continue;
	            }
	        }
	        return answer;
	    }
}
