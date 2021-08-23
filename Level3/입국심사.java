import java.util.Arrays;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long min=1, max=(long)times[times.length-1]*n;
        long answer = max;

        while(min<=max){
            long mid=(min+max)/2, sum=0;
            
            for(int i=0; i<times.length; i++)
                sum+=mid/times[i];
            
            if(sum>=n){
                if(answer>mid) answer=mid;
                max=mid-1;
            }
            else min=mid+1;
        }
        return answer;
    }
}