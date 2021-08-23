import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int index=0;
        int [] answer;
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) {
                list.add(arr[i]);
                index++;
            }
        }
        Collections.sort(list);
        if(index==0) {
            answer=new int[1];
            answer[0]=-1;
        }
        else answer=list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}