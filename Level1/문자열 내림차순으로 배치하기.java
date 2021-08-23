import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] carr = s.toCharArray(); 
        Arrays.sort(carr); 
        StringBuilder sb =new StringBuilder(new String(carr));
        return sb.reverse().toString();
    }
}