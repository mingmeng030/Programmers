class Solution {
    public int[] solution(int[] arr) {
        int minIndex=0;
        int min=arr[0];
        if(arr.length==1) {
            int[] answer={-1};
            return answer;
        }
        
        int[] answer=new int[arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min) {
                min=arr[i];
                minIndex=i;
            }
        }
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(i==minIndex) continue;
            else answer[j++]=arr[i];
        }
        return answer;
    }
}