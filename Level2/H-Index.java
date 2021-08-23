import java.util.Arrays; 
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // [0, 1, 3, 5, 6]
        int answer=0;
        
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 6-5-3-1-0
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}