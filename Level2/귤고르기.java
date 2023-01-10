import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int n : tangerine){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((o1,o2) -> map.get(o2)-map.get(o1));

        for(int i=0; i<tangerine.length; i++){
            k-=map.get(list.get(i));
            answer++;
            if(k==0||k<0) break;
        }
        return answer;
    }
}