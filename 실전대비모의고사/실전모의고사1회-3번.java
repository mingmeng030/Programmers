import java.util.Stack;
static public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int boxTotal = order.length;
        int boxIndex = 1, orderIndex = 0;

        while (true){
            if (order[orderIndex] != boxIndex && order[orderIndex] > boxIndex) {
                stack.push(boxIndex);
                boxIndex++;
            }
            else if (order[orderIndex] == boxIndex) {
                boxIndex++;
                answer++;
                if(orderIndex + 1 != boxTotal) orderIndex++;
            }
            else if ( !stack.isEmpty() && stack.peek() == order[orderIndex]) {
                stack.pop();
                answer++;
                if(orderIndex + 1 != boxTotal) orderIndex++;
            }
            else break;
        }
        return answer;
    }