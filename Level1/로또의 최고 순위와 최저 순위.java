import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer=new int[2];
        int zero=0, correct=0;
        
        for(int i=0; i<6; i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            for(int j=0; j<6; j++){
                if(lottos[i]==win_nums[j]) {
                    correct++;
                    continue;
                }
            }
        }
        
        if(correct==0&&zero==0){//0도 없고 하나도 맞은게 없는 경우
            answer[0] = 6;
            answer[1] = 6;
        }
        else{
            int rank=7-correct;
            answer[0] = (rank==1&&zero==0)? rank : rank-zero;            
            answer[1] = (rank>=6)? 6 : rank;
        }
        return answer;
    }
}