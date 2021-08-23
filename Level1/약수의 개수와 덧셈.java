class Solution {
    public int divisor(int num){
        int total = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i ==0) total++; 
        }
        return total;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            if(divisor(i)%2==0) answer+=i;
            else if(divisor(i)%2==1) answer-=i;
        }
        return answer;
    }
}