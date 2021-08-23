import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(seoul));
        String answer = "김서방은 "+list.indexOf("Kim")+"에 있다";
        return answer;
    }
}