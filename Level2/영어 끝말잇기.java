import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        ArrayList<String> list=new ArrayList<String>();

        for(int i=0; i<words.length; i++){
            if(i>0&&words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)||list.contains(words[i])){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            } 
            else list.add(words[i]);
        }
        return answer;
    }
}