import java.util.*;
class Solution {
    public int[] solution(int[] enter, int[] leave) {
        int[] answer = new int[enter.length];
        ArrayList<Integer> occupant = new ArrayList<>();
        Queue<Integer> enterQueue = new LinkedList<>();
        Queue<Integer> leaveQueue = new LinkedList<>();

        for(int i : enter) enterQueue.add(i-1);
        for(int i : leave) leaveQueue.add(i-1);

        while(!leaveQueue.isEmpty()){
            int turn = leaveQueue.peek();	// 이번에 퇴실 해야하는 사람 == turn
            if(occupant.contains(turn)) {	// list에 현재 입실한 사람 중 turn이 포함된 경우
                leaveQueue.remove();	// 퇴실순서가 담긴 queue에서 turn 제거
                occupant.remove(Integer.valueOf(turn));	// list에서 turn 제거
                Iterator<Integer> iter = occupant.iterator();	// 남은 사람 탐색을 위해 list로 iterator 생성
                while(iter.hasNext()){
                    answer[iter.next()]++;	// list에 남은 사람은 방금 나간 사람을 무조건 마주쳤으므로 차례로 1 증가
                    answer[turn]++;		// turn은 list에 남은 사람들을 모두 무조건 마주쳤으므로 탐색할 때마다 1증가
                }
            }
            // list에 현재 입실한 사람 중 turn이 포함되지 않은 경우 
            // 입실 순서가 담긴 queue에서 가장 먼저 보관한 값을 꺼내(poll) list에 저장한다.
            else occupant.add(enterQueue.poll());
        }
        return answer;
    }
}