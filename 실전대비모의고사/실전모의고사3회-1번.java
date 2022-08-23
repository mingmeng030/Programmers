class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int now=n;
        while(true){
            if(now<a) break;
            int quotient = now/a;
            int remainder = now%a;
            now = quotient*b+remainder;
            answer+=quotient*b;
        }
        return answer;
    }
}