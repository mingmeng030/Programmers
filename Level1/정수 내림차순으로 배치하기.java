import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        String answer="";
        String s = String.valueOf(n); //n을 문자열로 변환해 저장
        ArrayList<Long> list = new ArrayList<Long>();

        for(int i=0; i<s.length(); i++)
            list.add(Long.parseLong(s.substring(i,i+1)) );
        
        Collections.sort(list,Collections.reverseOrder()); 
        
        for(long x : list) 
            answer+=String.valueOf(x);
        
        return Long.parseLong(answer); //문자열 answer을 Long으로 변환 후 반환
    }
}