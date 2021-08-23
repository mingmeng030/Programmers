import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int success = stages.length;
        int[] now_stage = new int[N+2];
        
        for(int i=0; i<stages.length ; i++)
            now_stage[stages[i]]++;
        
        double [][]failure = new double[N][2];
        
        for(int i=1; i<now_stage.length-1; i++){
            // 도달한 사용자 수가 0 일때, 실패율도 0
            if(now_stage[i] == 0) failure[i-1][0]=0;
            else failure[i-1][0] = (double)now_stage[i]/success;
            failure[i-1][1] = i;
            success-=now_stage[i];
        }
        
        Arrays.sort(failure, (o1, o2) -> Double.compare(o2[0], o1[0]));
            
        for(int i=0; i<failure.length; i++)
            answer[i] = (int)failure[i][1];
        
        return answer;
    }
}