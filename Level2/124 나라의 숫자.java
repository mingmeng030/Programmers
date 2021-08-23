class Solution {
    public String solution(int n) {
        String[] temp={"4","1","2"};
        String answer = "";
        
        while(n>0){
            int remain=n%3;
            n/=3;

            if(remain==0) n--;
            
            answer = temp[remain]+answer;
        }
        return answer;
    }
}