import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
                    
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')  stack.push('(');// 현재 (가 들어갈 자리면 스택에 넣는다.
    
            else{
                if(stack.isEmpty()) return false;// 현재 )가 들어갈 자리인데 스택이 비어있을경우 -> false
                else    stack.pop();// 현재 )가 들어갈 상태에서 스택에 괄호('(')가 있는경우 -> pop
            }
        }
        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
}