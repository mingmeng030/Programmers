class Solution {
    public int solution(int n) {
        int answer = n-1;
        int div = n-2;
        
        while(div>0){
            if(n%div==1) answer = div;
            div--;
        }
        return answer;
    }
}