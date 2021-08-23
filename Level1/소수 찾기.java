class Solution {
    public boolean Prime(int num) {
      boolean isprime = true; 
      if(num==2) return isprime; //2일 때
      else if(num%2==0) return false;
        
      for(int i=2; i*i<=num; i++) { //2보다 큰 홀수의 경우 검사
         if(num%i ==0) {
            isprime = false;
            break;
         }
      }
      return isprime;
   }
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(Prime(i)) answer++;
            else continue;
        }
        return answer;
    }
}