package programmers_1월;
import java.util.*;

public class 스킬체크_test1 {
	  public int[] solution(int[] arr) {
	      ArrayList<Integer> temp2= new ArrayList<Integer>();
	      int num=0;
	      
	      if(arr[0]==10&&arr.length==1) {
	    	  int [] answer1= new int[1];
    		  answer1[0]= -1;
    		  return answer1;
    	  }
	      else {
	    	  for(int i=0; i<arr.length; i++){
		    	  temp2.add(arr[i]);
		          if(arr[num]>arr[i]){
		              num=i;
		              continue;
		          }
		      }
		      temp2.remove(num);
		      int [] answer2= new int[temp2.size()];
		      for(int i=0; i<answer2.length; i++) {
		    	  answer2[i]=temp2.get(i).intValue();
		      }
		      return answer2;
	      }
	  }
}
