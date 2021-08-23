import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
    int answer = 0;
 
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for(int i=0; i<scoville.length; i++)
        heap.offer(scoville[i]); //offer : 큐에 추가

    while(heap.peek() < K){ //peek : 첫 번째 값
        if(heap.size() < 2) return -1;
        int f1 = heap.poll(), f2 = heap.poll(); 
        int newFood = f1 + (f2 * 2);
        heap.offer(newFood);
        answer++;
    }
    return answer;
}
}