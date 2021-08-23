class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] all = new int[n+2]; 
        
        for (int i : reserve) 
            all[i]++;

        for (int i : lost)
            all[i]--;
        
        for (int i = 1; i < n+1; i++) {
            if (all[i] == -1) { //i번 째 학생에게 체육복이 없는 경우
                
                if (all[i-1] == 1) { //왼쪽 학생한테 여분의 체육복이 있는 경우
                   all[i-1]--;      //왼쪽 학생에게 체육복을 빌리고 1 감소
                   all[i]++;        //i번 째 학생에게 체육복이 생겼으므로 1 증가
                }
                
                else if (all[i+1] == 1) { //오른쪽 학생한테 여분의 체육복이 있는 경우
                    all[i+1]--;           //오른쪽 학생에게 체육복을 빌리고 1 감소
                    all[i]++;             //i번 째 학생에게 체육복이 생겼으므로 1 증가
                }
            }
            
            if(all[i] != -1) //i번 째 학생에게 체육복이 있는 경우
                answer++;    //answer 1 증가      
        }
        return answer;
    }
}