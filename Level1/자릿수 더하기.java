import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String stringNum = Integer.toString(n); //정수 문자열로 전환
        for(int i=0; i<stringNum.length(); i++) //문자열 길이 만큼 반복
            //i번째 문자를 parseInt를 통해 정수로 바꾸고 answer에 더함
            //s.substring(i,j) : 문자열 s의 인덱스 i부터 j-1까지를 substring으로 반환
            answer+=Integer.parseInt(stringNum.substring(i,i+1));
        return answer;
    }
}