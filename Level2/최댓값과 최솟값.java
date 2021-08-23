import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] s_arr = s.split(" ");
 
        for(int i=0; i<s_arr.length; i++) 
            list.add(Integer.parseInt(s_arr[i]));
 
        answer+=Collections.min(list)+" "+Collections.max(list);
        return answer;
    }
}