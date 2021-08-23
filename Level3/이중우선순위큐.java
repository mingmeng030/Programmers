import java.util.Comparator;
import java.util.PriorityQueue;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> PQMax=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> PQMin=new PriorityQueue<>();

        for (String operation : operations) {
            String[] splitOper = operation.split(" ");

            if (splitOper[0].equals("I")) {
                PQMax.add(Integer.parseInt(splitOper[1]));
                PQMin.add(Integer.parseInt(splitOper[1]));
            }

            if (splitOper[0].equals("D")&&!PQMax.isEmpty()) {
                if (splitOper[1].equals("1")) {
                        int max = PQMax.peek();
                        PQMax.remove(max);
                        PQMin.remove(max);

                } else {
                        int min = PQMin.peek();
                        PQMax.remove(min);
                        PQMin.remove(min);
                }
            }
        }
        if (!PQMax.isEmpty()) {
            answer[0] = PQMax.peek();
            answer[1] = PQMin.peek();
        }
        return answer;
    }
}