import java.util.Arrays;
class Solution {
    static int answer = 0;
    static int []visited;
    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer=cnt;
            return;
        }
        for(int i=0; i<words.length; i++){
            if(visited[i]==1) continue;
            
            int k=0;

            for (int j = 0; j < begin.length(); j++)
                if(begin.charAt(j) == words[i].charAt(j)) k++;
            
            if(k == begin.length() - 1) {
                visited[i]=1;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = 0;
            }
        }
    }
    public int solution(String begin, String target, String[] words) {
        visited=new int[words.length];
        
        if(!Arrays.asList(words).contains(target))return 0;
        dfs(begin, target, words, 0);
        
        return answer;
    }
}