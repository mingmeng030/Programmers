package programmers_1월;
import java.util.*;

class 순열검사 {
    public boolean solution(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==i+1) continue;
            else{
                answer=false;
                break;
            }
        }
        return answer;
    }
}