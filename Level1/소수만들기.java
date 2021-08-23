class Solution {
    public boolean Prime(int num) {
      boolean check = true; 
      if(num==2) return check; //2일 때
         
      for(int i=2; i<num; i++) { //2보다 큰 경우 검사
         if(num%i ==0) {
            check = false;
            break;
         }
      }
      return check;
   }
   public int solution(int[] nums) {
      int answer = 0;
      boolean isprime = false;

      for (int i = 0; i < nums.length-2; i++) {
         for (int j = i + 1; j < nums.length-1; j++) {
            for (int k = j + 1; k < nums.length; k++) {
               int testnum = nums[i] + nums[j] + nums[k]; // 값을 담아
               if (testnum >= 2) isprime = Prime(testnum); // 2이상인 값 소수 검사
               if (isprime == true) answer++; 
            }
         }
      }
      return answer;
   }
}