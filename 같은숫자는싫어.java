package programmers_1��;
import java.util.*;

public class �������ڴ½Ⱦ�  {
		public int[] solution(int []arr) {
			ArrayList<Integer> temp= new ArrayList<Integer>();
			int flag=10;
	        for(int i=0; i<arr.length; i++){
	            if(flag!=arr[i]) 
	            	temp.add(arr[i]);
	            flag=arr[i];
	        }
	        int [] answer= new int[temp.size()];
	        for(int i=0; i<answer.length; i++) {
	        	answer[i]=temp.get(i).intValue();
	        }
	        return answer;
		}
}
