class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int temp=b-1;
        String[] day={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<a-1; i++)
            temp+=month[i];
        
        answer+=day[temp%7];
        return answer;
    }
}