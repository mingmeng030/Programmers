class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = (n<=m)? n : m;
        int max = (n>=m)? n : m;
        
        for(int i=min; i>=1; i--){
            if(n%i==0&&m%i==0){
                answer[0]=i;
                break;
            }
        }
        
        for(int i=max; i<=n*m; i++){
            if(i%n==0&&i%m==0){
                answer[1]=i;
                break;
            }
        }
        return answer;
    }
}