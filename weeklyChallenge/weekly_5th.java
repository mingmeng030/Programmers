class Solution {
    public int solution(String word) {
        int answer = 0, base = 781;
        char list[] = {'A', 'E', 'I', 'O', 'U'};
        
        for(int i=0; i<word.length(); i++){
            for(int j=0; j<5; j++){
                if(list[j]==word.charAt(i))
                    answer+=1+j*base;
            }
            base=(base-1)/5;
        }
        return answer;
    }
}