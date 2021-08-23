import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        int temp;
        
        Map<String,Integer> par=new HashMap<>(); // <key,value>

        for(int i=0; i<participant.length; i++){
            if(par.get(participant[i])==null) //map에 처음 넣는 경우 value : 1
                par.put(participant[i],1);
            else { //이미 map에 있는 경우 
                temp=par.get(participant[i])+1; //key로 value값을 꺼내 1 증가
                par.put(participant[i],temp); // 더한 값으로 value 초기화
            } 
        }
        
        for(int i=0; i<completion.length; i++){ //완주자 명단 탐색
            temp = par.get(completion[i])-1; //완주자 이름인 key의 value를 1 감소
            par.put(completion[i],temp); //감소한 값으로 value 초기화 
        }

        for (String key : par.keySet()) { 
            if(par.get(key)==1) answer=key; //key값이 1인 경우가 답
	    }
        
        return answer;
    }
}