package programmers_1��;
import java.util.*;
//DP�� ����.
class VectorOverride extends Vector{
	public void removeRange(int x, int y){
		removeRange(x, y);
	}
}
public class ��ƼĿ������{
	public void removeRange(int x, int y){
		removeRange(x, y);
		}
	public int solution(int sticker[]) {
	        int answer = 36;
	        int n=0;
	        int maxindex=0;
	        VectorOverride v1 = new VectorOverride();
	        for(int i=0;i<=sticker.length ;i++) {
	        	v1.add(i);
	        	if(sticker[i]>n) {
	        		n=sticker[i];
	        		maxindex=i;
	        	}
	        }
	        int start=0;
	        int end=0;
	        while(true) {
	        	if(v1.size()==0) break;
		        for(int i=0;i<=sticker.length ;i++) {
		        	if(sticker[i]>n) {
		        		n=sticker[i];
		        		maxindex=i;
		        	}
		        }
		        start=maxindex-1;
		        end=maxindex+2;
		        v1.removeRange(start,end);
	        }
	        

	        return answer;
	    }
	//fromIndex (�̰��� �����Ѵ�) ~ toIndex (�̰��� �������� �ʴ´�)
//protected void removeRange(int fromIndex, int toIndex) 

	public static void main(String[] args) {
		Scanner scan2=new Scanner(System.in);
		int N=scan2.nextInt();
		int K=scan2.nextInt();
		StringBuilder SB = new StringBuilder();
		
		
		int now=K-1; //���� ��ġ==now
		while(true) {
			SB.append(v.get(now));
			v.remove(now);
			if(v.size()==0) break;
			SB.append(", ");
			now+=K-1;
			now%=v.size();
		}
		System.out.println("<"+SB+">");
	}
}