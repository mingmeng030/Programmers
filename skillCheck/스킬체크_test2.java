package programmers_1��;
import java.util.*;
public class ��ųüũ_test2 {
	public long solution(long n) {
		long answer3 = 0;
		String s1 = "" + n;
	    String[] s = s1.split("");
	    Arrays.sort(s);
	        
	    for(int i=0; i<s.length; i++) {
	    	answer3 += Integer.parseInt(s[i]) * Math.pow(10, i);
	    }
	return answer3;
	}
}