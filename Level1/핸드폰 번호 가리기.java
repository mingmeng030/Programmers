class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int temp=0;
        for(int i=phone_number.length()-1; i>=0; i--){
            if(temp>=4) answer="*"+answer;
            else answer=phone_number.substring(i,i+1)+answer;
            temp++;
        }
        return answer;
    }
}