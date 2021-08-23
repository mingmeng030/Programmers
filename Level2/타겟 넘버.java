class Solution {
    static int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers,target,0,0);
        return answer;
    }
    
    public void dfs(int[] numbers,int target,int index,int sum){
        if(index == numbers.length){  //numbers를 모두 탐색했을 때
            if(sum == target) answer++; //총합이 target과 같으면 answer++
            return;
        }
        
        else{
            dfs(numbers,target,index+1,sum+numbers[index]);
            dfs(numbers,target,index+1,sum+(-1 * numbers[index]));       
        }
    }
}