package programmers_1��;

public class ���ڼ��ڼ�  {
	  public String solution(int n) {
	      String answer = "";
	      for(int i=0; i<n/2; i++){
	              answer+="����";
	          }
	      if(n%2!=0){
	    	  answer+="��";
	      }
	      return answer;
	  }
}
