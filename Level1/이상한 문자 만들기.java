class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int now=0;

        for(String temp : arr) {
            now = temp.contains(" ") ? 0 : now + 1;
            answer += now%2 == 0 ? temp.toLowerCase() : temp.toUpperCase(); 
        }
        return answer;
    }
}