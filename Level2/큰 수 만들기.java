import java.util.StringTokenizer;
import java.util.HashMap;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0, now = 0;
        
        for(int i=0; i<number.length()-k; i++){ // 0-5
            now = 0;
            for(int j=index; j<=i+k; j++){ // 0-(5 6 7 8 9 10)
                if(now < number.charAt(j)-'0'){
                    now = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(now);
        }
        return sb.toString();
    }
}