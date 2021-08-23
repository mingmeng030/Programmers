class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max=0,min=0;
        if(a>b){
            max=a;
            min=b;
        }
        else if(b>a){
            max=b;
            min=a;
        }
        else if(a==b) return a;
        
        for(int i=min; i<=max; i++)
            answer+=i;
        
        return answer;
    }
}