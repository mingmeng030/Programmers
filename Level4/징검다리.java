import java.util.*;
 class Solution {
     public int solution(int distance, int[] rocks, int n) {
         int answer = 0;
         Arrays.sort(rocks);//이분탐색할 때는 정렬을 해야함
         int left=1, right=distance, mid; //mid : 바위사이의 최소 거리,
         int remove=0, lastRock=0;//제거한 바위갯수, 마지막 바위
         while(left<=right){
             mid=(left+right)/2;
             for(int i=0;i<rocks.length;i++){
                 if(mid>rocks[i]-lastRock) remove++;
                 else lastRock=rocks[i];
             }
             if(distance-lastRock<mid) remove++;//마지막바위와 도착지간의 거리 체크

             if(remove>n) right=mid-1;
             else{
                 answer=Math.max(answer, mid);
                 left=mid+1;
             }
             remove=0;
             lastRock=0;
         }
         return answer;
     }
 }