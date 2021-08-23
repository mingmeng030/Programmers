import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<String>();
            
        for (int i=0; i<strings.length; i++) 
            list.add(strings[i].charAt(n) + strings[i]);
        
        Collections.sort(list);
        
        for (int i=0; i<list.size(); i++) 
            answer[i] = list.get(i).substring(1); //1부터 마지막까지 잘라서 복사
        
        return answer;
    }
}