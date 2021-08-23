class Solution {
    public int solution(int n) {
        int answer = 0, num1=0;
        String binary1 = Integer.toBinaryString(n); 
        
        for(int i=0; i<binary1.length(); i++) {
            if(binary1.charAt(i)=='1') num1++;
        }
        
        for(int i =n+1;i<1000000;i++){
            String binary2 = Integer.toBinaryString(i);
            int num2=0;

            for(int j=0; j<binary2.length(); j++) {
                if(binary2.charAt(j)=='1') num2++;
            }
            
            if(num1==num2) {
                answer=i;
                break;
            }
        }
        return answer;
    }
}