class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        boolean[] checkFromLeft= new boolean[10001];
        int[] toppingFromRight= new int[10001];

        int leftCount = 0, rightCount= 0;

        for(int i=topping.length-1; i>=0; i--){
            if(toppingFromRight[topping[i]] == 0) rightCount++;
            toppingFromRight[topping[i]]++;
        }

        for(int i=0; i<topping.length-1; i++){
            if(!checkFromLeft[topping[i]]) {
                checkFromLeft[topping[i]] = true;
                leftCount++;
            }
            toppingFromRight[topping[i]] --;
            if(toppingFromRight[topping[i]] == 0)  rightCount--;
            if(leftCount == rightCount ) answer++;
        }
        return answer;
    }
}