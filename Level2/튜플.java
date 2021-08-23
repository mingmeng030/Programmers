import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        Map<String, Integer> temp = new HashMap<>(); // (k,v)
        s = s.replace("{","");
        s = s.replace("}","").trim();
        String[] sarr = s.split(",");
        
        for(int i=0; i<sarr.length; i++){
            int count = temp.containsKey(sarr[i]) ? temp.get(sarr[i])+1 : 1; 
            temp.put(sarr[i],count); 
        }
        
        List<String> keySetList = new ArrayList<>(temp.keySet());
        Collections.sort(keySetList, (o1, o2) -> (temp.get(o2).compareTo(temp.get(o1))));
	    int[] answer = new int[temp.size()];
        int i=0;
        for(String key : keySetList) {
            answer[i] = Integer.parseInt(key);
            i++;
        }
        return answer;
    }
}