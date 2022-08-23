import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] hamburger = {1,2,3,1};
             
        for(int i=0; i<ingredient.length; i++){
            stack.addLast(ingredient[i]); //뒤에 추가
            if(stack.size()>=4){
                Deque<Integer> tmp = new ArrayDeque<>();
                //stack의 뒤에서부터 하나씩 꺼내 tmp의 맨 앞의로 하나씩 추가
                for(int j=0; j<4; j++)
                    tmp.addFirst(stack.pollLast()); 
                
                // tmp deque와 hamburger배열 내 요소가 동일한지 검사
                Iterator iter = tmp.iterator();
                int idx=0;
		        while(iter.hasNext()){
                    if((int)(iter.next())!=hamburger[idx]) break;
                    idx++;
                }
                // 햄버거 만들 수 있음
                if(idx==4) answer++;
                // 햄버거 만들 수 없음
                else{ // tmp의 맨 앞부터 하나씩 꺼내 stack 맨 뒤에 추가
                    for(int j=0; j<4; j++)
                        stack.addLast(tmp.pollFirst());
                }
            }
        }
        return answer;
    }
}