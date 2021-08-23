import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] d, int budget) {
        int total=0, answer = 0, maxnum=0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int temp : d){
            arrayList.add(temp);
            total+=temp;          
        }
        if(total<=budget) return d.length; //총 신청 금액이 예산 이하인 경우
        
        Collections.sort(arrayList);
        for(int i=0; i<d.length; i++){
            if( (maxnum+arrayList.get(i)) <=budget){
                maxnum+=arrayList.get(i);
                answer++;
            }
            else break;
        }
        
        return answer;
    }
}