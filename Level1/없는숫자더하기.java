class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        
        for(int i=0; i<numbers.length; i++)
            arr[numbers[i]]++;
              
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) 
                answer+=i;
        }
        return answer;
    }
}