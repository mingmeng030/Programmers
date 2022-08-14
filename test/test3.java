package test;

import java.util.ArrayList;
import java.util.Collections;

public class test3 {
    public int solution(int h, int k, int[] boxes) {
        int answer = 0;
        int[] dp = new int[boxes.length+1];
        int now=0;
        dp[0]=0;

        ArrayList<Integer> sortedBox = new ArrayList<Integer>();
        for(int i=0; i<boxes.length; i++)
            sortedBox.add(boxes[i]);

        Collections.sort(sortedBox);

        for(int i =1; i<=sortedBox.size(); i++){
            if(sortedBox.get(i-1)-now>=k){
                answer++;
                if(dp[i-1]-now>dp[i]-now){
                    dp[i]=dp[i-1];
                }
                else{
                    dp[i]=dp[i-1]+1;
                }
                now=sortedBox.get(i-1);
            }
        }
        if(now+k>=h) return answer;
        else return -1;
    }
}


