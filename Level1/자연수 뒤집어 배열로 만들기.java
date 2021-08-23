class Solution {
    public int[] solution(long n) {
        String stringNum = String.valueOf(n);
        int[] answer = new int[stringNum.length()];
        int temp=0;
        for(int i=stringNum.length()-1; i>=0; i--){
            answer[temp++]=Integer.parseInt(stringNum.substring(i,i+1));
        }
        return answer;
    }
}