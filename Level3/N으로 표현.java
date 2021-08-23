class Solution {
    private int n, target;
    private int answer=-1;

    public int solution(int N, int number) { // N=5, number=12
        n = N; //5
        target = number;//12
        dfs(0, 0);        
        return answer;
    }

    private void dfs(int count, int nowValue) { //(0,0)->()
        if (count > 8) { //사칙연산을 최소 8번 수행해도 안되면 dfs 재귀 종료
            answer = -1;
            return;
        }

        if (nowValue == target) { //0==12 -> ==12
            if(answer==-1||answer>count) answer=count;
            return;
        }
        

        int tempN = n; 
        for (int i = 0; i < 8 - count; i++) { //사칙연산 모두 dfs로 수행
            int newCount = count + i + 1;
            dfs(newCount, nowValue + tempN); 
            dfs(newCount, nowValue - tempN); 
            dfs(newCount, nowValue / tempN); 
            dfs(newCount, nowValue * tempN); 

            tempN = tempN * 10 + n; // 5 -> 55 -> 555 -> ...
        }
    }
}